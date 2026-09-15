package com.tadiwatembo.explicitintent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button btnClick;
EditText txtStudentName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        txtStudentName = findViewById(R.id.editTextText);
    btnClick = findViewById(R.id.btnClick);
    btnClick.setOnClickListener(v -> {
        Intent intent = new Intent(MainActivity.this, Welcome.class);
        intent.putExtra("name",txtStudentName.getText().toString());
        startActivity(intent);

    });

    }
}