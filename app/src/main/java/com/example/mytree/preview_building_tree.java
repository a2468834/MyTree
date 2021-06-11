package com.example.mytree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
/*
import com.anychart.AnyChart;
import com.anychart.AnyChartView;
import com.anychart.chart.common.dataentry.DataEntry;
import com.anychart.chart.common.dataentry.ValueDataEntry;
import com.anychart.charts.Pie;
import com.anychart.core.ui.Label;
import com.anychart.core.ui.Title;
*/
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class preview_building_tree extends AppCompatActivity {

    private TextView test_textview;
    private Bundle intent_bundle;

    private ImageView go_back_button;
    private TextView next_page_button_text;
    private View next_page_button_rectangle;

    PieChart pie_chart_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview_building_tree);

        pie_chart_view = findViewById(R.id.pie_chart);

        ArrayList<PieEntry> pie_chart_entries = new ArrayList<>();
        pie_chart_entries.add(new PieEntry(55, "機會投資"));
        pie_chart_entries.add(new PieEntry(5, "現金"));
        pie_chart_entries.add(new PieEntry(35, "保值"));

        PieDataSet data_set = new PieDataSet(pie_chart_entries, null);
        data_set.setColors(new int[]{Color.rgb(94, 198, 147), Color.rgb(254, 144, 19), Color.rgb(61, 179, 233)});
        data_set.setValueTextSize(17f);
        data_set.setValueTextColor(Color.BLACK);
        data_set.setValueTypeface(Typeface.DEFAULT_BOLD);
        data_set.setXValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);
        data_set.setYValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);
        data_set.setValueLinePart1OffsetPercentage(100f);
        data_set.setValueLinePart1Length(0.6f);
        data_set.setValueLinePart2Length(0.6f);

        Legend chart_legend = pie_chart_view.getLegend();
        chart_legend.setEnabled(false);
        //chart_legend.setHorizontalAlignment(Legend.LegendHorizontalAlignment.CENTER);
        //chart_legend.setVerticalAlignment(Legend.LegendVerticalAlignment.CENTER);
        //chart_legend.setTextSize(14f);
        //chart_legend.setDrawInside(true);
        //chart_legend.setXEntrySpace(40f);

        pie_chart_view.getDescription().setEnabled(false);
        pie_chart_view.setData(new PieData(data_set));
        pie_chart_view.setDrawHoleEnabled(false);
        //pie_chart_view.setDrawEntryLabels(false);
        pie_chart_view.setEntryLabelColor(Color.BLACK);
        pie_chart_view.setEntryLabelTextSize(14f);
        pie_chart_view.setExtraTopOffset(6f);
        pie_chart_view.setExtraBottomOffset(4f);

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
/*
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
*/
    }
/*
    private Pie drawPieChart(){
        Pie pie = AnyChart.pie();

        pie.background().fill("#ffffff");

        List<DataEntry> data = new ArrayList<>();
        data.add(new ValueDataEntry("John", 10000));
        data.add(new ValueDataEntry("Jake", 12000));
        data.add(new ValueDataEntry("Peter", 18000));

        pie.data(data);
        return pie;
    }
*/
}