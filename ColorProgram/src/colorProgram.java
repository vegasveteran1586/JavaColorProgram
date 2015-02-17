import java.util.Scanner;




public class colorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		
		
		String keepGoing="y";
		
		while (keepGoing.toUpperCase().equals("Y"))
		{
			System.out.println("Do you want to continue? (y/n)");
			keepGoing = input.nextLine();
			
		}
		
		
		System.out.println("Welcome to the Color Translator Program");
		System.out.println("\n" + "Pick two colors from Red, Yellow, or Blue");
		
		String color1 = input.next();
		String color2 = input.next();
		
				

		if (color1.equals("red") & (color2.equals("yellow")) || (color1.equals("Red") & (color2.equals("Yellow"))) || (color1.equals("red") & (color2.equals("Yellow"))) ||
				(color1.equals("Red")) & (color2.equals("yellow")))
				{			
			
			System.out.println("your secondary color is orange");
		}
							
		
		if (color1.equals("yellow") & (color2.equals("blue")) || (color1.equals("Yellow") & (color2.equals("Blue"))) || (color1.equals("yellow") & (color2.equals("Blue"))) ||
				(color1.equals("Yellow")) & (color2.equals("blue")))
				{
				
				System.out.println("your secondary color is green");
		}

		if (color1.equals("blue") & (color2.equals("red")) || (color1.equals("Blue") & (color2.equals("Red"))) || (color1.equals("blue") & (color2.equals("Red"))) ||
		(color1.equals("Blue")) & (color2.equals("red")))  
				{
				
				System.out.println("your secondary color is purple");
		}

		if (color1.equals("yellow") & (color2.equals("red")) || (color1.equals("Yellow") & (color2.equals("Red"))) || (color1.equals("Yellow") & (color2.equals("red"))) ||
		(color1.equals("yellow")) & (color2.equals("Red")))
				{
				
				System.out.println("your secondary color is orange");
		}
				

		if (color1.equals("blue") & (color2.equals("yellow")) || (color1.equals("Blue") & (color2.equals("Yellow"))) || (color1.equals("Blue") & (color2.equals("yellow"))) ||
				(color1.equals("blue")) & (color2.equals("Yellow")))
				{
				
				System.out.println("your secondary color is green");
		}
		

		if (color1.equals("red") & (color2.equals("blue")) || (color1.equals("Red") & (color2.equals("Blue"))) || (color1.equals("Red") & (color2.equals("blue"))) ||
				(color1.equals("red")) & (color2.equals("Blue")))  
				{
				
				System.out.println("your secondary color is purple");
		}
		
	}
}