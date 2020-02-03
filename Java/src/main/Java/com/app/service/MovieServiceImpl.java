package com.app.service;

import com.app.dao.MovieDao;
import com.app.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {
    @Autowired
    public MovieDao movieDao;

    @Override
    public List<Movie> findAll() {
        return movieDao.findAll();
    }

    @Override
    public Movie getById(int id) {
        return movieDao.getById(id);
    }

    @Override
    public void create(Movie movie) {
        movieDao.create(movie);
    }

    @Override
    public void update(Movie movie) {
        movieDao.update(movie);
    }
}
