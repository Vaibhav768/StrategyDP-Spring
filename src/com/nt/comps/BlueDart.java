package com.nt.comps;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
//@Lazy(true)
@Component("bDart")
public class BlueDart implements ICourier {
	public BlueDart() {
		System.out.println("BlueDart:: 0-param constructor");
	}
	
	@Override
	public String deliver(int oid) {
		System.out.println("BlueDart.deliver()");
		return oid+"::order id order is ready to deliver using BlueDart Courier Service.";
	}
}
