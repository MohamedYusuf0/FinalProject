package com.example.device1.DevicesAct;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.device1.DetailsActivity;
import com.example.device1.Device;
import com.example.device1.DeviceAdapter;
import com.example.device1.R;

import java.util.ArrayList;

public class AndroidDeviceActivity extends AppCompatActivity {

    ArrayList<Device> Devices = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_device);


        Device S22Ultra = new Device("2Jdpwb_0F5w", "Samsung Galaxy S22 Ultra 5G 512GB - Phantom Black",
                464, R.drawable.s22ultra_black, "Screen & Display:\n6.8 Infinity-O Quad HD+ Dynamic AMOLED 2X Display\n\n"
                + "Battery:\n5,000mAh\n\n" + "Processor:\nSnapdragon 8 Gen 1\n\n" + "S Pen:\nYes\n\n" + "price:\n464 KD",
                "https://www.youtube.com/watch?v=vXIAB_1FEC0&t=11s",
                "https://www.youtube.com/watch?v=xjEBMno_xao");

        Device ZFold3 = new Device("74SDT7NfxCg", "Samsung Galaxy Z Fold 3 5G 256GB - Black",
                464, R.drawable.z_flod3_black, "Screen Size:\nMain Screen: 7.6'' Dynamic AMOLED 2X (2208 x 1768)\n" +
                "Cover Screen: 6.2'' Dynamic AMOLED 2X (2268 x 832)\n\n" + "Battery:\n4,400 mAh(typical)\n\n" +
                "Processor:\nQualcomm Snapdragon 888 Octa-core\n\n" + "S Pen Compatibility:\nYes" + "price:\n464 KD",
                "https://www.youtube.com/watch?v=iLLi02P1FN4",
                "https://www.youtube.com/watch?v=o_A3YbaBB04");

        Device S21Ultra = new Device("0d9fq03V1yY","Samsung Galaxy S21 Ultra 256GB - Silver",
                339, R.drawable.s21ultra_silver,  "Screen Size:\n6.8\n\n" + "Battery:\n5,000 mAh\n\n" +
                "Processor:\n2.2GHz octa-core (3x2.8GHz + 4x2.2GHz + 1x2.9GHz)\n\n" + "S Pen Compatibility:\nYes" + "price:\n339 KD",
                "https://www.youtube.com/watch?v=tn2AgrwXpNQ",
                "https://www.youtube.com/watch?v=Yb6apJ3BpSs");

        Device Note20 = new Device("tBIkJX7fJc0", "Samsung Galaxy Note 20 5G 256GB – Green",
                219.90, R.drawable.n20_green, "Screen Size:\n6.8\n\n" + "Battery:\n4500mAh\n\n" +
                "Processor:\nQualcomm SM8250 Snapdragon 865 5G+ (7 nm+)\n\n" + "S Pen Compatibility:\nYes" + "price:\n219.90 KD",
                "https://www.youtube.com/watch?v=Exk34o-MMIE", "");


        Devices.add(S22Ultra);
        Devices.add(S21Ultra);
        Devices.add(ZFold3);
        Devices.add(Note20);


        DeviceAdapter adapter = new DeviceAdapter(this , 0 , Devices);
        ListView listView2 = findViewById(R.id.searchlistview);
        listView2.setAdapter(adapter);

        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Device currentDevice = Devices.get(i);
                Intent intent = new Intent(AndroidDeviceActivity.this , DetailsActivity.class);
                intent.putExtra("Devices" , currentDevice);

                startActivity(intent);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_list , menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
//            case R.id.back:
//                finish();
//                return true;
//
//            case R.id.menuBrand1:
//                Toast.makeText(this, "You're in Android list", Toast.LENGTH_SHORT).show();
//                return true;
//
//            case R.id.menuBrand2:
//                Intent intent2 = new Intent(this , AppleDeviceActivity.class);
//                startActivity(intent2);
//                finish();
//                return true;
//
//            case R.id.menuBrand3:
//                Intent intent3 = new Intent(this , HuaweiDeviceActivity.class);
//                startActivity(intent3);
//                finish();
//                return true;
        }
        return super.onOptionsItemSelected(item); }
}