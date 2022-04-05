package com.example.device1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class DeviceAdapter extends ArrayAdapter {

    List<Device> DeviceList;
    SharedPreferences wsSP;
    SharedPreferences.Editor editor;
    ImageView wlImg;
    public static final String Shared = "sharedpref";
    public static Bitmap wish_image;;

    public DeviceAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        DeviceList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.device_list, parent, false);

        Device currentDevice = DeviceList.get(position);

        TextView itemName = view.findViewById(R.id.deviceName);
        TextView itemPrice = view.findViewById(R.id.devicePrice);
        ImageView itemImage = view.findViewById(R.id.deviceImage);
        RatingBar itemRating = view.findViewById(R.id.rating);


        itemName.setText(currentDevice.getDeviceName());
        itemPrice.setText(currentDevice.getDevicePrice() + "");
        itemImage.setImageResource(currentDevice.getDeviceImage());
        itemRating.setRating(currentDevice.getDeviceRating());

        return view;
    }
}
