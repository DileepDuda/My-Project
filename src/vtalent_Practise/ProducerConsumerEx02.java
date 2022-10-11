package vtalent_Practise;

public class ProducerConsumerEx02 {
	
	
	public static void main(String[] args) {
		Shop c = new Shop();
		Producer6 p = new Producer6(c,1);
		Consumer6 co = new Consumer6(c, 1);
		p.start();
		co.start();

		}

		}

		 class Shop {
		private int materials;
		private boolean available = false;

		public synchronized int get() {
		while(available == false) {
		try {
		wait();
		}
		catch(Exception ie) {

		}
		}
		return materials;

		}

		public synchronized void put() {
		while(available == true) {
		try {
		wait();
		}
		catch(Exception ie) {
		ie.printStackTrace();
		}
		}
		materials = value;
		available = true;
		notifyAll();
		}
		}

		class Consumer6 extends Thread {
		private Shop shop;
		private int number;

		public Consumer6(Shop c, int number) {
		shop = c;
		this.number = number;
		}
		public void run() {
		int value = 0;
		for(int i=0; i<10; i++) {
		value = shop.get();
		System.out.println("product value" +this.number+ "=" +value);
		}
		}
		}

		class Producer6 extends Thread {
		private Shop shop;
		private int number;

		public Producer6(Shop c, int number) {
		shop = c;
		this.number = number;
		}

		public void run() {
		for(int i=0; i<10; i++) {
		shop.put();
		System.out.println("product value" +this.number+ "=" +i);
		try {
		sleep((int)(Math.random()*100));
		}
		catch(Exception ie) {
		ie.printStackTrace();
		}
		}

		}
		}