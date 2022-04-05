package com.example.device1.DevicesAct;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.device1.DetailsActivity;
import com.example.device1.Device;
import com.example.device1.DeviceAdapter;
import com.example.device1.R;
import com.example.device1.SearchActivity;

import java.util.ArrayList;

public class HuaweiDeviceActivity extends AppCompatActivity {

    ArrayList<Device> Devices = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_huawei_device);

        //HUAWEI
        Device Hp50pocket = new Device("GtVSM_JMy-A", "HUAWEI P50 Pocket - WHITE",
                429.90, R.drawable.p50pocket, "Screen & Display:\nMain Screen:\n6.9 in\n" +
                "Cover Screen:\n1.04 in\n\n" + "Processor:\nSnapdragon 888 4G Octa-core\n\n" + "8 GB RAM\n256 GB ROM" +
                "Rear Camera:\n40 MP True-Chroma Camera\n13 MP Ultra-Wide Angle Camera\n32 MP Ultra Spectrum Camera\n\n"+
                "Front Camera:\n10.7 MP Selfie Camera (Wide Angle)\n\n" + "Battery:\n4000 mAh\n\n" + "price:\n429.90 KD"
                ,"https://www.youtube.com/watch?v=hsgMPBR7iXk",
                "https://www.youtube.com/watch?v=yDgFClo0iZ4",
                "https://consumer.huawei.com/en/phones/p50-pocket/",3.8f,"Huawei");

        Device Hp50pro = new Device("54tGywFswXs", "HUAWEI P50 Pro - COCOA GOLD",
                319.90, R.drawable.p50pro, "Screen & Display:\n6.6 in\n\n" +
                "Processor:\nSnapdragon 888 4G Octa-core\n\n" + "8 GB RAM\n256 GB ROM" +
                "Rear Camera:\n50 MP True-Chroma Camera\n40 MP True-Chroma Camera\n13 MP Ultra-Wide Angle Camera\n\n"+
                "Front Camera:\n13 MP Selfie Camera (Wide Angle)\n\n" + "Battery:\n4360 mAh\n\n" + "price:\n319.90 KD",
                "https://www.youtube.com/watch?v=hsgMPBR7iXk",
                "https://www.youtube.com/watch?v=yp-I5ALYpHI",
                "https://consumer.huawei.com/en/phones/p50-pro/",4.4f,"Huawei");

        Device Hn9 = new Device("Huawei", "HUAWEI nova 9 - STARRY BLUE",
                114.90, R.drawable.nova9, "",
                "https://www.youtube.com/watch?v=hsgMPBR7iXk", "","",4.2f,"Huawei");

        Device Hn9se = new Device("Huawei", "HUAWEI nova 9 SE - MidNight BlACK",
                84.90, R.drawable.nova9se, "",
                "https://www.youtube.com/watch?v=hsgMPBR7iXk", "","",4.0f,"Huawei");

        Devices.add(Hp50pocket);
        Devices.add(Hp50pro);
        Devices.add(Hn9);
        Devices.add(Hn9se);

        DeviceAdapter adapter = new DeviceAdapter(this , 0 , Devices);
        ListView huaweiListView = findViewById(R.id.huaweiListView);
        huaweiListView.setAdapter(adapter);

        huaweiListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Device currentDevice = Devices.get(i);
                Intent intent = new Intent(HuaweiDeviceActivity.this , DetailsActivity.class);
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
//                Intent intent2 = new Intent(this , AndroidDeviceActivity.class);
//                startActivity(intent2);
//                finish();
//                return true;
//
//            case R.id.menuBrand2:
//                Intent intent3 = new Intent(this , AppleDeviceActivity.class);
//                startActivity(intent3);
//                finish();
//                return true;
//
//            case R.id.menuBrand3:
//                Toast.makeText(this, "You're in Huawei list", Toast.LENGTH_SHORT).show();
//                return true;
        }
        return super.onOptionsItemSelected(item); }
}