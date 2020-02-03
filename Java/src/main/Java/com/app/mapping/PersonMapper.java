package com.app.mapping;

import com.app.model.Person;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonMapper implements RowMapper<Person> {

    public Person mapRow(ResultSet resultSet, int i) throws SQLException {
        Person person = new Person();
        person.setId(resultSet.getInt("ID"));
        person.setEmail(resultSet.getString("Email"));
        person.setPassword(resultSet.getString("Password"));
        person.setStatus(resultSet.getInt("status"));
        person.setBan(resultSet.getInt("ban"));
        return person;
    }
}
