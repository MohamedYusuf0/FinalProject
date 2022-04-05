package com.example.device1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {

    ArrayList<Device> Devices = new ArrayList<>();
    ImageView h2, s2;
    Button all, samsung, huawei, apple;
    private String selectedFilter = "all";
    ListView searchlistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        SearchView searchView = findViewById(R.id.searchView);
        ListView searchlistview = (ListView) findViewById(R.id.searchlistview);


        //Samsung
        Device S22Ultra = new Device("2Jdpwb_0F5w", "Samsung Galaxy S22 Ultra 5G 512GB - Phantom Black",
                464, R.drawable.s22ultra_black, "Screen & Display:\n6.8 Infinity-O Quad HD+ Dynamic AMOLED 2X Display\n\n"
                + "Battery:\n5,000mAh\n\n" + "Processor:\nSnapdragon 8 Gen 1\n\n" + "S Pen:\nYes\n\n" + "price:\n464 KD",
                "https://www.youtube.com/watch?v=vXIAB_1FEC0&t=11s",
                "https://www.youtube.com/watch?v=xjEBMno_xao",
                "https://www.samsung.com/us/smartphones/galaxy-s22-ultra/",3.1f,"samsung");

        Device ZFold3 = new Device("74SDT7NfxCg", "Samsung Galaxy Z Fold 3 5G 256GB - Black",
                464, R.drawable.z_flod3_black, "Screen Size:\nMain Screen: 7.6'' Dynamic AMOLED 2X (2208 x 1768)\n" +
                "Cover Screen: 6.2'' Dynamic AMOLED 2X (2268 x 832)\n\n" + "Battery:\n4,400 mAh(typical)\n\n" +
                "Processor:\nQualcomm Snapdragon 888 Octa-core\n\n" + "S Pen Compatibility:\nYes\n\nprice:\n464 KD",
                "https://www.youtube.com/watch?v=iLLi02P1FN4",
                "https://www.youtube.com/watch?v=o_A3YbaBB04",
                "https://www.samsung.com/us/smartphones/galaxy-z-fold3-5g/", 4.6f,"samsung");

        Device S21Ultra = new Device("0d9fq03V1yY","Samsung Galaxy S21 Ultra 256GB - Silver",
                339, R.drawable.s21ultra_silver,  "Screen Size:\n6.8\n\n" + "Battery:\n5,000 mAh\n\n" +
                "Processor:\n2.2GHz octa-core (3x2.8GHz + 4x2.2GHz + 1x2.9GHz)\n\n" + "S Pen Compatibility:\nYes" + "price:\n339 KD",
                "https://www.youtube.com/watch?v=tn2AgrwXpNQ",
                "https://www.youtube.com/watch?v=Yb6apJ3BpSs",
                "https://www.samsung.com/us/smartphones/galaxy-s21-ultra-5g/",4.1f,"samsung");

        Device Note20 = new Device("tBIkJX7fJc0", "Samsung Galaxy Note 20 5G 256GB – Green",
                219.90, R.drawable.n20_green, "Screen Size:\n6.8\n\n" + "Battery:\n4500mAh\n\n" +
                "Processor:\nQualcomm SM8250 Snapdragon 865 5G+ (7 nm+)\n\n" + "S Pen Compatibility:\nYes" + "price:\n219.90 KD",
                "https://www.youtube.com/watch?v=Exk34o-MMIE", "","",4.5f,"samsung");


        //Apple
        Device i13pm = new Device("XKfgdkcIUxw", "Apple iPhone 13 Pro Max - Blue",
                374, R.drawable.iphone13_promax_blue, "Battery life:\n4350 mAh\n\n" +
                "Screen size:\n6.7 inches\n\n" + "Adaptive refresh:\nUp to 120Hz\n\n" +
                "Processor:\nA15 Bionic\n\n" + "Rear cameras:\nPro 12MP\n\n" +
                "Zoom:\n3x optical / 15x digital\n\n" + "Front camera:\n12MP TrueDepth\n\n" +
                "Colors: Graphite, Gold, Silver, Sierra Blue\n" + "Size:\n6.3 x 3.1 x 0.3 inches\n\n" +
                "Water resistance:\nIP68\n\n" + "price:\n374 KD"
                ,"https://www.youtube.com/watch?v=TnkdoEZhTbc",
                "https://www.youtube.com/watch?v=TPO_QrKT344","",4.4f,"apple");

        Device i12pm = new Device("P91bKe-J-mc", "Apple iPhone 12 Pro Max - Gold",
                338, R.drawable.iphone12_promax_gold, "Processor:\nA14 Bionic\n\n" +
                "RAM:\n6GB\n\n" + "Storage:\n128GB\n\n" +
                "Display:\n6.7 inches Super Retina XDR OLED display\n\n" +
                "Camera:\n12 MP\n\n" + "Front Camera:\n12 MP\n\n" +
                "Battery:\n3687mAh , 20W Fast charging\n\n" + "price:\n338 KD"
                ,"https://www.youtube.com/watch?v=qrzCLgDplTw",
                "https://www.youtube.com/watch?v=rGklVhDRPjk","",4.0f,"apple");

        Device i11pm = new Device("Apple", "Apple iPhone 11 Pro Max - Space Grey",
                270, R.drawable.iphone11_promax_spacegrey, "Display:\n6.50-inch\n\n" +
                "Processor:\nA13 Bionic\n\n" + "Front Camera:\n12MP\n\n" +
                "Rear Camera:\n12MP\n\n" + "RAM:\n4GB\n\n" +
                "Storage:\n64GB\n\n" + "Battery Capacity:\n3969mAh\n\n" + "price:\n270 KD"
                ,"", "","",4.2f,"apple");

        Device iXs = new Device("Apple", "Apple iPhone Xs Max - Red",
                189, R.drawable.iphonexs_max_red, "Screen & Display:\n5.8 and 6.5-inch screen sizes\n\n" +
                "Storage:\nUp to 512GB storage\n\n" + "Faster Face ID and edge-to-edge display\n\n" +
                "Processor:\nA12 Bionic chip\n\n" + "Faster Gigabit LTE" + "price:\n189 KD"
                ,"", "","",4.4f,"apple");


        //HUAWEI
        Device Hp50pocket = new Device("GtVSM_JMy-A", "HUAWEI P50 Pocket - WHITE",
                429.90, R.drawable.p50pocket, "Screen & Display:\nMain Screen:\n6.9 in\n" +
                "Cover Screen:\n1.04 in\n\n" + "Processor:\nSnapdragon 888 4G Octa-core\n\n" + "8 GB RAM\n256 GB ROM" +
                "Rear Camera:\n40 MP True-Chroma Camera\n13 MP Ultra-Wide Angle Camera\n32 MP Ultra Spectrum Camera\n\n"+
                "Front Camera:\n10.7 MP Selfie Camera (Wide Angle)\n\n" + "Battery:\n4000 mAh\n\n" + "price:\n429.90 KD"
                ,"https://www.youtube.com/watch?v=hsgMPBR7iXk",
                "https://www.youtube.com/watch?v=yDgFClo0iZ4","",3.8f,"huawei");

        Device Hp50pro = new Device("54tGywFswXs", "HUAWEI P50 Pro - COCOA GOLD",
                319.90, R.drawable.p50pro, "Screen & Display:\n6.6 in\n\n" +
                "Processor:\nSnapdragon 888 4G Octa-core\n\n" + "8 GB RAM\n256 GB ROM" +
                "Rear Camera:\n50 MP True-Chroma Camera\n40 MP True-Chroma Camera\n13 MP Ultra-Wide Angle Camera\n\n"+
                "Front Camera:\n13 MP Selfie Camera (Wide Angle)\n\n" + "Battery:\n4360 mAh\n\n" + "price:\n319.90 KD",
                "https://www.youtube.com/watch?v=hsgMPBR7iXk",
                "https://www.youtube.com/watch?v=yp-I5ALYpHI","",4.4f,"huawei");

        Device Hn9 = new Device("Huawei", "HUAWEI nova 9 - STARRY BLUE",
                164.90, R.drawable.nova9, "",
                "https://www.youtube.com/watch?v=hsgMPBR7iXk", "",
                "",4.2f,"huawei");

        Device Hn9se = new Device("Huawei", "HUAWEI nova 9 SE - MidNight BlACK",
                94.90, R.drawable.nova9se, "",
                "https://www.youtube.com/watch?v=hsgMPBR7iXk", "",
                "",4.0f,"huawei");

        //samsung
        Devices.add(S22Ultra);//0
        Devices.add(S21Ultra);//1
        Devices.add(ZFold3);//2
        Devices.add(Note20);//3

        //apple
        Devices.add(i13pm);//4
        Devices.add(i12pm);//5
        Devices.add(i11pm);//6
        Devices.add(iXs);//7

        //huawei
        Devices.add(Hp50pocket);//8
        Devices.add(Hp50pro);//9
        Devices.add(Hn9);//10
        Devices.add(Hn9se);//11

        DeviceAdapter adapter = new DeviceAdapter(this , 0 , Devices);
        ListView ListView4 = findViewById(R.id.searchlistview);
        ListView4.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) { return false; }

            @Override
            public boolean onQueryTextChange(String NewText) {

                ArrayList<Device> filteredDevices = new ArrayList<Device>();

                for (Device devices : Devices) {
                    if (devices.getDeviceName().toLowerCase().contains(NewText.toLowerCase())) {
                        filteredDevices.add(devices);
                    }
                }
                DeviceAdapter adapter1 = new DeviceAdapter(getApplicationContext(), 0, filteredDevices);
                searchlistview.setAdapter(adapter1);

                //start DetailsActivity
                searchlistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                        Device currentDevice = filteredDevices.get(i);
                        Intent intent = new Intent(SearchActivity.this , DetailsActivity.class);
                        intent.putExtra("Devices" , currentDevice);

                        startActivity(intent);
                    }
                });
                return false;
            }
        });

        searchlistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Device currentDevice = Devices.get(i);
                Intent intent = new Intent(SearchActivity.this , DetailsActivity.class);
                intent.putExtra("Devices" , currentDevice);

                startActivity(intent);
            }
        });


        h2 = findViewById(R.id.home1);
        s2 = findViewById(R.id.search1);
        s2.setImageResource(R.drawable.search_white);

        h2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }});

        s2.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) {/**/}});

    }

    public void filterList(String status)
    {
        searchlistview = findViewById(R.id.searchlistview);
        selectedFilter = status;
        ArrayList<Device> filteredDevices = new ArrayList<>();

        for (Device devices : Devices)
        {
            if (devices.getDeviceType().toLowerCase().contains(status)) {
                filteredDevices.add(devices);
            }
        }
        DeviceAdapter adapter = new DeviceAdapter(getApplicationContext(), 0, filteredDevices);
        searchlistview.setAdapter(adapter);

        searchlistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Device currentDevice = filteredDevices.get(i);
                Intent intent = new Intent(SearchActivity.this , DetailsActivity.class);
                intent.putExtra("Devices" , currentDevice);

                startActivity(intent);
            }
        });

    }


    public void allFilters(View view)
    {
        searchlistview = findViewById(R.id.searchlistview);
        selectedFilter = "all";
        DeviceAdapter adapter = new DeviceAdapter(getApplicationContext(), 0, Devices);
        searchlistview.setAdapter(adapter);

    }

    public void samsungFilter(View view)
    {
        filterList ("samsung");
    }

    public void huaweiFilter(View view)
    {
//        filterList("huawei");
    }

    public void appleFilter(View view)
    {
//        filterList("apple");
    }

}