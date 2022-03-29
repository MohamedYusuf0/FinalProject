package com.example.device;

import androidx.annotation.NonNull;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class DetailsActivity extends YouTubeBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle bundle = getIntent().getExtras();
        Device device = (Device) bundle.getSerializable("Devices");

        ImageView deviceImage = findViewById(R.id.deviceImage2);
        TextView deviceName = findViewById(R.id.deviceName1);
        TextView deviceDes = findViewById(R.id.deviceDes);
        TextView revEn = findViewById(R.id.textView5);
        TextView revAr = findViewById(R.id.textView10);

        String reviewEn = "Device review [English]";
        SpannableString ss = new SpannableString(reviewEn);
        ClickableSpan cs1 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                gotoUrl(device.getDeviceYoutubeId());
            }

            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.BLUE);
            }
        };

        ss.setSpan(cs1,15,22, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        revEn.setText(ss);
        revEn.setMovementMethod(LinkMovementMethod.getInstance());

        String reviewAr = "Device review [Arabic]";
        SpannableString ss1 = new SpannableString(reviewAr);
        ClickableSpan cs2 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                gotoUrl(device.getDeviceYoutubeId2());
            }

            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.BLUE);
            }
        };

        ss1.setSpan(cs2,15,21, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        revAr.setText(ss1);
        revAr.setMovementMethod(LinkMovementMethod.getInstance());

        YouTubePlayerView YTP = findViewById(R.id.YTplayer1);

        deviceImage.setImageResource(device.getDeviceImage());
        deviceName.setText(device.getDeviceName());
        deviceDes.setText(device.getDeviceDescription());



        YTP.initialize("AIzaSyDwQJG-sCi09joD5nZdGcQrrqJk4766fY0", new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b)
            {
                youTubePlayer.loadVideo(device.getDeviceVideo());
                youTubePlayer.play();
            }
            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) { }
        });




    }


    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}