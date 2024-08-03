package com.example.suvashapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button scanButton;
    private Button generateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scanButton = findViewById(R.id.ScanButton);
        generateButton = findViewById(R.id.GenerateButton);

        scanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle QR scan button click
                Intent scanIntent = new Intent(MainActivity.this, ScanActivity.class);
                startActivity(scanIntent);
            }
        });

        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle QR generate button click
                Intent generateIntent = new Intent(MainActivity.this, QRGenerator.class);
                startActivity(generateIntent);
            }
        });

        Button btnGenerateQR = findViewById(R.id.GenerateButton);
        btnGenerateQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, QRGenerator.class);
                startActivity(intent);
            }
        });

        Button btnScanQR = findViewById(R.id.ScanButton);
        btnScanQR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ScanActivity.class);
                startActivity(intent);
            }
        });
    }
}
