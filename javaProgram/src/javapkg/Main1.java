package javapkg;

public class Main1 {

	public static void main(String[] args) {

		String str = "My name is Ashish Maurya";
		System.out.println(str);
		
		System.out.println("-------------------------");
		String[] words = str.split(" ");
		String reverseString = "";

		for (int i = 0; i < words.length; i++) {
			
			String word = words[i];

			String reverseWord = "";

			for (int j = word.length() - 1; j >= 0; j--) {
				
				
				reverseWord = reverseWord + word.charAt(j);

			}

			reverseString = reverseString + reverseWord + " ";
		}
		System.out.print(reverseString);
		/*System.out.println("");
		System.out.println("-----------------------------");
		char[] strArray =str.toCharArray();
		for(int i=strArray.length-1; i>=0; i--)
		{
			System.out.print(strArray[i]);
		}
		System.out.println("");
		System.out.println("-----------------------------");
		for (int j = words.length- 1; j >= 0; j--)
		{
			System.out.print(words[j]+" ");
		}
			
			System.out.println("");
			System.out.println("-----------------------------");
			for(int i=0; i<=words.length-1; i++)
			{
				if(i==0 || i==words.length-1)
				{
					char[] charArray = words[i].toCharArray();
					for(int k=charArray.length-1; k>=0; k--)
					{
						//System.out.print(charArray[k);
					}
					System.out.print("");
					
				}
			}*/
	}

}
