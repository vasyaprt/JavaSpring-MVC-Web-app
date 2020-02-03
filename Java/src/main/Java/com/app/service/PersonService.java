package com.app.service;

import com.app.model.Person;


import java.util.List;

public interface PersonService {
    List<Person> findAll();

    Person login(Person person);

    void createAcc(Person person);

    List<Person> getByEMail(String eMail);

    void createAccAd(Person person);

    void banned(int id);

}
