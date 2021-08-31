package com.rujirakongsomran.restaurantfooddeliveryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.os.Bundle;
import android.view.View;

import com.rujirakongsomran.restaurantfooddeliveryapp.adapter.BestForYouAdapter;
import com.rujirakongsomran.restaurantfooddeliveryapp.databinding.ActivityMainBinding;
import com.rujirakongsomran.restaurantfooddeliveryapp.model.BestForYou;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    BestForYouAdapter bestForYouAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
//        setContentView(R.layout.activity_main);
    }

    private void setBestForYouRecyclerView(List<BestForYou> bestForYouList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(
                this,
                RecyclerView.HORIZONTAL, false);
        binding.recyclerview.setLayoutManager(layoutManager);
        bestForYouAdapter = new BestForYouAdapter(this, bestForYouList);
        binding.recyclerview.setAdapter(bestForYouAdapter);
    }
}