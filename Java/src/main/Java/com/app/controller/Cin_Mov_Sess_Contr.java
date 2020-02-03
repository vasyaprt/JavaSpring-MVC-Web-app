package com.app.controller;


import com.app.model.Movie;
import com.app.model.Session;
import com.app.service.CinemaService;
import com.app.service.MovieService;
import com.app.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/")
public class Cin_Mov_Sess_Contr {
    @Autowired
    public CinemaService cinemaService;
    @Autowired
    public MovieService movieService;
    @Autowired
    public SessionService sessionService;


    @GetMapping("/choice")
    public ModelAndView MVList() throws Exception {


        ModelAndView mv = new ModelAndView("choice");
        mv.addObject("cinemaList", cinemaService.findAll());
        mv.addObject("movieList", movieService.findAll());
        return mv;
    }


    @GetMapping("/movieList")
    public String getAllMovies(Model model, HttpSession session) {
        if ((int)session.getAttribute("status") == 1) {
            model.addAttribute("movies", movieService.findAll());
            return "movieList";
        } else {
            return "redirect:/";
        }
    }

    @GetMapping("/createMovie")
    public String createMovie() {
        return "createMovie";
    }

    @PostMapping("/createMovie")
    public String createMovie(@ModelAttribute("movie") Movie movie, HttpSession session) {
        if ((int) session.getAttribute("status") == 1){
        movieService.create(movie);
            return "redirect:/movieList";}
        return "redirect:/";
    }



    @GetMapping("/createSession")
    public String createSession() {
        return "createSession";
    }

    @PostMapping("/createSession")
    public String createSession(@ModelAttribute("session") Session session) {
        sessionService.create(session);
        return "redirect:/AdminPage";
    }

    @GetMapping("/sessionList")
    public String getAllSession(Model model) {
        model.addAttribute("sessions", sessionService.findAll());
        return "sessionList";
    }

    @GetMapping("/updateSession/{id}")
    public String updateSession(@PathVariable("id") int id, Model model, HttpSession session) {
        if ((int) session.getAttribute("status") == 1) {
            model.addAttribute("session", sessionService.getById(id));
            return "updateSession";
        } else
            return "redirect:/";
    }

    @PostMapping("/updateSession")
    public String updateSession(@ModelAttribute("session")Session session) {
        sessionService.updateSession(session);
        return "redirect:/sessionList";
    }

}
