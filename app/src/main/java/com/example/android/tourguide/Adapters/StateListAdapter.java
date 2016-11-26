package com.example.android.tourguide.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguide.R;
import com.example.android.tourguide.Model.StatesAndCity;

import java.util.ArrayList;

/**
 * Created by ABHISHEK RAJ on 9/13/2016.
 */
public class StateListAdapter extends ArrayAdapter<StatesAndCity> {
    // View lookup cache
    private static class ViewHolder {
        TextView stateName;
        ImageView city_image;
    }

    public StateListAdapter(Context context, ArrayList<StatesAndCity> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        StatesAndCity currentState = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag
        if (convertView == null) {
            // If there's no view to re-use, inflate a brand new view for row
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.list_item, parent, false);
                        /*Find the TextView and ImageView and set them on the VIewHolder*/
            viewHolder.stateName = (TextView) convertView.findViewById(R.id.statesOrCityName);
            viewHolder.city_image = (ImageView) convertView.findViewById(R.id.city_image);
            /* Check if the current position list item has a image, and if has then set the
            * visibility to True otherwise make it disapper using View.GONE
            */
            if (currentState.hasImage()) {
                viewHolder.city_image.setVisibility(View.VISIBLE);
            } else {
                viewHolder.city_image.setVisibility(View.GONE);
            }


            // Cache the viewHolder object inside the fresh view
            convertView.setTag(viewHolder);
        } else {
            // View is being recycled, retrieve the viewHolder object from tag
            viewHolder = (ViewHolder) convertView.getTag();
        }
        // Populate the data into the template view using the data object
        viewHolder.stateName.setText(currentState.getStateName());
        viewHolder.city_image.setImageResource(currentState.getCityImageresourceId());
        //set the StateNameId
        viewHolder.stateName.setId(currentState.getmStateOrCityresourceId());

        return convertView;
    }
}