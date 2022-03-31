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
    private String deviceYoutubeId2;



    public Device(String deviceBrand, String deviceName, double devicePrice, int deviceImage, String deviceDescription, String deviceYoutubeId,
                  String deviceYoutubeId2) {
        this.deviceVideo = deviceBrand;
        this.deviceName = deviceName;
        this.devicePrice = devicePrice;
        this.deviceImage = deviceImage;
        this.deviceDescription = deviceDescription;
        this.deviceYoutubeId = deviceYoutubeId;
        this.deviceYoutubeId2 = deviceYoutubeId2;
    }


    protected Device(Parcel in) {
        deviceVideo = in.readString();
        deviceName = in.readString();
        devicePrice = in.readDouble();
        deviceImage = in.readInt();
        deviceDescription = in.readString();
        deviceYoutubeId = in.readString();
        deviceYoutubeId2 = in.readString();
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

    public String getDeviceYoutubeId2() { return deviceYoutubeId2; }

    public void setDeviceYoutubeId2(String deviceYoutubeId2) { this.deviceYoutubeId2 = deviceYoutubeId2; }


    //end file
}