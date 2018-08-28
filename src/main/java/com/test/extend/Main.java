package com.test.extend;

public class Main {
	
	public static void main(String [] args) {
		Parents p = new Ch1();
		Ch1 c = new Ch1();
		Ch1 c2 = (Ch1) new Parents();
		p.hello();
		c.hello();
		c2.hello();
	}
}
