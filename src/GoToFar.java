
public class GoToFar {

	public static void main(String[] args) 
	{
		int[] iHeartNumbers = {0,1,2,3,4,5};
		
		try
		{
			for (int i =0, i<=5; i++)
			{
				System.out.println(iHeartNumbers[i] + "");
			}
			
			catch (ArrayIndexOutOfBoundsException Exception)
			{
				System.out.println("You've gone too far");
			}
		}

		
		
		
	}

}
