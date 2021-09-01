package com.rujirakongsomran.restaurantfooddeliveryapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rujirakongsomran.restaurantfooddeliveryapp.R;
import com.rujirakongsomran.restaurantfooddeliveryapp.databinding.BestForYouRowItemBinding;
import com.rujirakongsomran.restaurantfooddeliveryapp.model.BestForYou;

import java.util.List;

public class BestForYouAdapter extends RecyclerView.Adapter<BestForYouAdapter.BestForYouViewHolder> {

    Context context;
    List<BestForYou> bestForYouList;

    public BestForYouAdapter(Context context, List<BestForYou> bestForYouList) {
        this.context = context;
        this.bestForYouList = bestForYouList;
    }

    @NonNull
    @Override
    public BestForYouViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BestForYouViewHolder(BestForYouRowItemBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BestForYouViewHolder holder, int position) {
        holder.binding.ivItemImage.setImageResource(bestForYouList.get(position).getImageUrl());
        holder.binding.tvItemName.setText(bestForYouList.get(position).getName());
        holder.binding.tvItemTime.setText(bestForYouList.get(position).getTime());
        holder.binding.tvItemPrice.setText(bestForYouList.get(position).getPrice());
        holder.binding.ratingBar.setRating(Float.parseFloat(bestForYouList.get(position).getRating()));
    }

    @Override
    public int getItemCount() {
        return bestForYouList.size();
    }

    public static final class BestForYouViewHolder extends RecyclerView.ViewHolder {

        BestForYouRowItemBinding binding;

        public BestForYouViewHolder(@NonNull BestForYouRowItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
