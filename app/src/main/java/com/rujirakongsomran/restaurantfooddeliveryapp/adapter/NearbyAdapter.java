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
        return new NearbyViewHolder(LayoutInflater.from(context).inflate(R.layout.near_by_row_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NearbyViewHolder holder, int position) {
        holder.ivNearByItemImage.setImageResource(nearByList.get(position).getImageUrl());
        holder.tvNearByItemName.setText(nearByList.get(position).getName());
        holder.tvNearByItemPrice.setText(nearByList.get(position).getTime());
    }

    @Override
    public int getItemCount() {
        return nearByList.size();
    }

    public static final class NearbyViewHolder extends RecyclerView.ViewHolder {

        ImageView ivNearByItemImage;
        TextView tvNearByItemName, tvNearByItemPrice;

        public NearbyViewHolder(@NonNull View itemView) {
            super(itemView);

            ivNearByItemImage = itemView.findViewById(R.id.ivNearByItemImage);
            tvNearByItemName = itemView.findViewById(R.id.tvNearByItemName);
            tvNearByItemPrice = itemView.findViewById(R.id.tvNearByItemPrice);
        }
    }
}
