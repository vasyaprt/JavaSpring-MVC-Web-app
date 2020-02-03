package com.app.mapping;

import com.app.model.SessionView;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SessionViewMapper implements RowMapper<SessionView> {
    public SessionView mapRow(ResultSet resultSet, int i) throws SQLException {
        SessionView sessionView = new SessionView();
        sessionView.setMovie_name(resultSet.getString("movie.name"));
        sessionView.setMovie_description(resultSet.getString("movie.description"));
        sessionView.setCinema_name(resultSet.getString("cinema.name"));
        sessionView.setSession_date_time(resultSet.getString("session.date_time"));
        sessionView.setSession_price(resultSet.getInt("session.price"));
        return sessionView;
    }
}
