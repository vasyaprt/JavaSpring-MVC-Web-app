package com.app.dao;

import com.app.model.Person;

import java.util.List;

public interface PersonDao {
    List<Person> findAll();

    Person login(Person person);

    void createAcc(Person person);

    List<Person> getByEMail(String eMail);

    void createAccAd(Person person);

    void banned(int id);
}
