package com.tadiwatembo.intents;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Welcome extends AppCompatActivity {
Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_welcome);
            btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(v -> {
            Intent intent = new Intent(Welcome.this, MainActivity.class);
            startActivity(intent);


        });

    }
}