package com.trademe.test.adapers;

import android.support.v7.widget.RecyclerView;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.trademe.test.R;
import com.trademe.test.activities.CategoryListActivity;
import com.trademe.test.activities.SubCategoryListActivity;
import com.trademe.test.fragments.SearchListFragment;
import com.trademe.test.fragments.SubcategoryListFragment;

import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/**
 * Created by alexanderparra on 18/01/16.
 */
public class SearchListAdapter extends RecyclerView.Adapter<SearchListAdapter.ViewHolder> {

    private List<com.trademe.test.models.searchModels.List> mValues;
    private boolean mTwoPane;

    public SearchListAdapter(List<com.trademe.test.models.searchModels.List> values, Boolean mTwoPane){
        this.mValues = values;
        this.mTwoPane = mTwoPane;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.search_list_content, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mTitle.setText(mValues.get(position).getTitle());
        holder.mLocation.setText(mValues.get(position).getSuburb());
        holder.mDate.setText(getDate(mValues.get(position).getStartDate()));
        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mTwoPane) {
                    Toast.makeText(v.getContext(), "Not Implemented yet!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(v.getContext(), "Not Implemented yet!", Toast.LENGTH_SHORT).show();
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
    public final TextView mTitle;
    public final TextView mLocation;
    public final TextView mDate;
        public ViewHolder(View view) {
            super(view);
            mView = view;
            mTitle = (TextView) view.findViewById(R.id.trademe_search_title);
            mLocation= (TextView) view.findViewById(R.id.trademe_ad_location);
            mDate = (TextView) view.findViewById(R.id.trademe_ad_date);
        }
   }
    private String getDate(String num) {
        String numDate = num.replaceAll("\\D+","");
        long time = Long.parseLong(numDate);
        Calendar cal = Calendar.getInstance(Locale.ENGLISH);
        cal.setTimeInMillis(time);
        String date = DateFormat.format("dd-MM-yyyy", cal).toString();
        return date;
    }
}
