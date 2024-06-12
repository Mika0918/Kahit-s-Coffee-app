package com.example.kahitcoffeeshop;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.comicshub.R;

public class Milktea extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milktea);

        // Find buttons
        Button fantasyButton = findViewById(R.id.fantasy);
        Button comedyButton = findViewById(R.id.comedy);
        Button adultGenreButton = findViewById(R.id.darkFantasy);
        Button adventureButton = findViewById(R.id.Adventure);

        // Set click listeners for buttons
        fantasyButton.setOnClickListener(v -> {
            Intent intent = new Intent(Milktea.this, Hot.class);
            startActivity(intent);
        });

        comedyButton.setOnClickListener(v -> {
            Intent intent = new Intent(Milktea.this, Cold.class);
            startActivity(intent);
        });

        adultGenreButton.setOnClickListener(v -> {
            Intent intent = new Intent(Milktea.this, Milktea.class);
            startActivity(intent);
        });

        adventureButton.setOnClickListener(v -> {
            Intent intent = new Intent(Milktea.this, Toast.class);
            startActivity(intent);
        });

        // Find card views
        CardView cardView1 = findViewById(R.id.onepieceCardview);
        CardView cardView3 = findViewById(R.id.berserkCardview);
        CardView cardView7 = findViewById(R.id.hunterxhunterCardview);

        // Set click listeners for card views
        cardView1.setOnClickListener(view -> {
            Intent intent = new Intent(Milktea.this, Puff.class);
            startActivity(intent);
        });

        cardView3.setOnClickListener(view -> {
            Intent intent = new Intent(Milktea.this, latte.class);
            startActivity(intent);
        });

        cardView7.setOnClickListener(view -> {
            Intent intent = new Intent(Milktea.this, matcha.class);
            startActivity(intent);
        });
    }
}
