package com.example.mytree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class list_all_pages extends AppCompatActivity {

    private Button button_1;
    private Button button_2;
    private Button button_3;
    private Button button_4;
    private Button button_5;
    private Button button_6;
    private Button button_7;
    private Button button_8;
    private Button button_9;
    private Button button_10;
    private Button button_11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_all_pages);

        button_1 = (Button) findViewById(R.id.button_1);
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(list_all_pages.this, buy_house.class);
                intent.putExtra("next_activity_name", "import_transaction");
                startActivity(intent);
            }
        });

        button_2 = (Button) findViewById(R.id.button_2);
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(list_all_pages.this, children_education_p1.class);
                intent.putExtra("next_activity_name", "import_transaction");
                startActivity(intent);
            }
        });

        button_3 = (Button) findViewById(R.id.button_3);
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(list_all_pages.this, children_education_p2.class);
                intent.putExtra("next_activity_name", "import_transaction");
                startActivity(intent);
            }
        });

        button_4 = (Button) findViewById(R.id.button_4);
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(list_all_pages.this, first_one_million.class);
                intent.putExtra("next_activity_name", "import_transaction");
                startActivity(intent);
            }
        });

        button_5 = (Button) findViewById(R.id.button_5);
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(list_all_pages.this, import_transaction.class);
                intent.putExtra("next_activity_name", "import_transaction");
                startActivity(intent);
            }
        });

        button_6 = (Button) findViewById(R.id.button_6);
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(list_all_pages.this, koko_home_page.class);
                intent.putExtra("next_activity_name", "import_transaction");
                startActivity(intent);
            }
        });

        button_7 = (Button) findViewById(R.id.button_7);
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(list_all_pages.this, lifestage_calc.class);
                intent.putExtra("next_activity_name", "import_transaction");
                startActivity(intent);
            }
        });

        button_8 = (Button) findViewById(R.id.button_8);
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(list_all_pages.this, my_forest.class);
                intent.putExtra("next_activity_name", "import_transaction");
                startActivity(intent);
            }
        });

        button_9 = (Button) findViewById(R.id.button_9);
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(list_all_pages.this, preview_building_tree.class);
                intent.putExtra("next_activity_name", "import_transaction");
                startActivity(intent);
            }
        });

        button_10 = (Button) findViewById(R.id.button_10);
        button_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(list_all_pages.this, suggest_dn_cathay_app.class);
                intent.putExtra("next_activity_name", "import_transaction");
                startActivity(intent);
            }
        });

        button_11 = (Button) findViewById(R.id.button_11);
        button_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(list_all_pages.this, want_retire.class);
                intent.putExtra("next_activity_name", "import_transaction");
                startActivity(intent);
            }
        });
    }
}