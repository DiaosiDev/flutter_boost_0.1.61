package com.damon.fluuterboostdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.idlefish.flutterboost.containers.BoostFlutterActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent intent = BoostFlutterActivity.withNewEngine().url("first").build(this);
        startActivity(intent);
    }
}
