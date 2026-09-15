package com.tadiwatembo.explicitintent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

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
Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        TextView txtStudentName = findViewById(R.id.txtStudentName);
        txtStudentName.setText(name);

        btnBack=findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> {
            Intent intent1 = new Intent(Welcome.this, MainActivity.class);
            startActivity(intent1);
        });


    }
}