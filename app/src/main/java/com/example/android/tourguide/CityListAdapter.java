package com.example.android.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ABHISHEK RAJ on 9/14/2016.
 */
public class CityListAdapter extends ArrayAdapter<StatesAndCity> {
    // View lookup cache
    private static class ViewHolder {
        TextView cityName;
        ImageView city_image;
    }

    public CityListAdapter(Context context, ArrayList<StatesAndCity> users) {
        super(context, 0, users);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        StatesAndCity currentCity = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag
        if (convertView == null) {
            // If there's no view to re-use, inflate a brand new view for row
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.list_item_city, parent, false);
                        /*Find the TextView and ImageView and set them on the VIewHolder*/
            viewHolder.cityName = (TextView) convertView.findViewById(R.id.list_item_city_name);
            viewHolder.city_image = (ImageView) convertView.findViewById(R.id.list_item_city_image);

            // Cache the viewHolder object inside the fresh view
            convertView.setTag(viewHolder);
        } else {
            // View is being recycled, retrieve the viewHolder object from tag
            viewHolder = (ViewHolder) convertView.getTag();
        }
        // Populate the data into the template view using the data object
        viewHolder.cityName.setText(currentCity.getCityname());
        viewHolder.city_image.setImageResource(currentCity.getCityImageresourceId());
        //set the StateNameId
        viewHolder.cityName.setId(currentCity.getmStateOrCityresourceId());

        return convertView;
    }
}