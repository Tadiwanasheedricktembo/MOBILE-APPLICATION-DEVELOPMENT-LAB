package com.tadiwatembo.helloworld;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.tadiwatembo.helloworld.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText edtName = findViewById(R.id.edtName);
        Button btnSayHello = findViewById(R.id.btnSayHello);
        TextView txtGreeting = findViewById(R.id.txtGreeting);

        btnSayHello.setOnClickListener(v -> {
            String name = edtName.getText().toString().trim();
            if (!name.isEmpty()) {
                txtGreeting.setText("Hello " + name);
            } else {
                txtGreeting.setText("Please enter a name");
            }
        });
    }
}