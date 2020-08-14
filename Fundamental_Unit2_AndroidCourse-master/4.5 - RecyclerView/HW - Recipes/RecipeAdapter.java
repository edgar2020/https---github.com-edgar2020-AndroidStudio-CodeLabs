package com.example.recipes;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class RecipeAdaptor extends RecyclerView.Adapter<RecipeAdaptor.ViewHolder>
{

    private ArrayList<String> mRecipeNames;
    private ArrayList<String> mRecipeDescriptions;
    private Context mContext;

    public RecipeAdaptor(Context mContext, ArrayList<String> mRecipeNames, ArrayList<String> mRecipeDescriptions) {
        this.mRecipeNames = mRecipeNames;
        this.mRecipeDescriptions = mRecipeDescriptions;
        this.mContext = mContext;
    }

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recipelist_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }
    public void onBindViewHolder(ViewHolder holder, final int position)
    {
        String mName = mRecipeNames.get(position);
        holder.recipeName.setText(mName);

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Toast.makeText(mContext, "Clicked " + mRecipeNames.get(position), Toast.LENGTH_SHORT).show();

                if (mRecipeNames.get(position).equals("Banana Bread"))
                {
                    Intent intent = new Intent(mContext, BananaActivity.class);
                    mContext.startActivity(intent);
                }
                if (mRecipeNames.get(position).equals("Birthday Cake"))
                {
                    Intent intent = new Intent(mContext, BirthdayActivity.class);
                    mContext.startActivity(intent);
                }
                if (mRecipeNames.get(position).equals("Oreo Truffles"))
                {
                    Intent intent = new Intent(mContext, OreoActivity.class);
                    mContext.startActivity(intent);
                }
                if (mRecipeNames.get(position).equals("Neapolitan Bundt Cake"))
                {
                    Intent intent = new Intent(mContext, NeapolitanActivity.class);
                    mContext.startActivity(intent);
                }
                if (mRecipeNames.get(position).equals("Brownie Lasagna"))
                {
                    Intent intent = new Intent(mContext, BrownieActivity.class);
                    mContext.startActivity(intent);
                }
                if (mRecipeNames.get(position).equals("Pumpkin Cheesecake Roll"))
                {
                    Intent intent = new Intent(mContext, PumpkinActivity.class);
                    mContext.startActivity(intent);
                }
            }
        });

        String mDescription = mRecipeDescriptions.get(position);
        holder.recipeDescription.setText(mDescription);
    }
    public int getItemCount()
    {
        return mRecipeNames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView recipeName;
        TextView recipeDescription;
        LinearLayout parentLayout;

        public ViewHolder(View itemView)
        {
            super(itemView);
            recipeName = itemView.findViewById(R.id.recipe_title);
            recipeDescription = itemView.findViewById(R.id.recipe_description);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}
