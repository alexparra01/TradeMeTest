package com.trademe.test.fragments;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.trademe.test.R;
import com.trademe.test.TradeMeApp;
import com.trademe.test.Utils.DividerItemDecoration;
import com.trademe.test.activities.CategoryListActivity;
import com.trademe.test.adapers.CategoriesListAdapter;
import com.trademe.test.adapers.SearchListAdapter;
import com.trademe.test.models.categoryModels.Subcategory;
import com.trademe.test.models.searchModels.Search;
import com.trademe.test.retrofit.SyncService;

import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;


public class SearchListFragment extends Fragment {
    private View view;
    private Subscription rxSubscription;
    private ProgressBar progressBar;
    private static String SEARCH ="search";
    private String query;
    private boolean mTwoPane;


    public SearchListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

        if(savedInstanceState == null){
            searchService();
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_search_list, container, false);

        if (view.findViewById(R.id.item_detail_container) != null)
            mTwoPane = true;
        query = getArguments().getString(SEARCH);
        progressBar = (ProgressBar) view.findViewById(R.id.searchProgressBar);
        progressBar.setVisibility(View.VISIBLE);
        searchService();
        return view;
    }
    private void setupAdapterRecyclerView(@NonNull RecyclerView recyclerView, List<com.trademe.test.models.searchModels.List> ads_list) {
        recyclerView.setAdapter(new SearchListAdapter(ads_list, mTwoPane));
    }
    private void searchService (){
        rxSubscription = SyncService.searchFromService(query)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Search>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Search search) {
                        TradeMeApp.setSearchList(search);
                        setupAdapterRecyclerView(setupRecyclerView(),search.getList());
                        progressBar.setVisibility(View.GONE);
                    }
                });
    }

    @Override
    public void onResume() {
        super.onResume();
        ActionBar actionBar =  ((CategoryListActivity)getActivity()).getSupportActionBar();
        if (actionBar != null)
            actionBar.setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public void onPause() {
        super.onPause();
        if(rxSubscription != null)
            rxSubscription.unsubscribe();
    }

    private RecyclerView setupRecyclerView(){
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.item_list);
        assert recyclerView != null;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayoutManager.VERTICAL));
        return recyclerView;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            TradeMeApp.setFirstTime(false);
            getActivity().getSupportFragmentManager().popBackStack();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
