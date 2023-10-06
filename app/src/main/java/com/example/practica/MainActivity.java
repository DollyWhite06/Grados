package com.example.practica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import Modelo.Celsius;
import Modelo.Farenhit;
import Modelo.Kelvin;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Celsius celsius = new Celsius(0.0, "C");

        Farenhit farenhit = new Farenhit(0.0, "F");
        Kelvin kelvin = new Kelvin(0.0, "K");

    }
}