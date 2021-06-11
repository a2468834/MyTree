package com.example.mytree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class first_one_million extends AppCompatActivity {

    private ImageView go_back_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_one_million);

        go_back_button = (ImageView) findViewById(R.id.返回鍵_image);
        go_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(first_one_million.this, lifestage_calc.class);
                startActivity(intent);
            }
        });
    }
}