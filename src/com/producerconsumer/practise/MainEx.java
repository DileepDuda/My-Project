package com.producerconsumer.practise;

public class MainEx {

	public static void main(String[] args) {
		MainEx me = new MainEx();

		Producer p1 = new Producer(S,5);
		
		Consumer c1 = new Consumer(S,5);
		
		p1.start();
		c1.start();
		
	}

}
