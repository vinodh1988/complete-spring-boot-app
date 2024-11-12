package com.fullapp.utilities;

import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
@ApplicationScope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ApplicationData {
	private int count;

	public int getCount() {
		return count;
	}

	public void setCount() {
		this.count++;
	}
	  
	  
}
