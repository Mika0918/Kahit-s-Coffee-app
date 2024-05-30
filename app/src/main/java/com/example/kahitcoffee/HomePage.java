package com.example.kahitcoffee;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.comicshub.R;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


        CardView cardView1 = findViewById(R.id.cuppucinoCardView);
        CardView cardView2 = findViewById(R.id.latteCardview);
        CardView cardView3 = findViewById(R.id.MistoCardview);
        CardView cardView4 = findViewById(R.id.americanoCardview);


        cardView1.setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, misto.class);
            startActivity(intent);
        });


        cardView2.setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, cuppuccino.class);
            startActivity(intent);
        });


        cardView3.setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, americano.class);
            startActivity(intent);
        });


        cardView4.setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, Latte.class);
            startActivity(intent);
        });


        findViewById(R.id.exploreLayout).setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, HomePage.class);
            startActivity(intent);
        });

        findViewById(R.id.cartLayout).setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, Cart.class);
            startActivity(intent);
        });

        findViewById(R.id.wishlistLayout).setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, Wishlist.class);
            startActivity(intent);
        });

        findViewById(R.id.myOrderLayout).setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, MyOrder.class);
            startActivity(intent);
        });

        findViewById(R.id.profileLayout).setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, Myprofile.class);
            startActivity(intent);
        });
    }
}