
package com.example.kahitcoffeeshop;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class QuantityActivity extends AppCompatActivity {

    private int quantity = 1;
    private TextView textQuantity;
    private SQLiteHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quantity);

        dbHelper = new SQLiteHelper(this);

        textQuantity = findViewById(R.id.text_quantity);

        findViewById(R.id.button_increase).setOnClickListener(v -> {
            quantity++;
            updateQuantityText();
        });

        findViewById(R.id.button_decrease).setOnClickListener(v -> {
            if (quantity > 1) {
                quantity--;
                updateQuantityText();
            }
        });

        findViewById(R.id.button_save).setOnClickListener(v -> {
            dbHelper.insertQuantity(quantity);
            Intent intent = new Intent(QuantityActivity.this, Successfullybuy.class);
            startActivity(intent);
        });

        updateQuantityText();
    }

    @SuppressLint("SetTextI18n")
    private void updateQuantityText() {
        textQuantity.setText("Quantity: " + quantity);
    }
}
