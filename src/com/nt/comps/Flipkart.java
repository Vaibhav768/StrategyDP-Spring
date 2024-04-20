package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public class Flipkart {
	@Qualifier("bDart")
	@Autowired
	private ICourier courier;
	
	public Flipkart(){
		System.out.println("Flipkart::0-param constructor");
	}
	
	public void setCourier(ICourier courier){
		System.out.println("Flipkart.setCourier()");
		this.courier=courier;
	}
	
	public String shopping(String[] items,double[]  prices){
		System.out.println("Flipkart.shopping()");
		double billAmt=0.0;
		for(double p:prices) {
			billAmt=billAmt+p;
		}
		// generated radom number as the order id
		int oid=new Random().nextInt(10000);
		//use the courier
		String courierMsg=courier.deliver(oid);
		//generate message for shopping and  delivery
		String resultMsg=Arrays.toString(items)+"are purchased having prices"+Arrays.toString(prices)+" with billAmt::"+billAmt+"--->"+courierMsg;
		return resultMsg;
}
}
