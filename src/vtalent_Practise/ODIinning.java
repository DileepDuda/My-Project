package vtalent_Practise;


	import java.util.Scanner;

	public class ODIinning {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Your Team Name");
			
			String a = sc.nextLine();
			
			System.out.println("Enter Opposite Team Name");
			
			String b = sc.nextLine();
			
			System.out.println("Enter ODI Inning Total Overs");
			
			int c = sc.nextInt();
			
			 System.out.println("How is Weather Condition is Good or Bad?");
				
				String n = sc.next();
				
					if(n.equals("Good"))
					
				{
					System.out.println("Match will start soon");
				}
				
				else
				{
				
					System.out.println("20 Overs Reduced based on 1hour");
					
					if(n.equals("Bad"))
					{
						System.out.println(" if weather is not good till 3hrs match should be cancelled");
					}
				}
			
			
	        System.out.println("Enter Team A First Inning  Score");
			
			int d = sc.nextInt();
			
	        System.out.println("Enter Team B Second Inning  Score");
			
			int e = sc.nextInt();
			
			if(d>e)
			{
				System.out.println("The Winner is : India");
			}
			else
			{
				System.out.println("The Winner is : Pakistan");
			}
			
	        
			
			System.out.println("Your Team Name : "+a);
			System.out.println("Opposite Team Name : "+b);
			System.out.println("ODI Inning Total Overs : "+c);
			System.out.println("Enter Weather Condition is Good or Bad? : "+n);
			System.out.println("Enter Team A First Inning  Score :" +d);
			System.out.println("Enter Team B Second Inning  Score : "+e);
			
		
			
		}

	}


