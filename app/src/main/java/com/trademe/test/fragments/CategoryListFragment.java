package com.trademe.test.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
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
import com.trademe.test.models.categoryModels.Root;
import com.trademe.test.models.categoryModels.Subcategory;
import com.trademe.test.retrofit.SyncService;

import java.util.List;

import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;


public class CategoryListFragment extends Fragment {
    private View view;
    private Subscription rxSubscription;
    private ProgressBar progressBar;
    private boolean mTwoPane;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(false);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_category_list, container, false);
        progressBar = (ProgressBar) view.findViewById(R.id.progressBar);
        progressBar.setVisibility(View.VISIBLE);
        if (view.findViewById(R.id.item_detail_container) != null) {
            mTwoPane = true;
        }

        return view;
    }

    private void pullService(){
        rxSubscription = SyncService.pullDataFromService().observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Root>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(Root root) {
                        TradeMeApp.setList(root);
                        setupAdapterRecyclerView(setupRecyclerView(), root.getSubcategories());

                    }
                });
      }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            TradeMeApp.setFirstTime(false);
            CategoryListFragment fragment = new CategoryListFragment();
            getActivity().getSupportFragmentManager().beginTransaction()
                   .replace(R.id.frag_container, fragment)
                    .commit();
            ((CategoryListActivity)getActivity()).getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(false);
            ((CategoryListActivity)getActivity()).getSupportActionBar().setHomeButtonEnabled(false);

            return true;
        }
        return super.onOptionsItemSelected(item);
    }
     private RecyclerView setupRecyclerView(){
         RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.item_list);
         assert recyclerView != null;
         recyclerView.setHasFixedSize(true);
         recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
         recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayoutManager.VERTICAL));
         progressBar.setVisibility(View.GONE);
         return recyclerView;
     }

    private void setupAdapterRecyclerView(@NonNull RecyclerView recyclerView, List<Subcategory> subcategories) {
        recyclerView.setAdapter(new CategoriesListAdapter(subcategories, mTwoPane));
    }

    @Override
    public void onResume() {
        super.onResume();
        if(TradeMeApp.isFirstTime())
            pullService();
        else
            setupAdapterRecyclerView(setupRecyclerView(), TradeMeApp.getList().getSubcategories());

        ActionBar actionBar =  ((CategoryListActivity)getActivity()).getSupportActionBar();
        if (actionBar != null)
            actionBar.setDisplayHomeAsUpEnabled(false);

        if(mTwoPane){

        }

    }

    @Override
    public void onPause() {
        super.onPause();
        if(rxSubscription != null)
            rxSubscription.unsubscribe();
    }
}
