package com.example.finalproject2048java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private float x1,x2,y1,y2;
    static final int MIN_DISTANCE = 250;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[][] grid = new int[4][4];

    }


    @Override
    public boolean onTouchEvent(MotionEvent event){
        switch(event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                x1 = event.getX();
                y1 = event.getY();
                break;
            case MotionEvent.ACTION_UP:
                x2 = event.getX();
                y2 = event.getY();

                float deltaY = y2 - y1;
                float deltaX = x2 - x1;
                if (Math.abs(deltaX) > MIN_DISTANCE && deltaX > 0){
                    Toast.makeText(this, "left2right swipe", Toast.LENGTH_SHORT).show();
                }
                else if(Math.abs(deltaX) > MIN_DISTANCE && deltaX < 0){
                    Toast.makeText(this, "right2left swipe", Toast.LENGTH_SHORT).show();
                }

                if (Math.abs(deltaY) > MIN_DISTANCE && deltaY > 0){
                    Toast.makeText(this, "up2down swipe", Toast.LENGTH_SHORT).show();
                }
                else if(Math.abs(deltaY) > MIN_DISTANCE && deltaY < 0){
                    Toast.makeText(this, "down2up swipe", Toast.LENGTH_SHORT).show();
                }
                break;
        }
        return super.onTouchEvent(event);
    }
}
