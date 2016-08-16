package com.hand.main;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class BeforeInsertEvent implements ApplicationListener<ContextStartedEvent> {

	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("Before insert customer data.");
	}

}
