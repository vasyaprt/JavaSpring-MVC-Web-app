package com.app.dao;


import com.app.model.Session;
import com.app.model.SessionView;

import java.util.List;

public interface SessionDao {

    List<Session> findAll();

    void create(Session session);

    Session getById(int id);

    void updateSession(Session session);

}
