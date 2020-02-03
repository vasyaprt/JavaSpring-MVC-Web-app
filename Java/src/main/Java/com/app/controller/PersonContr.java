package com.app.controller;


import com.app.model.Person;
import com.app.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class PersonContr {

    @Autowired
    public PersonService personService;


    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login(HttpServletRequest request, @ModelAttribute("person") Person person) {

        Person tmpPerson = personService.login(person);
        if (((tmpPerson.getId()) != 0) & (tmpPerson.getBan() == 0)) {
            HttpSession session = request.getSession(true);
            session.setAttribute("id", tmpPerson.getId());
            session.setAttribute("status", tmpPerson.getStatus());
            session.setAttribute("email", tmpPerson.getEmail());
            if (tmpPerson.getStatus() == 1)
                return "redirect:/adminPage";
            else
                return "redirect:/choice";
        } else
            return "redirect:/exLogin";
    }

    @GetMapping("/exLogin")
    public String loginEx() {
        return "exlogin";
    }

    @GetMapping("/adminPage")
    public String admin() {
        return "adminPage";
    }

    @GetMapping("/usersList")
    public String getAllUsers(Model model, HttpSession session) {
        if ((int) session.getAttribute("status") == 1) {
            model.addAttribute("personsList", personService.findAll());
            return "usersList";
        }
        return "redirect:/";
    }

    @GetMapping("/createPerson")
    public String createAcc() {
        return "createPerson";
    }

    @PostMapping("/createPerson")
    public String createAcc(@ModelAttribute("person") Person person) {
        if (personService.getByEMail(person.getEmail()).size() == 0) {
            personService.createAcc(person);
            return "redirect:/";
        } else {
            return "redirect:/exCreatePerson";
        }
    }

    @GetMapping("/exCreatePerson")
    public String createAccEx() {
        return "exCreatePerson";
    }


    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("id");
        session.removeAttribute("status");
        session.removeAttribute("email");
        return "redirect:/";
    }

    @GetMapping("/createPersonAsAdmin")
    public String createAccAd(HttpSession session) {
        if ((int) session.getAttribute("status") == 1) {
            return "createPersonAsAdmin";
        }
        return "redirect:/";
    }

    @PostMapping("/createPersonAsAdmin")
    public String createAccAd(@ModelAttribute("person") Person person) {
        personService.createAccAd(person);
        return "redirect:/adminPage";

    }


    @GetMapping("/ban/{id}")
    public String banned(@PathVariable("id") int id, HttpSession session) {
        if ((int) session.getAttribute("status") == 1) {
            personService.banned(id);
            return "redirect:/usersList";
        }
        return "redirect:/";
    }
}


