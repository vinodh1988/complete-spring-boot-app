package com.fullapp.services;

import org.springframework.stereotype.Service;

@Service
public class DataService {

   public String[] getNames() {
	   String[] names= {
			   "Raj","Rakesh","Rohan","Peterson","Lohith"
	   };
	   return names;
   }
}
