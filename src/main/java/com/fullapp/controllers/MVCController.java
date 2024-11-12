package com.fullapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fullapp.services.DataService;

@Controller
@RequestMapping("/web")
public class MVCController {
	@Autowired
	private DataService dservice;
   @RequestMapping("/home")
   public String doIt(ModelMap map) {
	   map.addAttribute("names",dservice.getNames());
	   return "home";
   }
}
