package javapkg;

import java.util.Scanner;

class ReverseString 
{
	public static void main(String args[]) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a String:");
		String str = scan.nextLine();
		
		String temp = "";
		String finalString = "";
		for (int i = str.length() - 1; i >= 0; i--) 
		{
			if (i != 0) 
			{
				temp = temp + str.charAt(i);
			} else {
				temp = temp + str.charAt(i) + " ";
			}
			if (str.charAt(i) == ' ' || i == 0) 
			{
				for (int j = temp.length() - 1; j >= 0; j--) 
				{
					finalString += temp.charAt(j);
				}
				temp = "";
			}
		}
		System.out.println(finalString);
		scan.close();
	}
}