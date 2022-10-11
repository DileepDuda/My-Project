package com.producerconsumer.practise;

public class SingleThreadEx implements Runnable {

	
	
	
	public static void main(String[] args) {
		SingleThreadEx ste = new SingleThreadEx();
		
		Thread t = new Thread(ste); //using the constructor thread
 
		t.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Running the Thread");
	}

	
}
 

    //we want to make it our class is thread

//Runnable is interface
// Threads is a Class