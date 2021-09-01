package com.rujirakongsomran.restaurantfooddeliveryapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rujirakongsomran.restaurantfooddeliveryapp.R;
import com.rujirakongsomran.restaurantfooddeliveryapp.databinding.BestForYouRowItemBinding;
import com.rujirakongsomran.restaurantfooddeliveryapp.databinding.NearByRowItemBinding;
import com.rujirakongsomran.restaurantfooddeliveryapp.model.NearBy;

import java.util.List;

public class NearbyAdapter extends RecyclerView.Adapter<NearbyAdapter.NearbyViewHolder> {

    Context context;
    List<NearBy> nearByList;

    public NearbyAdapter(Context context, List<NearBy> nearByList) {
        this.context = context;
        this.nearByList = nearByList;
    }

    @NonNull
    @Override
    public NearbyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NearbyViewHolder(NearByRowItemBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NearbyViewHolder holder, int position) {
        holder.binding.ivNearByItemImage.setImageResource(nearByList.get(position).getImageUrl());
        holder.binding.tvNearByItemName.setText(nearByList.get(position).getName());
        holder.binding.tvNearByItemPrice.setText(nearByList.get(position).getTime());
    }

    @Override
    public int getItemCount() {
        return nearByList.size();
    }

    public static final class NearbyViewHolder extends RecyclerView.ViewHolder {

        NearByRowItemBinding binding;

        public NearbyViewHolder(@NonNull NearByRowItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
