package com.app.dao;

import com.app.mapping.CinemaMapper;
import com.app.model.Cinema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CinemaDaoImpl implements CinemaDao {

    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public CinemaDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Cinema> findAll() {
        String sql = " SELECT*from cinema";
        return jdbcTemplate.query(sql, new CinemaMapper());
    }


}

