package com.vitor.spirometernweighscale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_weighscale;
    Button btn_spirometer;
    Button btn_WSSample1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_weighscale = (Button) findViewById(R.id.button_weighscale);
        btn_spirometer = (Button) findViewById(R.id.button_spirometer);
        btn_WSSample1 = (Button) findViewById(R.id.button_weighscale_sample1);

        btn_weighscale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent weighScaleIntent = new Intent(MainActivity.this,WeighScaleActivity.class);
                startActivity(weighScaleIntent);
            }
        });

        btn_spirometer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent weighScaleIntent = new Intent(MainActivity.this,SpirometerActivity.class);
                startActivity(weighScaleIntent);
            }
        });

        btn_WSSample1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent weighScaleIntent = new Intent(MainActivity.this,WeighScaleSample1Activity.class);
                startActivity(weighScaleIntent);
            }
        });

    }
}
