package com.fullapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class MVCController {
   @RequestMapping("/home")
   public String doIt() {
	   return "home";
   }
}