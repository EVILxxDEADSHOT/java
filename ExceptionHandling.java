import java.util.*;
class ExceptionHandling
{
	public static void main(String args[])
	{
		try
		{
			int a = 10, b = 0, c;
			c = a / b; 
			System.out.println(c); 
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage() + "<----Message"); 
		}
		finally
		{
			System.out.println("try catch program");
		}
	}
}
