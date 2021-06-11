package com.example.mytree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class koko_home_page extends AppCompatActivity {

    private ImageView button_left;
    private ImageView button_right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_koko_home_page);

        button_left = (ImageView) findViewById(R.id.匯入記帳_image);
        button_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(koko_home_page.this, suggest_dn_cathay_app.class);
                intent.putExtra("next_activity_name", "import_transaction");
                startActivity(intent);
            }
        });

        button_right = (ImageView) findViewById(R.id.小樹苗_image);
        button_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(koko_home_page.this, suggest_dn_cathay_app.class);
                intent.putExtra("next_activity_name", "my_forest");
                startActivity(intent);
            }
        });
    }
}