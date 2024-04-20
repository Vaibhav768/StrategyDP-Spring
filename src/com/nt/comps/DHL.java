package com.nt.comps;

import org.springframework.stereotype.Component;

@Component("dhl")
public class DHL implements ICourier {
	public DHL() {
		System.out.println("DHL:: 0-param constructor");
	}
	
	@Override
	public String deliver(int oid) {
		System.out.println("DHL.deliver()");
		return oid+"order id order is ready to deliver using DHL Courier Service.";
	}

}
