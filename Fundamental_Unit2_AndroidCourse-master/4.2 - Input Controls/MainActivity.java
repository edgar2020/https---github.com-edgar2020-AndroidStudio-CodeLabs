package com.example.checkboxandstuff;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox top1_choco, top2_spinkles, top3_nuts, top4_cherries, top5_orio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        top1_choco = findViewById(R.id.chocoSyrup);
        top2_spinkles = findViewById(R.id.sprinkles);
        top3_nuts = findViewById(R.id.nuts);
        top4_cherries = findViewById(R.id.cherries);
        top5_orio = findViewById(R.id.orio);

    }

    public void onSubmit(View view) {

        String submitMessage = "Toppings: ";

        if (top1_choco.isChecked())
        {
            submitMessage += "Chocolate Syrup ";
        }
        if (top2_spinkles.isChecked())
        {
            submitMessage += "Sprinkles ";
        }
        if (top3_nuts.isChecked())
        {
            submitMessage += "Crushed Nuts ";
        }
        if (top4_cherries.isChecked())
        {
            submitMessage += "Cherries ";
        }
        if (top5_orio.isChecked())
        {
            submitMessage += "Orio Cookie Crumbles";
        }

        displayToast(submitMessage);
    }

        public void displayToast (String message)
        {
            Toast.makeText(getApplicationContext(), message,
                    Toast.LENGTH_SHORT).show();
        }

}
