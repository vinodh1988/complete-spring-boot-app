package com.fullapp.utilities;

import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
@ApplicationScope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ApplicationData {
	private Integer count=0;

	public Integer getCount() {
		return count;
	}

	public void setCount() {
		this.count++;
	}
	  
	  
}
