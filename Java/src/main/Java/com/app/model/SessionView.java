package com.app.model;

public class SessionView {

    private String movie_name;
    private String movie_description;
    private String cinema_name;
    private String session_date_time;
    private int session_price;

    public SessionView() {
    }

    public SessionView(String movie_name, String movie_description, String cinema_name, String session_date_time, int session_price) {
        this.movie_name = movie_name;
        this.movie_description = movie_description;
        this.cinema_name = cinema_name;
        this.session_date_time = session_date_time;
        this.session_price = session_price;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getMovie_description() {
        return movie_description;
    }

    public void setMovie_description(String movie_description) {
        this.movie_description = movie_description;
    }

    public String getCinema_name() {
        return cinema_name;
    }

    public void setCinema_name(String cinema_name) {
        this.cinema_name = cinema_name;
    }

    public String getSession_date_time() {
        return session_date_time;
    }

    public void setSession_date_time(String session_date_time) {
        this.session_date_time = session_date_time;
    }

    public int getSession_price() {
        return session_price;
    }

    public void setSession_price(int session_price) {
        this.session_price = session_price;
    }
}
