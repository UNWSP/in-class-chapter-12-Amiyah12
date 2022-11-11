import java.util.Scanner;

public class tryToParse {

	public static void main(String[] args) 
	{
		Scanner keys = new Scanner(System.in);
		int intInput = 0;
		
		try
		{
			System.out.println("Enter input; ");
			String input = keys.nextLine();
			
			
			
			intInput = Integer.parseInt(intInput);
			
		}

		catch (NumberFormatException Exception)
		{
			System.out.println("That is not an integer!");
			System.exit(0);
		}
		
		
		System.out.println("Input = " + intInput);
	}

}
