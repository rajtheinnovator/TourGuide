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
 * Created by ABHISHEK RAJ on 9/13/2016.
 */
public class CityInformationAdapter extends ArrayAdapter<CityDetails> {
    // View lookup cache
    private static class ViewHolder {
        TextView cityInformation;
        ImageView city_image;
    }

    public CityInformationAdapter(Context context, ArrayList<CityDetails> cityDetails) {
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
            convertView = inflater.inflate(R.layout.city_information_item, parent, false);
                        /*Find the TextView and ImageView and set them on the VIewHolder*/
            viewHolder.cityInformation = (TextView) convertView.findViewById(R.id.cityInformation);
            viewHolder.city_image = (ImageView) convertView.findViewById(R.id.city_image);

            // Cache the viewHolder object inside the fresh view
            convertView.setTag(viewHolder);
        } else {
            // View is being recycled, retrieve the viewHolder object from tag
            viewHolder = (ViewHolder) convertView.getTag();
        }
        // Populate the data into the template view using the data object
        viewHolder.cityInformation.setText(currentCity.getCityInformation());
        viewHolder.city_image.setImageResource(currentCity.getCityImageResourceId());

        return convertView;
    }
}