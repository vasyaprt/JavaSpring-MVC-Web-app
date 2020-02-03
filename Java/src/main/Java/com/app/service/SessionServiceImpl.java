package com.app.service;

import com.app.dao.SessionDao;
import com.app.model.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class SessionServiceImpl implements SessionService {
    @Autowired
    public SessionDao sessionDao;

    @Override
    public void create(Session session) {
        sessionDao.create(session);
    }

    @Override
    public Session getById(int id) {
        return sessionDao.getById(id);
    }

    @Override
    public List<Session> findAll() {
        return sessionDao.findAll();
    }

    @Override
    public void updateSession(Session session) {
        sessionDao.updateSession(session);
    }

}
