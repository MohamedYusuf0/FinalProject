package com.example.device1;

import android.os.Parcel;

import java.io.Serializable;

public class Device implements Serializable  {

    private String deviceVideo;
    private String deviceName;
    private double devicePrice;
    private int deviceImage;
    private String deviceDescription;
    private String deviceYoutubeId;
    private String deviceYoutubeUrl;
    private String deviceWebSiteUrl;
    private String deviceType;
    private float deviceRating;


    public Device(String deviceBrand, String deviceName, double devicePrice, int deviceImage, String deviceDescription, String deviceYoutubeId,
                  String deviceYoutubeUrl, String deviceWebSiteUrl,float deviceRating, String deviceType) {
        this.deviceVideo = deviceBrand;
        this.deviceName = deviceName;
        this.devicePrice = devicePrice;
        this.deviceImage = deviceImage;
        this.deviceDescription = deviceDescription;
        this.deviceYoutubeId = deviceYoutubeId;
        this.deviceYoutubeUrl = deviceYoutubeUrl;
        this.deviceWebSiteUrl = deviceWebSiteUrl;
        this.deviceType = deviceType;
        this.deviceRating = deviceRating;
    }


    protected Device(Parcel in) {
        deviceVideo = in.readString();
        deviceName = in.readString();
        devicePrice = in.readDouble();
        deviceImage = in.readInt();
        deviceDescription = in.readString();
        deviceYoutubeId = in.readString();
        deviceYoutubeUrl = in.readString();
        deviceType = in.readString();
        deviceRating = in.readFloat();
    }


    public String getDeviceVideo() { return deviceVideo; }

    public void setDeviceVideo(String deviceVideo) { this.deviceVideo = deviceVideo; }

    public String getDeviceName() { return deviceName; }

    public void setDeviceName(String deviceName) { this.deviceName = deviceName; }

    public double getDevicePrice() { return devicePrice; }

    public void setDevicePrice(double devicePrice) { this.devicePrice = devicePrice; }

    public int getDeviceImage() { return deviceImage; }

    public void setDeviceImage(int deviceImage) { this.deviceImage = deviceImage; }

    public String getDeviceDescription() { return deviceDescription; }

    public void setDeviceDescription(String deviceDescription) { this.deviceDescription = deviceDescription;}

    public String getDeviceYoutubeId() { return deviceYoutubeId; }

    public void setDeviceYoutubeId(String deviceYoutubeId) { this.deviceYoutubeId = deviceYoutubeId;}

    public String getDeviceYoutubeUrl() { return deviceYoutubeUrl; }

    public void setDeviceYoutubeUrl(String deviceYoutubeUrl) { this.deviceYoutubeUrl = deviceYoutubeUrl; }

    public String getDeviceWebSiteUrl() { return deviceWebSiteUrl; }

    public void setDeviceWebSiteUrl(String deviceWebSiteUrl) { this.deviceWebSiteUrl = deviceWebSiteUrl; }

    public String getDeviceType() { return deviceType; }

    public void setDeviceType(String deviceType) { this.deviceType = deviceType; }

    public float getDeviceRating() { return deviceRating; }

    public void setDeviceRating(float deviceRating) { this.deviceRating = deviceRating; }

    //end file
}