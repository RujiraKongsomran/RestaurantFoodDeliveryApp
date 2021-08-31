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
        return new BestForYouViewHolder(LayoutInflater.from(context).inflate(R.layout.best_for_you_row_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BestForYouViewHolder holder, int position) {
        holder.ivItemImage.setImageResource(bestForYouList.get(position).getImageUrl());
        holder.tvItemName.setText(bestForYouList.get(position).getName());
        holder.tvItemTime.setText(bestForYouList.get(position).getTime());
        holder.tvItemPrice.setText(bestForYouList.get(position).getPrice());
        holder.ratingBar.setRating(Float.parseFloat(bestForYouList.get(position).getRating()));
    }

    @Override
    public int getItemCount() {
        return bestForYouList.size();
    }

    public static final class BestForYouViewHolder extends RecyclerView.ViewHolder {

        ImageView ivItemImage;
        TextView tvItemName, tvItemPrice, tvItemTime;
        RatingBar ratingBar;

        public BestForYouViewHolder(@NonNull View itemView) {
            super(itemView);

            ivItemImage = itemView.findViewById(R.id.ivItemImage);
            tvItemName = itemView.findViewById(R.id.tvItemName);
            tvItemPrice = itemView.findViewById(R.id.tvItemPrice);
            tvItemTime = itemView.findViewById(R.id.tvItemTime);
            ratingBar = itemView.findViewById(R.id.ratingBar);
        }
    }
}
