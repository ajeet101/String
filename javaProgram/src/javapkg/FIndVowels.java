package javapkg;

public class FIndVowels {
	

		public static void main(String[] args) {
			
			String s1="Sun Rises in East";
			String[] words = s1.split(" ");
			for(int i=0; i<=words.length-1; i++)
			{
				s1=s1.toLowerCase();
				int vowelCount=0;
				char[] charArray = words[i].toCharArray();
				for(int j=0; j<charArray.length; j++)
				{
					if(charArray[j]=='a'||
					charArray[j]=='e'||charArray[j]=='i'||charArray[j]=='o'||
					charArray[j]=='u')
					{
						vowelCount++;
					}
					
				}
				System.out.print("No. of vowels in "+words[i]+" is: "+vowelCount+" ");
				System.out.println(); // To break the line
			
			}

		}

	}



