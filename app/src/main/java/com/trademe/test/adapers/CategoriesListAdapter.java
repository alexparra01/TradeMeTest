package com.trademe.test.adapers;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.trademe.test.TradeMeApp;
import com.trademe.test.activities.SubCategoryListActivity;
import com.trademe.test.activities.CategoryListActivity;
import com.trademe.test.R;
import com.trademe.test.fragments.SubcategoryListFragment;
import com.trademe.test.models.categoryModels.Subcategory;

import java.util.List;

/**
 * Created by alexanderparra on 16/01/16.
 */
public class CategoriesListAdapter extends RecyclerView.Adapter<CategoriesListAdapter.ViewHolder> {

        private boolean mTwoPane;
        private List<Subcategory> mValues;
        public static final String LIST_TO_SUBCATEGORIES = "list_to_subcategories";
        private static final String subCatList = "Subcategory_list";
        private Subcategory list_sub = new Subcategory();

        public CategoriesListAdapter(List<Subcategory> items,Boolean mTwoPane ) {
            mValues = items;
            this.mTwoPane = mTwoPane;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_list_content, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position) {
            holder.mItem = mValues.get(position);
            holder.mContentView.setText(mValues.get(position).getName());
            holder.mView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mTwoPane) {
                        TradeMeApp.setFirstTime(false);
                        list_sub.setSubcategories(mValues.get(position).getSubcategories());
                        Bundle args= new Bundle();
                        args.putSerializable(subCatList,list_sub);
                        SubcategoryListFragment fragment = new SubcategoryListFragment();
                        fragment.setArguments(args);
                        ((CategoryListActivity)v.getContext()).getSupportFragmentManager().beginTransaction()
                                .replace(R.id.item_detail_container, fragment)
                                .commit();
                    } else {
                        Context context = v.getContext();
                        Intent intent = new Intent(context, SubCategoryListActivity.class);
                        list_sub.setSubcategories(mValues.get(position).getSubcategories());
                        intent.putExtra(CategoriesListAdapter.LIST_TO_SUBCATEGORIES, list_sub);
                        context.startActivity(intent);
                    }
                }
            });
        }

        @Override
        public int getItemCount() {
            return mValues.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            public final View mView;
            public final TextView mContentView;
            public Subcategory mItem;

            public ViewHolder(View view) {
                super(view);
                mView = view;
                mContentView = (TextView) view.findViewById(R.id.trademe_subcategory);
            }

            @Override
            public String toString() {
                return super.toString() + " '" + mContentView.getText() + "'";
            }
        }


}
