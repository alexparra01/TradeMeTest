package com.trademe.test.models.searchModels;

/**
 * Created by alexanderparra on 18/01/16.
 */
public class GeographicLocation {
    private float Latitude;
    private float Longitude;
    private int Northing;
    private int Easting;
    private int Accuracy;

    /**
     *
     * @return
     * The Latitude
     */
    public float getLatitude() {
        return Latitude;
    }

    /**
     *
     * @param Latitude
     * The Latitude
     */
    public void setLatitude(float Latitude) {
        this.Latitude = Latitude;
    }

    /**
     *
     * @return
     * The Longitude
     */
    public float getLongitude() {
        return Longitude;
    }

    /**
     *
     * @param Longitude
     * The Longitude
     */
    public void setLongitude(float Longitude) {
        this.Longitude = Longitude;
    }

    /**
     *
     * @return
     * The Northing
     */
    public int getNorthing() {
        return Northing;
    }

    /**
     *
     * @param Northing
     * The Northing
     */
    public void setNorthing(int Northing) {
        this.Northing = Northing;
    }

    /**
     *
     * @return
     * The Easting
     */
    public int getEasting() {
        return Easting;
    }

    /**
     *
     * @param Easting
     * The Easting
     */
    public void setEasting(int Easting) {
        this.Easting = Easting;
    }

    /**
     *
     * @return
     * The Accuracy
     */
    public int getAccuracy() {
        return Accuracy;
    }

    /**
     *
     * @param Accuracy
     * The Accuracy
     */
    public void setAccuracy(int Accuracy) {
        this.Accuracy = Accuracy;
    }

}
