package com.app.service;

import com.app.model.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> findAll();

    Movie getById(int id);
    void create(Movie movie);

    void update(Movie movie);
}
