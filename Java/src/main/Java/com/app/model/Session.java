package com.app.model;

import javax.persistence.Entity;

@Entity
public class Session {
    private int id;
    private String date_time;
    private int movie;
    private int cinema;
    private int price;

    public Session() {
    }

    public Session(int id, String date_time, int movie, int cinema, int price) {
        this.id = id;
        this.date_time = date_time;
        this.movie = movie;
        this.cinema = cinema;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public int getMovie() {
        return movie;
    }

    public void setMovie(int movie) {
        this.movie = movie;
    }

    public int getCinema() {
        return cinema;
    }

    public void setCinema(int cinema) {
        this.cinema = cinema;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}