package com.app.service;

import com.app.model.SessionView;

import java.util.List;

public interface RequestService {
    List<SessionView> select(List<Integer> cinema_id, List<Integer> movie_id);
    List<Integer> selectId (List<Integer> cinema_id, List<Integer> movie_id);
    SessionView findById( int randomNumber);
}
