package com.example.android.tourguide.Model;

/**
 * Created by ABHISHEK RAJ on 9/13/2016.
 */
public class StatesAndCity {
    private String mStateName;
    private String mCityname;
    private int mCityImageResourceId;
    //    City Image
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    private int mStateOrCityresourceId;

    public StatesAndCity(String stateName) {
        mStateName = stateName;
    }

    public int getmStateOrCityresourceId() {
        return mStateOrCityresourceId;
    }

    public StatesAndCity(String cityname, int cityImageresourceId, int stateOrCityresourceId) {
        mCityname = cityname;
        mCityImageResourceId = cityImageresourceId;
        mStateOrCityresourceId = stateOrCityresourceId;
    }
    public StatesAndCity(String stateName, int stateOrCityresourceId){
        mStateName = stateName;
        mStateOrCityresourceId = stateOrCityresourceId;
    }

    public String getStateName() {
        return mStateName;
    }

    public String getCityname() {
        return mCityname;
    }

    public int getCityImageresourceId() {
        return mCityImageResourceId;
    }

    /**
     * Add whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
