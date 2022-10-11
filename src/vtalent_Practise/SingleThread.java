package vtalent_Practise;

public class SingleThread implements Runnable{
	
    System.out.println("Runnable is implementing");

	public static void main(String[] args) {
		
		SingleThread st = new SingleThread();
		
		Thread t = new Thread(st);

		 t.start();
	}

}
