package com.nt.comps;

import org.springframework.stereotype.Component;

@Component("courier")
public class DTDC implements ICourier {
	
	public DTDC() {
		System.out.println("DTDC:: 0-param constructor");
	}
	
	@Override
	public String deliver(int oid) {
		System.out.println("DTDC.deliver()");
		return oid+"order id order is ready to deliver using DTDC Courier Service.";
	}
}
