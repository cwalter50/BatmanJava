import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
	{
    Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 20");
		int count = scan.nextInt();

		String result = "";
		for (int i = 0; i < count; i++)
			result += "Na";
			
		result += " BATMAN!!!";

		System.out.println(result);
  }
}