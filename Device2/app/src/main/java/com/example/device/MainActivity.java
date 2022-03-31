package com.example.device;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import com.example.device.DevicesAct.AndroidDeviceActivity;
import com.example.device.DevicesAct.AppleDeviceActivity;
import com.example.device.DevicesAct.HuaweiDeviceActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Device> devices = new ArrayList<>();
    Button appleButton , androidButton , huaweiButton , searchButton;
    CardView cv1, cv2, cv3, cv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cv1 = findViewById(R.id.cv1);
        cv2 = findViewById(R.id.cv2);
        cv3 = findViewById(R.id.cv3);
        cv4 = findViewById(R.id.cv4);


        androidButton = findViewById(R.id.AndroidButton);
        appleButton = findViewById(R.id.AppleButton);
        huaweiButton = findViewById(R.id.HuaweiButton);
        searchButton = findViewById(R.id.searchButton);

        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);


        //BUTTONS
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , AndroidDeviceActivity.class);
                startActivity(intent);
            }
        });

        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , AppleDeviceActivity.class);
               startActivity(intent);
            }
        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , HuaweiDeviceActivity.class);
                startActivity(intent);
            }
        });

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , SearchActivity.class);
                startActivity(intent);
            }
        });
        //End BUTTONS

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
            case R.id.back:
                Toast.makeText(this, "You can't go back" , Toast.LENGTH_SHORT).show();
                return true;

            case R.id.menuBrand1:
                Intent intent = new Intent(this , AndroidDeviceActivity.class);
                startActivity(intent);
                return true;

            case R.id.menuBrand2:
                Intent intent2 = new Intent(this , AppleDeviceActivity.class);
                startActivity(intent2);
                return true;

            case R.id.menuBrand3:
                Intent intent3 = new Intent(this , HuaweiDeviceActivity.class);
                startActivity(intent3);
                return true;
        }
        return super.onOptionsItemSelected(item); }
}