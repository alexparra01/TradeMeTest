package com.trademe.test.activities;


import android.os.Bundle;

import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import com.trademe.test.R;
import com.trademe.test.fragments.CategoryListFragment;
import com.trademe.test.fragments.SearchListFragment;


public class CategoryListActivity extends AppCompatActivity {

    private static String SEARCH ="search";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_list);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getTitle());

        // Save the instance when the device change orientation
        if(savedInstanceState ==null){
            CategoryListFragment fragment = new CategoryListFragment();
            getSupportFragmentManager().beginTransaction()
                    .addToBackStack("CategoryListFragment")
                    .replace(R.id.frag_container, fragment)
                    .commit();
        }

    }

    //Search widget implementation
    // The results are showing on other fragment
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem searchItem = menu.findItem(R.id.menu_search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Bundle args = new Bundle();
                args.putString(SEARCH, query);
                SearchListFragment fragment = new SearchListFragment();
                fragment.setArguments(args);
                getSupportFragmentManager().beginTransaction()
                        .addToBackStack("SearchListFragment")
                        .replace(R.id.frag_container, fragment)
                        .commit();
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });

        return true;
    }

}
