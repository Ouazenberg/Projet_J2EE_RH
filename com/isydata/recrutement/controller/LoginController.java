package com.isydata.recrutement.controller;


import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import com.isydata.recrutement.entities.Login;
import com.isydata.recrutement.entities.Utilisateur;
import com.isydata.recrutement.services.IUtilisateurService;

@Controller

public class LoginController {

  @Autowired

 IUtilisateurService userService;

  @RequestMapping(value = "/login", method = RequestMethod.GET)

  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {

    ModelAndView mav = new ModelAndView("login");

    mav.addObject("login", new Login());

    return mav;

  }

  @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)

  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,

  @ModelAttribute("login") Login login) {

    ModelAndView mav = null;

    Utilisateur utilisateur = userService.validateUser(login);

    if (null != utilisateur) {

    mav = new ModelAndView("welcome");

    mav.addObject("nomUtilisateur", utilisateur.getNomUtilisateur());

    } else {

    mav = new ModelAndView("login");

    mav.addObject("message", "Username or Password is wrong!!");

    }

    return mav;

  }

}