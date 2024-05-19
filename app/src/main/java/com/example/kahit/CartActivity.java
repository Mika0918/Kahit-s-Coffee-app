package com.example.kahit;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class CartActivity extends AppCompatActivity {

    private MenuAdapter cartAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        ListView cartListView = findViewById(R.id.cart_list);


        cartAdapter = new MenuAdapter(this, MenuActivity.menuAdapter.getCartItems());
        cartListView.setAdapter(cartAdapter);
    }
}
