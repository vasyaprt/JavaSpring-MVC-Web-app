package com.app.dao;

import com.app.mapping.SessionViewMapper;
import com.app.model.SessionView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class RequestDaoImpl implements RequestDao {

    public final JdbcTemplate jdbcTemplate;

    @Autowired
    public RequestDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public List<SessionView> select(List<Integer> cinema_id, List<Integer> movie_id) {


        String sqlCinema = "" + cinema_id.get(0);
        if (cinema_id.size() !=1) {
            for (int i = 1; i < cinema_id.size(); i++) {
                sqlCinema = sqlCinema + " OR cinema.id = " + cinema_id.get(i);
            }
        }
        String sqlMovie = "" + movie_id.get(0);
        if (movie_id.size() != 1) {
            for (int i = 1; i < movie_id.size(); i++) {
                sqlMovie = sqlMovie + " AND movie.id!=  " + movie_id.get(i);
            }
        }

        String sql = "SELECT  movie.name, movie.description, cinema.name, session.date_time, session.price" +
                " from session" +
                " inner join movie on session.movie=movie.id" +
                " inner join cinema on session.cinema=cinema.id" +
                " where (cinema.id= " + sqlCinema + ") and  (movie.id!= " + sqlMovie + ")";


        return jdbcTemplate.query(sql, new SessionViewMapper());
    }

    @Override
    public List<Integer> selectId(List<Integer> cinema_id, List<Integer> movie_id) {

        String sqlCinema = "" + cinema_id.get(0);
        if (cinema_id.size() != 1) {
            for (int i = 1; i < cinema_id.size(); i++) {
                sqlCinema = sqlCinema + " OR cinema.id = " + cinema_id.get(i);
            }
        }
        String sqlMovie = "" + movie_id.get(0);
        if (movie_id.size() != 1) {
            for (int i = 1; i < movie_id.size(); i++) {
                sqlMovie = sqlMovie + " AND movie.id!=  " + movie_id.get(i);
            }
        }


        String sql = "SELECT session.ID" +
                " from session" +
                " inner join movie on session.movie=movie.id" +
                " inner join cinema on session.cinema=cinema.id" +
                " where (cinema.id= " + sqlCinema + ") and  (movie.id!= " + sqlMovie + ")";

        List<Integer> idList = jdbcTemplate.queryForList(sql, Integer.class);
        return idList;
    }

    @Override
    public SessionView findById(int randomNumber) {
        String sql = "SELECT  movie.name, movie.description, cinema.name, session.date_time, session.price" +
                "   from session" +
                "  inner join movie on session.movie=movie.id" +
                " inner join cinema on session.cinema=cinema.id" +
                "    WHERE session.ID = ?";

        return jdbcTemplate.queryForObject(sql, new SessionViewMapper(), randomNumber);
    }
}
