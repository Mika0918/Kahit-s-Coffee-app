package com.example.kahit;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    public static MenuAdapter menuAdapter;
    private ArrayList<MenuItem> menuItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ListView menuListView = findViewById(R.id.menu_list);

        menuItems = new ArrayList<>();

        menuItems.add(new MenuItem("Coffee", "2.99", R.drawable.coffee));
        menuItems.add(new MenuItem("Latte", "3.99", R.drawable.latte));

        menuAdapter = new MenuAdapter(this, menuItems);
        menuListView.setAdapter(menuAdapter);
    }
}
