package com.app.service;

import com.app.dao.RequestDao;
import com.app.model.SessionView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RequestServiceImpl implements RequestService {
    @Autowired
    public RequestDao requestDao;
    @Override
    public List<SessionView> select(List<Integer> cinema_id, List<Integer> movie_id) {
        return requestDao.select(cinema_id, movie_id);
    }
    @Override
    public  List<Integer> selectId(List<Integer> cinema_id, List<Integer> movie_id) {
        return  requestDao.selectId(cinema_id, movie_id);
    }
    @Override
    public SessionView findById( int randomNumber) {return  requestDao.findById(randomNumber);}
}
