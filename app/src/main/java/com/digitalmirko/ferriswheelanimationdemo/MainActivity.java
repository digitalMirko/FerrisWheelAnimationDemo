package com.digitalmirko.ferriswheelanimationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ru.github.igla.ferriswheel.FerrisWheelView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FerrisWheelView ferrisWheelView = (FerrisWheelView) findViewById(R.id.ferrisWheelView);
        ferrisWheelView.startAnimation();
    }
}
