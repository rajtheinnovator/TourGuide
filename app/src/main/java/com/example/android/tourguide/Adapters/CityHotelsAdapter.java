package com.example.android.tourguide.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.tourguide.Model.CityDetails;
import com.example.android.tourguide.R;

import java.util.ArrayList;

/**
 * Created by ABHISHEK RAJ on 9/13/2016.
 */
public class CityHotelsAdapter extends ArrayAdapter<CityDetails> {
    // View lookup cache
    private static class ViewHolder {
        TextView city_hotel1_Information;
        ImageView city_hotel1_image;
        TextView city_hotel2_Information;
        ImageView city_hotel2_image;
    }

    public CityHotelsAdapter(Context context, ArrayList<CityDetails> cityDetails) {
        super(context, 0, cityDetails);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        CityDetails currentCity = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag
        if (convertView == null) {
            // If there's no view to re-use, inflate a brand new view for row
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.city_hotels_item, parent, false);
                        /*Find the TextView and ImageView and set them on the VIewHolder*/
            viewHolder.city_hotel1_Information = (TextView) convertView.findViewById(R.id.city_hotel1Information);
            viewHolder.city_hotel2_Information = (TextView) convertView.findViewById(R.id.city_hotel2_Information);
            viewHolder.city_hotel1_image = (ImageView) convertView.findViewById(R.id.city_hotel1_image);
            viewHolder.city_hotel2_image = (ImageView) convertView.findViewById(R.id.city_hotel2_image);

            // Cache the viewHolder object inside the fresh view
            convertView.setTag(viewHolder);
        } else {
            // View is being recycled, retrieve the viewHolder object from tag
            viewHolder = (ViewHolder) convertView.getTag();
        }
        // Populate the data into the template view using the data object
        viewHolder.city_hotel1_Information.setText(currentCity.getCityHotel1());
        viewHolder.city_hotel1_image.setImageResource(currentCity.getCityHotel1ImageResourceId());
        viewHolder.city_hotel2_Information.setText(currentCity.getCityHotel2());
        viewHolder.city_hotel2_image.setImageResource(currentCity.getCityHotel2ImageResourceId());

        return convertView;
    }
}