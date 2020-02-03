package com.app.service;

import com.app.dao.PersonDao;
import com.app.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    public PersonDao personDao;

    @Override
    public List<Person> findAll() {
        return personDao.findAll();
    }

    @Override
    public Person login(Person person) {
        return personDao.login(person);
    }

    @Override
    public void createAcc(Person person) {
        personDao.createAcc(person);
    }

    @Override
    public List<Person> getByEMail(String eMail) {
        return personDao.getByEMail(eMail);
    }

    @Override
    public void createAccAd(Person person) {
        personDao.createAccAd(person);
    }

    @Override
    public void banned(int id) {
        personDao.banned(id);
    }

}

