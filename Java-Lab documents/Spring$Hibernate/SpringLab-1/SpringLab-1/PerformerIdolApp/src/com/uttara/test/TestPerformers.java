package com.uttara.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerformers {

	public static void main(String[] args) {
	
		System.out.println("main()->starting");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		/*starts the spring container.
		when sp container starts,
		a) reads bean configurations in spring.xml
		b) per bean element, instantiate 1 bean object and store it internally,
		against id.
		*/
		System.out.println("Spring container is up and running");
		
		Performer p1 = (Performer)ctx.getBean("soma");
		Performer p11 = (Performer)ctx.getBean("soma");
		Performer p2 = (Performer)ctx.getBean("latha");
		Performer p3 = (Performer)ctx.getBean("mamu");
		Performer p4 = (Performer)ctx.getBean("asha");
		Performer p5 = (Performer)ctx.getBean("mithunda");
		/*
		p1.perform(); // Juggler
		p2.perform(); // Singer
		p3.perform();
		p4.perform();
		p5.perform();
		*/
		System.out.println("");
		Performer p6 = (Performer) ctx.getBean("ramu");
		p6.perform();
		System.out.println("");
		Performer p7 = (Performer) ctx.getBean("shankar");
		p7.perform();
		System.out.println("");
		Performer p8 = (Performer) ctx.getBean("mani");
		p8.perform();
		System.out.println("");
		Ticket t1 = (Ticket) ctx.getBean("ticket");
		Ticket t2 = (Ticket) ctx.getBean("ticket");
		System.out.println("t1 = "+t1+" t2 = "+t2);
		System.out.println("");
		Performer p9 = (Performer) ctx.getBean("oneManBand");
		p9.perform();
		//System.out.println("is p1==p11 ? "+(p1==p11));
		System.out.println("main()->ending");
	}

}








