package com.example.mytree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class my_forest extends AppCompatActivity {

    private ImageView go_back_button;
    private ImageView go_to_lifestage_calc;
    private ImageView go_to_plant_tree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_forest);

        go_back_button = (ImageView) findViewById(R.id.返回鍵_image);
        go_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(my_forest.this, koko_home_page.class);
                startActivity(intent);
            }
        });

        go_to_lifestage_calc = (ImageView) findViewById(R.id.理財試算_image);
        go_to_lifestage_calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(my_forest.this, lifestage_calc.class);
                startActivity(intent);
            }
        });

        go_to_plant_tree = (ImageView) findViewById(R.id.建立小樹苗_image);
        go_to_plant_tree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(my_forest.this, plant_tree.class);
                startActivity(intent);
            }
        });
    }
}