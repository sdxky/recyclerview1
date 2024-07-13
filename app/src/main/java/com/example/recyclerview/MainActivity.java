package com.example.recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> foodList = new ArrayList<>();
    private RecyclerView rvFood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rvFood = findViewById(R.id.rv_food);
        foodList.add("Pizza");
        foodList.add("Burger");
        foodList.add("Pasta");
        foodList.add("Salad");
        foodList.add("Sushi");


        FoodAdapter adapter = new FoodAdapter(foodList);
        rvFood.setAdapter(adapter);
    }
}