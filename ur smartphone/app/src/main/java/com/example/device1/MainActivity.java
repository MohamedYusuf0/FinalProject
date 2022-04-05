package com.example.device1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import com.example.device1.DevicesAct.AndroidDeviceActivity;
import com.example.device1.DevicesAct.AppleDeviceActivity;
import com.example.device1.DevicesAct.HuaweiDeviceActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    CardView cv1, cv2, cv3;
    ImageView h1, s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cv1 = findViewById(R.id.cv2);
        cv2 = findViewById(R.id.cv3);
        cv3 = findViewById(R.id.cv4);

        h1 = findViewById(R.id.home1);
        s1 = findViewById(R.id.search1);
        h1.setImageResource(R.drawable.home_white);


        //CardViews
        //android
        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , AndroidDeviceActivity.class);
                startActivity(intent);
            }
        });

        //huawei
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , HuaweiDeviceActivity.class);
                startActivity(intent);
            }
        });

        //apple
        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , AppleDeviceActivity.class);
                startActivity(intent);
            }
        });
        //End CardView


        //Images
        h1.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) {/**/}});

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , SearchActivity.class);
                startActivity(intent);
            }});


    }
}