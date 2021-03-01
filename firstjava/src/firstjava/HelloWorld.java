package firstjava;

public class HelloWorld 
{
	int i, j;

	public void printStarPattern()
	{
		
		for (i = 1; i <= 5; i++) 
		{
			for (j = 1; j <= i; j++) 
			{
				System.out.print('*');

			}
			System.out.println();
		}
	}
	public void printnumPattern() 
	{

		for (i = 1; i <= 5; i++) 
		{
			for (j = 1; j <= i; j++) 
			{
				System.out.print(i);

			}
			System.out.println();
		}

}
	

	public static void main(String args[]) {
		HelloWorld obj= new HelloWorld();
		obj.printnumPattern();
		obj.printStarPattern();
		
	}
}
