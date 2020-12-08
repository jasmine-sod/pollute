package com.jasminesodhi.randomhacksofkindness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mehdi.sakout.fancybuttons.FancyButton;

public class MainActivity extends AppCompatActivity {

    FancyButton userLogin, uberLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
