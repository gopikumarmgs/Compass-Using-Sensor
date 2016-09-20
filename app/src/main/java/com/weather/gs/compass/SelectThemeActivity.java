package com.weather.gs.compass;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Ben10 on 8/11/16.
 */

public class SelectThemeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_theme);

        findViewById(R.id.theme1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(1);
                finish();
            }
        });
        findViewById(R.id.theme2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(2);
                finish();
            }
        });
        findViewById(R.id.theme3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(3);
                finish();
            }
        });
        findViewById(R.id.theme4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(4);
                finish();
            }
        });

    }
}
