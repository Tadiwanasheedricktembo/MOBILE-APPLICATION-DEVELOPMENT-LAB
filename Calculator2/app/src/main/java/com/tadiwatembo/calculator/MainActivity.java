package com.tadiwatembo.calculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

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

        //my buttons are declared here
        Button btnSub = findViewById(R.id.btnSub);
        Button btnAdd = findViewById(R.id.btnAdd);
        Button btnDiv = findViewById(R.id.btnDiv);
        Button btnMul = findViewById(R.id.btnMul);
        TextView txtAnswer = findViewById(R.id.txtAnswer);
        EditText editNum1 = findViewById(R.id.editNum1);
        EditText editNum2 = findViewById(R.id.editNum2);

        btnAdd.setOnClickListener(v -> {
            int num1 = Integer.parseInt(editNum1.getText().toString());
            int num2 = Integer.parseInt(editNum2.getText().toString());
            int sum = num1 + num2;

            txtAnswer.setText(String.valueOf(sum));
        });
        btnSub.setOnClickListener(v -> {
            int num1 = Integer.parseInt(editNum1.getText().toString());
            int num2 = Integer.parseInt(editNum2.getText().toString());
            int sub = num1 - num2;
            txtAnswer.setText(String.valueOf(sub));
        });

        btnDiv.setOnClickListener(v -> {
            int num1 = Integer.parseInt(editNum1.getText().toString());
            int num2 = Integer.parseInt(editNum2.getText().toString());
            int div = num1 / num2;
            txtAnswer.setText(String.valueOf(div));
        });
        btnMul.setOnClickListener(v -> {
            int num1 = Integer.parseInt(editNum1.getText().toString());
            int num2 = Integer.parseInt(editNum2.getText().toString());
            int mul = num1 * num2;
            txtAnswer.setText(String.valueOf(mul));
        });
    }
}



