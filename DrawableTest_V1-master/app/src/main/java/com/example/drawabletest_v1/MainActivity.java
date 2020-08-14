package com.example.drawabletest_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView batterylevel;
    Button minus;
    Button plus;
    int count =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        batterylevel = findViewById(R.id.batterylevel);
        minus = findViewById(R.id.minus);
        plus = findViewById(R.id.plus);



    }
    public void plus_onClick(View v)
    {
        count++;

        if (count <= 6 && count >= 0)
        {
            batterylevel.setImageLevel(count);
        }
        if (count > 6)
        {

            count = 6;
        }
    }
    public void minus_onClick(View v)
    {
        count--;
        if(count>0)
            batterylevel.setImageLevel(count);
        if(count<0)
            count=0;
    }

}
