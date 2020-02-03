package com.app.mapping;

import com.app.model.Movie;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieMapper implements RowMapper<Movie> {
    public Movie mapRow(ResultSet resultSet, int i) throws SQLException {
        Movie movie = new Movie();
        movie.setId(resultSet.getInt("ID"));
        movie.setName(resultSet.getString("name"));
        movie.setDescription(resultSet.getString("description"));
        return movie;
    }
}
