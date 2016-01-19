package com.trademe.test.adapers;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.trademe.test.R;
import com.trademe.test.TradeMeApp;
import com.trademe.test.activities.SubCategoryListActivity;
import com.trademe.test.fragments.SubcategoryListFragment;
import com.trademe.test.models.categoryModels.Subcategory_;

import java.util.List;

/**
 * Created by alexanderparra on 17/01/16.
 */
public class SubcategoriesListAdapter extends RecyclerView.Adapter<SubcategoriesListAdapter.ViewHolder> {

    private boolean mTwoPane;
    private List<Subcategory_> mValues;

    public SubcategoriesListAdapter(List<Subcategory_> items, boolean mTwoPane){
        mValues = items;
        this.mTwoPane = mTwoPane;
    }

    @Override
    public SubcategoriesListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list_content, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final SubcategoriesListAdapter.ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mContentView.setText(mValues.get(position).getName());
        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mTwoPane) {
                    Toast.makeText(TradeMeApp.getContext(),"No implemeted yet! - Landscape Orientation",Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(TradeMeApp.getContext(), "No implemeted yet! - Portrait Orientation", Toast.LENGTH_SHORT).show();
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
        public Subcategory_ mItem;

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
