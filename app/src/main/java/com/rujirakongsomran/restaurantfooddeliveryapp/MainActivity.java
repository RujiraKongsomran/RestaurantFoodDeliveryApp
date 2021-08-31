package com.rujirakongsomran.restaurantfooddeliveryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.View;

import com.rujirakongsomran.restaurantfooddeliveryapp.adapter.BestForYouAdapter;
import com.rujirakongsomran.restaurantfooddeliveryapp.adapter.NearbyAdapter;
import com.rujirakongsomran.restaurantfooddeliveryapp.databinding.ActivityMainBinding;
import com.rujirakongsomran.restaurantfooddeliveryapp.model.BestForYou;
import com.rujirakongsomran.restaurantfooddeliveryapp.model.NearBy;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    BestForYouAdapter bestForYouAdapter;
    NearbyAdapter nearbyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
//        setContentView(R.layout.activity_main);
        List<BestForYou> bestForYouList = new ArrayList<>();
        bestForYouList.add(new BestForYou(
                "Pasta",
                "3.2",
                "30 min",
                "$10",
                R.drawable.bestforyou1));
        bestForYouList.add(new BestForYou(
                "Biryani",
                "4.2",
                "40 min",
                "$30",
                R.drawable.bestforyou2));
        bestForYouList.add(new BestForYou(
                "Singapore Rice",
                "4.2",
                "55 min",
                "$50",
                R.drawable.bestforyou3));
        bestForYouList.add(new BestForYou(
                "Pasta",
                "3.2",
                "30 min",
                "$10",
                R.drawable.bestforyou1));
        bestForYouList.add(new BestForYou(
                "Biryani",
                "4.2",
                "40 min",
                "$30",
                R.drawable.bestforyou2));
        bestForYouList.add(new BestForYou(
                "Singapore Rice",
                "4.2",
                "55 min",
                "$50",
                R.drawable.bestforyou3));

        setBestForYouRecyclerView(bestForYouList);

        List<NearBy> nearByList = new ArrayList<>();
        nearByList.add(new NearBy("Sagar Ratna", R.drawable.nearby, "35 min"));
        nearByList.add(new NearBy("Haldi Ram", R.drawable.nearby, "45 min"));
        nearByList.add(new NearBy("KFC", R.drawable.nearby, "55 min"));

        setNearbyRecyclerView(nearByList);
    }

    private void setBestForYouRecyclerView(List<BestForYou> bestForYouList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(
                this,
                RecyclerView.HORIZONTAL, false);
        binding.recyclerview.setLayoutManager(layoutManager);
        bestForYouAdapter = new BestForYouAdapter(this, bestForYouList);
        binding.recyclerview.setAdapter(bestForYouAdapter);
    }

    private void setNearbyRecyclerView(List<NearBy> nearByList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(
                this,
                RecyclerView.HORIZONTAL, false);
        binding.recyclerviewNearby.setLayoutManager(layoutManager);
        nearbyAdapter = new NearbyAdapter(this, nearByList);
        binding.recyclerviewNearby.setAdapter(nearbyAdapter);
    }
}