package com.app.mapping;

import com.app.model.Cinema;
import org.springframework.jdbc.core.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

public class CinemaMapper implements RowMapper<Cinema> {
    public Cinema mapRow(ResultSet resultSet, int i) throws SQLException {
        Cinema cinema = new Cinema();
        cinema.setId(resultSet.getInt("ID"));
        cinema.setName(resultSet.getString("name"));

        return cinema;
    }
}
