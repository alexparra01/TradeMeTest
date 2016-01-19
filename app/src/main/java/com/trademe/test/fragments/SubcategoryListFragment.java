package com.trademe.test.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.trademe.test.R;
import com.trademe.test.TradeMeApp;
import com.trademe.test.Utils.DividerItemDecoration;
import com.trademe.test.activities.SubCategoryListActivity;
import com.trademe.test.adapers.SubcategoriesListAdapter;
import com.trademe.test.models.categoryModels.Subcategory;
import com.trademe.test.models.categoryModels.Subcategory_;

import java.util.List;




public class SubcategoryListFragment extends Fragment {

    boolean mTwoPane;
    private Subcategory list;
    private final String subCatList = "Subcategory_list";

    public SubcategoryListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        if (getArguments().containsKey(subCatList))
            list = (Subcategory) getArguments().get(subCatList);


    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_subcategory_list, container, false);
        if (view.findViewById(R.id.item_detail_container) != null) {
            mTwoPane = true;
        }
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.item_list);
        assert recyclerView != null;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayoutManager.VERTICAL));
        setupAdapterRecyclerView(recyclerView,list.getSubcategories());

       return view;
    }
    private void setupAdapterRecyclerView(@NonNull RecyclerView recyclerView, List<Subcategory_> subcategories) {
        recyclerView.setAdapter(new SubcategoriesListAdapter(subcategories, mTwoPane));
    }

    @Override
    public void onResume() {
        super.onResume();
        ActionBar actionBar = ((SubCategoryListActivity)getActivity()).getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
}
