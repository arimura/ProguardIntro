package com.example.proguardintro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.proguardintro.bar.Cat;
import com.example.proguardintro.foo.Hoge;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Hoge hoge = new Hoge();
        hoge.hogeMethod();

        new Cat();
    }
}