package com.app.dao;

import com.app.mapping.MovieMapper;

import com.app.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieDaoImpl implements MovieDao {
    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public MovieDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Movie> findAll() {
        String sql = " SELECT*from movie";
        return jdbcTemplate.query(sql, new MovieMapper());
    }

    @Override
    public void create(Movie movie) {
        String sql = "INSERT INTO movie ( Name, Description) VALUES (?, ?)";
        jdbcTemplate.update(sql, movie.getName(), movie.getDescription());
    }

    @Override
    public void update(Movie movie) {
        String sql = "UPDATE movie SET Name = ?, Description = ? WHERE ID = ?";
        jdbcTemplate.update(sql, movie.getName(), movie.getDescription(), movie.getId());
    }

    @Override
    public Movie getById(int id) {
        String sql = "SELECT * FROM author WHERE ID = ?";
        return jdbcTemplate.queryForObject(sql, new MovieMapper(), id);
    }
}
