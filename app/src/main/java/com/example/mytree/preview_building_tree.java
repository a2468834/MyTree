package com.example.mytree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class preview_building_tree extends AppCompatActivity {

    private TextView test_textview;
    private Bundle intent_bundle;

    private ImageView go_back_button;
    private TextView next_page_button_text;
    private View next_page_button_rectangle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview_building_tree);

        go_back_button = (ImageView) findViewById(R.id.返回鍵_image);
        go_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(preview_building_tree.this, lifestage_calc.class);
                startActivity(intent);
            }
        });

        next_page_button_text = (TextView) findViewById(R.id.text_3);
        next_page_button_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(preview_building_tree.this, plant_tree.class);
                startActivity(intent);
            }
        });

        next_page_button_rectangle = (View) findViewById(R.id.rectangle_small);
        next_page_button_rectangle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(preview_building_tree.this, plant_tree.class);
                startActivity(intent);
            }
        });

        {
            String test_log_str = "";
            intent_bundle = getIntent().getExtras();

            if(intent_bundle != null){
                for(String key : intent_bundle.keySet()){
                    test_log_str += intent_bundle.get(key) != null ? intent_bundle.get(key) : "";
                    test_log_str += "\n";
                }
            }

            test_textview = (TextView) findViewById(R.id.test_log_text);
            test_textview.setText(test_log_str);
        }
    }
}