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

public class AppleDeviceActivity extends AppCompatActivity {

    ArrayList<Device> Devices = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple_device);

        //Apple
        Device i13pm = new Device("XKfgdkcIUxw", "Apple iPhone 13 Pro Max - Blue",
                374, R.drawable.iphone13_promax_blue, "Battery life:\n4350 mAh\n\n" +
                "Screen size:\n6.7 inches\n\n" + "Adaptive refresh:\nUp to 120Hz\n\n" +
                "Processor:\nA15 Bionic\n\n" + "Rear cameras:\nPro 12MP\n\n" +
                "Zoom:\n3x optical / 15x digital\n\n" + "Front camera:\n12MP TrueDepth\n\n" +
                "Colors: Graphite, Gold, Silver, Sierra Blue\n" + "Size:\n6.3 x 3.1 x 0.3 inches\n\n" +
                "Water resistance:\nIP68\n\n" + "price:\n374 KD"
                ,"https://www.youtube.com/watch?v=TnkdoEZhTbc",
                "https://www.youtube.com/watch?v=TPO_QrKT344",
                "https://www.apple.com/kw/iphone-13-pro/",4.4f,"Apple");

        Device i12pm = new Device("P91bKe-J-mc", "Apple iPhone 12 Pro Max - Gold",
                338, R.drawable.iphone12_promax_gold, "Processor:\nA14 Bionic\n\n" +
                "RAM:\n6GB\n\n" + "Storage:\n128GB\n\n" +
                "Display:\n6.7 inches Super Retina XDR OLED display\n\n" +
                "Camera:\n12 MP\n\n" + "Front Camera:\n12 MP\n\n" +
                "Battery:\n3687mAh , 20W Fast charging\n\n" + "price:\n338 KD"
                ,"https://www.youtube.com/watch?v=qrzCLgDplTw",
                "https://www.youtube.com/watch?v=rGklVhDRPjk",
                "https://www.apple.com/kw/iphone-12/key-features/",4.0f,"Apple");

        Device i11pm = new Device("Apple", "Apple iPhone 11 Pro Max - Space Grey",
                270, R.drawable.iphone11_promax_spacegrey, "Display:\n6.50-inch\n\n" +
                "Processor:\nA13 Bionic\n\n" + "Front Camera:\n12MP\n\n" +
                "Rear Camera:\n12MP\n\n" + "RAM:\n4GB\n\n" +
                "Storage:\n64GB\n\n" + "Battery Capacity:\n3969mAh\n\n" + "price:\n270 KD"
                ,"", "",
                "https://www.apple.com/kw/iphone-11/specs/",4.2f,"Apple");

        Device iXs = new Device("Apple", "Apple iPhone Xs Max - Red",
                189, R.drawable.iphonexs_max_red, "Screen & Display:\n5.8 and 6.5-inch screen sizes\n\n" +
                "Storage:\nUp to 512GB storage\n\n" + "Faster Face ID and edge-to-edge display\n\n" +
                "Processor:\nA12 Bionic chip\n\n" + "Faster Gigabit LTE" + "price:\n189 KD"
                ,"", "","",4.4f,"Apple");

        Devices.add(i13pm);
        Devices.add(i12pm);
        Devices.add(i11pm);
        Devices.add(iXs);

        DeviceAdapter adapter = new DeviceAdapter(this , 0 , Devices);
        ListView appleListView = findViewById(R.id.appleListView);
        appleListView.setAdapter(adapter);

        appleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Device currentDevice = Devices.get(i);
                Intent intent = new Intent(AppleDeviceActivity.this , DetailsActivity.class);
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
//                Toast.makeText(this, "You're in Apple list", Toast.LENGTH_SHORT).show();
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