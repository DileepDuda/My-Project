package vtalent_Practise;

import java.util.Random;

public class Probability {
	

		public static void main(String[] args) {
			
			Random Ran = new Random();
			
			
	int Red = Ran.nextInt(20);
	
	int Green = Ran.nextInt(20);
	
	int Blue = Ran.nextInt(20);
	
	System.out.println("The Winner Colour is : "+ "Red ="+Red+", "+ "Green ="+Green+", "+"Blue ="+Blue);

	}

}

