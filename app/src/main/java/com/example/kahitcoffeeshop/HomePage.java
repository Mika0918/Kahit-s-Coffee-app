package com.example.kahitcoffeeshop;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


        Button fantasyButton = findViewById(R.id.fantasy);
        Button comedyButton = findViewById(R.id.comedy);
        Button adultGenreButton = findViewById(R.id.darkFantasy);
        Button adventureButton = findViewById(R.id.Adventure);

        // Set click listeners for buttons
        fantasyButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomePage.this, Hot.class);
            startActivity(intent);
        });

        comedyButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomePage.this, Cold.class);
            startActivity(intent);
        });

        adultGenreButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomePage.this, Milktea.class);
            startActivity(intent);
        });

        adventureButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomePage.this, Toast.class);
            startActivity(intent);
        });


        CardView cardView1 = findViewById(R.id.onepieceCardview);
        CardView cardView2 = findViewById(R.id.bleachCardview);
        CardView cardView3 = findViewById(R.id.berserkCardview);
        CardView cardView4 = findViewById(R.id.narutoCardview);
        CardView cardView5 = findViewById(R.id.sololevelingCardview);
        CardView cardView6 = findViewById(R.id.fairytailCardview);
        CardView cardView7 = findViewById(R.id.hunterxhunterCardview);
        CardView cardView8 = findViewById(R.id.jujutsukaisenCardview);


        cardView1.setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, Puff.class);
            startActivity(intent);
        });


        cardView2.setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, misto.class);
            startActivity(intent);
        });


        cardView3.setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, latte.class);
            startActivity(intent);
        });


        cardView4.setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, Naruto.class);
            startActivity(intent);
        });

        cardView5.setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, filo.class);
            startActivity(intent);
        });


        cardView6.setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, cup.class);
            startActivity(intent);
        });

        cardView7.setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, matcha.class);
            startActivity(intent);
        });

        cardView8.setOnClickListener(view -> {
            Intent intent = new Intent(HomePage.this, Iced.class);
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
    }}