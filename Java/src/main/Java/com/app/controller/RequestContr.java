package com.app.controller;


import com.app.service.RequestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


@Controller

public class RequestContr {
    @Autowired
    public RequestService requestService;


    @RequestMapping(value = "/select", method = {RequestMethod.GET, RequestMethod.POST})
    public String select(Model model, @RequestParam ( required = false) List<Integer> cinema_id, @RequestParam ( required = false) List<Integer> movie_id) {

        model.addAttribute("cinema_id", cinema_id);
        model.addAttribute("movie_id", movie_id);
        model.addAttribute("selectList", requestService.select(cinema_id, movie_id));

     /*   if (requestService.select(cinema_id, movie_id).isEmpty()) {
            return "redirect:/noResult";
        }*/
        if (cinema_id.size() != 0 || movie_id.size() != 0) {
            return "redirect:/exChoic";
        }
        return "resultList";
    }

    @RequestMapping(value = "/selectOne", method = {RequestMethod.GET, RequestMethod.POST})
    public String selectOne(Model model, @RequestParam ( required = false) List<Integer> cinema_id, @RequestParam ( required = false) List<Integer> movie_id) {

        List<Integer> idList = new ArrayList<Integer>(requestService.selectId(cinema_id, movie_id));
        int randomIndex = new Random().nextInt(idList.size());
        int randomNumber = idList.get(randomIndex);

        model.addAttribute("selectedOne", requestService.findById(randomNumber));
        model.addAttribute("cinema_id", cinema_id);
        model.addAttribute("movie_id", movie_id);

        if (cinema_id.size() != 0 && movie_id.size() != 0) {
            if (requestService.selectId(cinema_id, movie_id).size() != 0) {
                return "resultRandom";
            }
            return "redirect:/noResult";
        }
        return "redirect:/exChoic";
    }
}