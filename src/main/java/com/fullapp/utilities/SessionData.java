package com.fullapp.utilities;

import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionData {
  private int count;

int getCount() {
	return count;
}

void setCount() {
	this.count++;
}
  
  
}
