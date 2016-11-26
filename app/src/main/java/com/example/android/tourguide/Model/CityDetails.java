package com.example.android.tourguide.Model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ABHISHEK RAJ on 9/14/2016.
 */
public class CityDetails implements Parcelable {
    /* store the name of city for setting the activity title in app bar*/
    private String mCityname;

    /*Variables for storing City Information*/
    private String mCityInformation;
    private int mCityImageResourceId;

    /*Variables for storing City Hotels*/
    private String mCityHotel1;
    private String mCityHotel2;
    private int mCityHotel1ImageResourceId;
    private int mCityHotel2ImageResourceId;

    /*Variables for storing City Reach Here By*/
    private String mCityReachByBus;
    private String mCityReachByTrain;
    private String mCItyReachByFlight;
    private int mCityTrainStationImageResourceId;

    /*Variables for storing City Must Visit*/
    private String mCityMustVisitPlace1;
    private String mCityMustVisitPlace2;
    private String mCityMustVisitPlace3;
    private int mCityMustVisitPlace1ImageResourceId;
    private int mCityMustVisitPlace2ImageResourceId;
    private int mCityMustVisitPlace3ImageResourceId;

    /*Constructor for "CityInformation" Fragment*/
    public CityDetails(String cityName, String information, int cityImageResourceId) {
        mCityname = cityName;
        mCityInformation = information;
        mCityImageResourceId = cityImageResourceId;

    }

    /*Constructor for "City Hotels" Fragment*/
    public CityDetails(String cityHotel1, String cityHotel2, int cityHotel1ImageResourceId, int cityHotel2ImageResourceId) {
        mCityHotel1 = cityHotel1;
        mCityHotel2 = cityHotel2;
        mCityHotel1ImageResourceId = cityHotel1ImageResourceId;
        mCityHotel2ImageResourceId = cityHotel2ImageResourceId;
    }

    /*Constructor for "Reach Here By" Fragment*/
    public CityDetails(String cityReachByTrain, String cityReachByBus, String cityReachByFlight, int cityTrainStationImageResourceId) {
        mCityReachByTrain = cityReachByTrain;
        mCityReachByBus = cityReachByBus;
        mCItyReachByFlight = cityReachByFlight;
        mCityTrainStationImageResourceId = cityTrainStationImageResourceId;
    }

    /*Constructor for "City Must Visit" Fragment*/
    public CityDetails(String cityMustVisitPlace1, String cityMustVisitPlace2, String cityMustVisitPlace3,
                       int cityMustVisitPlace1ImageResourceId, int cityMustVisitPlace2ImageResourceId,
                       int cityMustVisitPlace3ImageResourceId) {
        mCityMustVisitPlace1 = cityMustVisitPlace1;
        mCityMustVisitPlace2 = cityMustVisitPlace2;
        mCityMustVisitPlace3 = cityMustVisitPlace3;
        mCityMustVisitPlace1ImageResourceId = cityMustVisitPlace1ImageResourceId;
        mCityMustVisitPlace2ImageResourceId = cityMustVisitPlace2ImageResourceId;
        mCityMustVisitPlace3ImageResourceId = cityMustVisitPlace3ImageResourceId;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        //City Name
        out.writeString(mCityname);
        //City Information
        out.writeString(mCityInformation);
        out.writeInt(mCityImageResourceId);
        //City Hotels
        out.writeString(mCityHotel1);
        out.writeInt(mCityHotel1ImageResourceId);
        out.writeString(mCityHotel2);
        out.writeInt(mCityHotel2ImageResourceId);
        //City Reach By
        out.writeString(mCityReachByTrain);
        out.writeString(mCityReachByBus);
        out.writeString(mCItyReachByFlight);
        out.writeInt(mCityTrainStationImageResourceId);
        //City Must Visit
        out.writeString(mCityMustVisitPlace1);
        out.writeString(mCityMustVisitPlace1);
        out.writeString(mCityMustVisitPlace1);
        out.writeInt(mCityMustVisitPlace1ImageResourceId);
        out.writeInt(mCityMustVisitPlace2ImageResourceId);
        out.writeInt(mCityMustVisitPlace3ImageResourceId);
    }

    private CityDetails(Parcel in) {
        //City Name
        mCityname = in.readString();
        //City Information
        mCityInformation = in.readString();
        mCityImageResourceId = in.readInt();
        //City Hotels
        mCityHotel1 = in.readString();
        mCityHotel1ImageResourceId = in.readInt();
        mCityHotel2 = in.readString();
        mCityHotel2ImageResourceId = in.readInt();
        //City Reach By
        mCityReachByTrain = in.readString();
        mCityReachByBus = in.readString();
        mCItyReachByFlight = in.readString();
        mCityTrainStationImageResourceId = in.readInt();
        //City Must Visit
        mCityMustVisitPlace1 = in.readString();
        mCityMustVisitPlace2 = in.readString();
        mCityMustVisitPlace3 = in.readString();
        mCityMustVisitPlace1ImageResourceId = in.readInt();
        mCityMustVisitPlace2ImageResourceId = in.readInt();
        mCityMustVisitPlace3ImageResourceId = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    // After implementing the `Parcelable` interface, we need to create the
    // `Parcelable.Creator<MyParcelable> CREATOR` constant for our class;
    // Notice how it has our class specified as its type.
    public static final Parcelable.Creator<CityDetails> CREATOR
            = new Parcelable.Creator<CityDetails>() {

        // This simply calls our new constructor (typically private) and
        // passes along the unmarshalled `Parcel`, and then returns the new object!
        @Override
        public CityDetails createFromParcel(Parcel in) {
            return new CityDetails(in);
        }

        // We just need to copy this and change the type to match our class.
        @Override
        public CityDetails[] newArray(int size) {
            return new CityDetails[size];
        }
    };

    //Method for getting city name for setting that in app bar
    public String getCityname(){return mCityname;}

    //Methods for City Information
    public String getCityInformation() {
        return mCityInformation;
    }

    public int getCityImageResourceId() {
        return mCityImageResourceId;
    }

    //Methods for City Hotels
    public String getCityHotel1() {
        return mCityHotel1;
    }

    public int getCityHotel1ImageResourceId() {
        return mCityHotel1ImageResourceId;
    }

    public String getCityHotel2() {
        return mCityHotel2;
    }

    public int getCityHotel2ImageResourceId() {
        return mCityHotel2ImageResourceId;
    }

    //Methods for City Reach By
    public String getCityReachByTrain() {
        return mCityReachByTrain;
    }

    public String getCityReachByBus() {
        return mCityReachByBus;
    }

    public String getCityReachByFlight() {
        return mCItyReachByFlight;
    }

    public int getCityTrainStationImageResourceId() {
        return mCityTrainStationImageResourceId;
    }

    //Methods for City Must Visit
    public String getCityMustVisitPlace1() {
        return mCityMustVisitPlace1;
    }

    public String getCityMustVisitPlace2() {
        return mCityMustVisitPlace2;
    }

    public String getCityMustVisitPlace3() {
        return mCityMustVisitPlace3;
    }

    public int getCityMustVisitPlace1ImageResourceId() {
        return mCityMustVisitPlace1ImageResourceId;
    }

    public int getCityMustVisitPlace2ImageResourceId() {
        return mCityMustVisitPlace2ImageResourceId;
    }

    public int getCityMustVisitPlace3ImageResourceId() {
        return mCityMustVisitPlace3ImageResourceId;
    }
}
