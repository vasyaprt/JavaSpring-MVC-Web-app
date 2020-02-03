package com.app.service;

import com.app.model.Session;


import java.util.List;

public interface SessionService {
    void create(Session session);

    Session getById(int id);

    List<Session> findAll();


    void updateSession(Session session);

}
