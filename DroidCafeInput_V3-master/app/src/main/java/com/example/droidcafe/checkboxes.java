package com.example.droidcafe;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class checkboxes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkboxes);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final CheckBox orio = (CheckBox)findViewById(R.id.orioCookies);
        final CheckBox sprinkles = (CheckBox)findViewById(R.id.Sprinkles);
        final CheckBox nuts = (CheckBox)findViewById(R.id.chrushedNuts);
        final CheckBox choc = (CheckBox)findViewById(R.id.chocoSyrup);
        final CheckBox cherries = (CheckBox)findViewById(R.id.cherries);

        Button btn = (Button)findViewById(R.id.toasty) ;

        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String result = "You Ordered: ";
                if(orio.isChecked())
                    result+="Orio, ";
                if(sprinkles.isChecked())
                    result+="Sprinkles, ";
                if(cherries.isChecked())
                    result+="Cherries, ";
                if(choc.isChecked())
                    result+="chocolate,";
                if(nuts.isChecked())
                    result+=" Chrushed Nuts";

                displayToast(result);
            }

        });

//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }
    public void displayToast(String message) {


        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }
}

