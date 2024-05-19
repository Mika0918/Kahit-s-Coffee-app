package com.example.kahit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

public class MenuAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<MenuItem> items;
    private ArrayList<MenuItem> cartItems;

    public MenuAdapter(Context context, ArrayList<MenuItem> items) {
        this.context = context;
        this.items = items;
        this.cartItems = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_menu, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.menu_item_image);
        TextView nameTextView = convertView.findViewById(R.id.menu_item_name);
        TextView priceTextView = convertView.findViewById(R.id.menu_item_price);
        Button addButton = convertView.findViewById(R.id.btn_add_to_cart);

        final MenuItem menuItem = items.get(position);

    
        nameTextView.setText(menuItem.getName());
        priceTextView.setText(menuItem.getPrice());

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cartItems.add(menuItem);
            }
        });

        return convertView;
    }

    public ArrayList<MenuItem> getCartItems() {
        return cartItems;
    }
}
