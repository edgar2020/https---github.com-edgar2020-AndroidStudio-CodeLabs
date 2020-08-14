package com.example.recipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> mRecipeNames = new ArrayList<>();
    private ArrayList<String> mRecipeDescriptions = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecipes();
    }

    private void initRecipes()
    {
        mRecipeNames.add("Banana Bread");
        mRecipeDescriptions.add("Got some leftover bananas and don't know what to do with them? This simple beginner's recipe will get you started on your baking adventure!");

        mRecipeNames.add("Birthday Cake");
        mRecipeDescriptions.add("Funfetti brings the party! Learn to make this colorful confetti cake with creamy frosting!");

        mRecipeNames.add("Oreo Truffles");
        mRecipeDescriptions.add("Oreos, cream cheese, and white chocolate chips are a match made in dessert heaven.");

        mRecipeNames.add("Neapolitan Bundt Cake");
        mRecipeDescriptions.add("3 flavors in 1. A fudge covered bite-sized cake of yummy goodness!");

        mRecipeNames.add("Brownie Lasagna");
        mRecipeDescriptions.add("Bring the beautiful italian lasagna and give it a sweet twist with this 4 layers brownie tower!");

        mRecipeNames.add("Pumpkin Cheesecake Roll");
        mRecipeDescriptions.add("Because everything tastes better in pumpkin spice! This tasty and moist cake will have yu rolling!");

        initRecyclerView();
    }

    private void initRecyclerView()
    {
        RecyclerView recyclerView = findViewById(R.id.recipeList);
        RecipeAdapter adapter = new  RecipeAdapter(this, mRecipeNames, mRecipeDescriptions);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
