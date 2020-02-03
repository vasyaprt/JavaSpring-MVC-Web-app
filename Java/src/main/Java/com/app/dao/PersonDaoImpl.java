package com.app.dao;

import com.app.mapping.PersonMapper;
import com.app.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonDaoImpl implements PersonDao {
    public final JdbcTemplate jdbcTemplate;

    @Autowired

    public PersonDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Person> findAll() {
        String sql = " SELECT*from person";
        return jdbcTemplate.query(sql, new PersonMapper());
    }

    @Override
    public Person login(Person person) {
        String sql = "SELECT * FROM person WHERE (eMail = ? AND password = ?)";
        List<Person> personList = jdbcTemplate.query(sql, new PersonMapper(), person.getEmail(), person.getPassword());
        if (personList.size() == 1) {
            return personList.get(0);
        } else {
            return new Person(0, "", "", 1, 0);
        }
    }

    @Override
    public void createAcc(Person person) {
        String sql = "INSERT into person (ID, Email,Password,Status,ban) VALUES (0,?,?,2,0)";
        jdbcTemplate.update(sql, person.getEmail(), person.getPassword());
    }

    public void createAccAd(Person person) {
        String sql = "INSERT into person (ID, Email,Password,Status, ban) VALUES (0,?,?,?,0)";
        jdbcTemplate.update(sql, person.getEmail(), person.getPassword(), person.getStatus());
    }

    @Override
    public List<Person> getByEMail(String eMail) {
        String sql = "SELECT * FROM person WHERE (eMail = ?)";
        List<Person> personList = jdbcTemplate.query(sql, new PersonMapper(), eMail);
        return personList;
    }

    @Override
    public void banned(int id) {
        String sql = "UPDATE person SET ban=1 WHERE id=?";
        jdbcTemplate.update(sql, id);

    }
}
