package com.fullapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fullapp.services.DataService;
import com.fullapp.utilities.ApplicationData;
import com.fullapp.utilities.SessionData;

@Controller
@RequestMapping("/web")
public class MVCController {
	@Autowired
	private DataService dservice;
	
	@Autowired
	private SessionData session;
	@Autowired
	private ApplicationData application;
	
   @RequestMapping("/home")
   public String doIt(ModelMap map) {
	   session.setCount();
	   application.setCount();
	   map.addAttribute("names",dservice.getNames());
	   map.addAttribute("sdata",session.getCount());
	   map.addAttribute("adata",application.getCount());
	   return "home";
   }
}
