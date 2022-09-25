package com.example.settings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button timeZone,bluetooth,wifi,mobileData1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timeZone = findViewById(R.id.timeZone);
        bluetooth = findViewById(R.id.bluetooth);
        wifi = findViewById(R.id.wifi);
        mobileData1 = findViewById(R.id.mobliedata);
        mobileData1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Intent intent = new Intent();
//                intent.setComponent(new ComponentName("com.android.settings","com.android.settings.Settings$DataUsageSummaryActivity"));
//                startActivity(intent);
                startActivity(new Intent(Settings.ACTION_WIFI_SETTINGS));


            }
        });


        wifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent();
//                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                intent.setAction(android.provider.Settings.ACTION_DATA_ROAMING_SETTINGS);
//                startActivity(intent);

                startActivity(new Intent(Settings.ACTION_WIFI_SETTINGS));
            }
        });
        timeZone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Settings.ACTION_DATE_SETTINGS));
            }
        });
        bluetooth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentOpenBluetoothSettings = new Intent();
                intentOpenBluetoothSettings.setAction(android.provider.Settings.ACTION_BLUETOOTH_SETTINGS);
                startActivity(intentOpenBluetoothSettings);
            }
        });
    }
}