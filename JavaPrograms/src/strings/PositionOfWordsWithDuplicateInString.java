package strings;


public class PositionOfWordsWithDuplicateInString {
	
	  public static void main(String[] args) {
			
			String str= "I Love Love I Bangalore City";
			String[] s = str.split(" ");
			
			for(int i=0; i<s.length; i++)
			{
				System.out.println(s[i]+" is in position "+(i+1));
			}
		}

}
