package com.app.dao;

import com.app.mapping.SessionMapper;

import com.app.model.Session;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import java.util.List;


@Repository
public class SessionDaoImpl implements SessionDao {
    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public SessionDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Session> findAll() {
        String sql = " SELECT*from session";
        return jdbcTemplate.query(sql, new SessionMapper());
    }

    @Override
    public void create(Session session) {
        String sql = "INSERT INTO session ( movie,cinema, price, date_time ) VALUES (?, ?, ?,?)";
        jdbcTemplate.update(sql, session.getMovie(), session.getCinema(), session.getPrice(), session.getDate_time());
    }



    @Override
    public Session getById(int id) {
        String sql = "SELECT * FROM session WHERE ID = ?";
        return jdbcTemplate.queryForObject(sql, new SessionMapper(), id);
    }
    @Override
    public void updateSession(Session session){
        String sql = "UPDATE session SET movie = ?, cinema = ?, Price = ?, date_time = ? WHERE ID = ?";
        jdbcTemplate.update(sql, session.getMovie(),session.getMovie(),session.getPrice(),session.getDate_time(), session.getId());
    }


}