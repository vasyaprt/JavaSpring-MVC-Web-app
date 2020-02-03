package com.app.service;

import com.app.dao.CinemaDao;
import com.app.model.Cinema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaServiceImpl implements CinemaService {
    @Autowired
    public CinemaDao cinemaDao;

    @Override
    public List<Cinema> findAll() {
        return cinemaDao.findAll();
    }

}
