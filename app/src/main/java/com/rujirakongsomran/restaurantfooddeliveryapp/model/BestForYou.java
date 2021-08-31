package com.rujirakongsomran.restaurantfooddeliveryapp.model;

public class BestForYou {
    private String name;
    private Integer rating;
    private String time;
    private String price;
    private Integer imageUrl;

    public BestForYou() {
    }

    public BestForYou(String name, Integer rating, String time, String price, Integer imageUrl) {
        this.name = name;
        this.rating = rating;
        this.time = time;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }
}
