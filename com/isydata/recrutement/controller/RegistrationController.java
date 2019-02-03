package com.isydata.recrutement.controller;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.servlet.ModelAndView;

import com.isydata.recrutement.entities.Utilisateur;
import com.isydata.recrutement.services.IUtilisateurService;



@Controller

public class RegistrationController {

  @Autowired

  public IUtilisateurService userService;

  @RequestMapping(value = "/register", method = RequestMethod.GET)

  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {

    ModelAndView mav = new ModelAndView("register");

    mav.addObject("utilisateur", new Utilisateur());

    return mav;

  }

  @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)

  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,

  @ModelAttribute("utilisateur") Utilisateur utilisateur) {

  userService.register(utilisateur);

  return new ModelAndView("welcome", "nomUtilisateur", utilisateur.getNomUtilisateur());

  }

}


