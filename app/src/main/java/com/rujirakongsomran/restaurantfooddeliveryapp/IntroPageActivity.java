package com.rujirakongsomran.restaurantfooddeliveryapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.rujirakongsomran.restaurantfooddeliveryapp.databinding.ActivityIntroPageBinding;

public class IntroPageActivity extends AppCompatActivity {

    private ActivityIntroPageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_intro_page);
        binding = ActivityIntroPageBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btnGetStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IntroPageActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}