package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.comps.Flipkart;
import com.nt.config.AppConfig;

public class StrategyDPTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Flipkart fpkt = ctx.getBean("fpkt",Flipkart.class);
		
		try {
				String resultMsg = fpkt.shopping(new String[] {"Kurta", "Pyjama", "Attar"}, new double[] {1500.0,1200.0,300.0});
				System.out.println(resultMsg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		ctx.close();
	}

}
