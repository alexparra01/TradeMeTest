package com.trademe.test.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.trademe.test.R;
import com.trademe.test.TradeMeApp;
import com.trademe.test.adapers.CategoriesListAdapter;
import com.trademe.test.fragments.SubcategoryListFragment;
import com.trademe.test.models.categoryModels.Subcategory;


public class SubCategoryListActivity extends AppCompatActivity {

    private Subcategory list;
    private static final String subCatList = "Subcategory_list";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subcategory_list);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        list = (Subcategory) getIntent().getSerializableExtra(CategoriesListAdapter.LIST_TO_SUBCATEGORIES);

        if (savedInstanceState == null) {
           sendDataToFragment();
        }
    }
    // Inflate the fragment,
    // Send the list attached it
    private void sendDataToFragment(){
        Bundle arguments = new Bundle();
        arguments.putSerializable(subCatList,
                list);
        SubcategoryListFragment fragment = new SubcategoryListFragment();
        fragment.setArguments(arguments);
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            TradeMeApp.setFirstTime(false);
            navigateUpTo(new Intent(this, CategoryListActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



}
