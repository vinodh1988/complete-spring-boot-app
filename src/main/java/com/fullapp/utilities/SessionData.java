package com.fullapp.utilities;

import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionData {
  private Integer count=0;

public Integer getCount() {
	return count;
}

public void setCount() {
	this.count++;
}
  
  
}
