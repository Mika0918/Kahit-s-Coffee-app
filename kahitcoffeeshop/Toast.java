package com.example.kahitcoffeeshop;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.comicshub.R;

public class Toast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cold);


        // Find buttons
        Button fantasyButton = findViewById(R.id.fantasy);
        Button comedyButton = findViewById(R.id.comedy);
        Button adultGenreButton = findViewById(R.id.darkFantasy);
        Button adventureButton = findViewById(R.id.Adventure);

        // Set click listeners for buttons
        fantasyButton.setOnClickListener(v -> {
            Intent intent = new Intent(Toast.this, Hot.class);
            startActivity(intent);
        });

        comedyButton.setOnClickListener(v -> {
            Intent intent = new Intent(Toast.this, Cold.class);
            startActivity(intent);
        });

        adultGenreButton.setOnClickListener(v -> {
            Intent intent = new Intent(Toast.this, Milktea.class);
            startActivity(intent);
        });

        adventureButton.setOnClickListener(v -> {
            Intent intent = new Intent(Toast.this, Toast.class);
            startActivity(intent);
        });

        // Find card views
        CardView cardView1 = findViewById(R.id.onepieceCardview);
        CardView cardView2 = findViewById(R.id.bleachCardview);
        CardView cardView3 = findViewById(R.id.berserkCardview);
        CardView cardView4 = findViewById(R.id.narutoCardview);
        CardView cardView5 = findViewById(R.id.sololevelingCardview);
        CardView cardView6 = findViewById(R.id.fairytailCardview);
        CardView cardView7 = findViewById(R.id.hunterxhunterCardview);
        CardView cardView8 = findViewById(R.id.jujutsukaisenCardview);

        // Set click listeners for card views
        cardView1.setOnClickListener(view -> {
            Intent intent = new Intent(Toast.this, Puff.class);
            startActivity(intent);
        });

        cardView2.setOnClickListener(view -> {
            Intent intent = new Intent(Toast.this, misto.class);
            startActivity(intent);
        });

        cardView3.setOnClickListener(view -> {
            Intent intent = new Intent(Toast.this, latte.class);
            startActivity(intent);
        });

        cardView4.setOnClickListener(view -> {
            Intent intent = new Intent(Toast.this, Naruto.class);
            startActivity(intent);
        });

        cardView5.setOnClickListener(view -> {
            Intent intent = new Intent(Toast.this, filo.class);
            startActivity(intent);
        });

        cardView6.setOnClickListener(view -> {
            Intent intent = new Intent(Toast.this, cup.class);
            startActivity(intent);
        });

        cardView7.setOnClickListener(view -> {
            Intent intent = new Intent(Toast.this, matcha.class);
            startActivity(intent);
        });

        cardView8.setOnClickListener(view -> {
            Intent intent = new Intent(Toast.this, Iced.class);
            startActivity(intent);
        });
    }
}
