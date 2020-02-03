package com.app.mapping;


import com.app.model.Session;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SessionMapper implements RowMapper<Session> {

    public Session mapRow(ResultSet resultSet, int i) throws SQLException {
        Session session = new Session();
        session.setId(resultSet.getInt("ID"));
        session.setPrice(resultSet.getInt("price"));
        session.setDate_time(resultSet.getString("session.date_time"));
        session.setMovie(resultSet.getInt("movie"));
        session.setCinema(resultSet.getInt("cinema"));
        return session;
    }
}
