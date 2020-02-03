package com.app.dao;

import com.app.model.Movie;

import java.util.List;

public interface MovieDao {
    List<Movie> findAll();

    void create(Movie movie);

    void update(Movie movie);

    Movie getById(int id);
}
