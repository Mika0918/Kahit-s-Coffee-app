package com.example.kahitcoffeeshop;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.comicshub.R;

public class Cold extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);


        // Find buttons
        Button fantasyButton = findViewById(R.id.fantasy);
        Button comedyButton = findViewById(R.id.comedy);
        Button adultGenreButton = findViewById(R.id.darkFantasy);
        Button adventureButton = findViewById(R.id.Adventure);

        // Set click listeners for buttons
        fantasyButton.setOnClickListener(v -> {
            Intent intent = new Intent(Cold.this, Hot.class);
            startActivity(intent);
        });

        comedyButton.setOnClickListener(v -> {
            Intent intent = new Intent(Cold.this, Cold.class);
            startActivity(intent);
        });

        adultGenreButton.setOnClickListener(v -> {
            Intent intent = new Intent(Cold.this, Milktea.class);
            startActivity(intent);
        });

        adventureButton.setOnClickListener(v -> {
            Intent intent = new Intent(Cold.this, Toast.class);
            startActivity(intent);
        });

        // Find card views
        CardView cardView1 = findViewById(R.id.onepieceCardview);
        CardView cardView4 = findViewById(R.id.narutoCardview);
        CardView cardView6 = findViewById(R.id.fairytailCardview);


        // Set click listeners for card views
        cardView1.setOnClickListener(view -> {
            Intent intent = new Intent(Cold.this, Puff.class);
            startActivity(intent);
        });


        cardView4.setOnClickListener(view -> {
            Intent intent = new Intent(Cold.this, Naruto.class);
            startActivity(intent);
        });


        cardView6.setOnClickListener(view -> {
            Intent intent = new Intent(Cold.this, cup.class);
            startActivity(intent);
        });

    }
}
