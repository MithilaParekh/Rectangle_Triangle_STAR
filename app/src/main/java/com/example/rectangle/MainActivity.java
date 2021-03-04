package com.example.rectangle;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.example.rectangle.View.MyCanvas;

public class MainActivity extends AppCompatActivity {
MyCanvas myCanvas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myCanvas=new MyCanvas(this);
        myCanvas.setBackgroundColor(Color.YELLOW);
        setContentView(myCanvas);
    }
}