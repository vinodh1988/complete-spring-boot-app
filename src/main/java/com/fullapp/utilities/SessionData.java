package com.fullapp.utilities;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class SessionData {
  private int count;

int getCount() {
	return count;
}

void setCount() {
	this.count++;
}
  
  
}
