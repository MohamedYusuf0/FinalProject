package com.example.device1;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import com.example.device1.DevicesAct.AndroidDeviceActivity;
import com.example.device1.DevicesAct.AppleDeviceActivity;
import com.example.device1.DevicesAct.HuaweiDeviceActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    CardView cv1, cv2, cv3, cv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cv1 = findViewById(R.id.cv1);
        cv2 = findViewById(R.id.cv2);
        cv3 = findViewById(R.id.cv3);
        cv4 = findViewById(R.id.cv4);


        //CardViews
        //search
        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , SearchActivity.class);
                startActivity(intent);
            }
        });

        //android
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , AndroidDeviceActivity.class);
                startActivity(intent);
            }
        });

        //huawei
        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , HuaweiDeviceActivity.class);
                startActivity(intent);
            }
        });

        //apple
        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , AppleDeviceActivity.class);
                startActivity(intent);
            }
        });
        //End CardView

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_list , menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
//            case R.id.back:
//                Toast.makeText(this, "You can't go back" , Toast.LENGTH_SHORT).show();
//                return true;
//
//            case R.id.menuBrand1:
//                Intent intent = new Intent(this , AndroidDeviceActivity.class);
//                startActivity(intent);
//                return true;
//
//            case R.id.menuBrand2:
//                Intent intent2 = new Intent(this , AppleDeviceActivity.class);
//                startActivity(intent2);
//                return true;
//
//            case R.id.menuBrand3:
//                Intent intent3 = new Intent(this , HuaweiDeviceActivity.class);
//                startActivity(intent3);
//                return true;
        }
        return super.onOptionsItemSelected(item); }
}