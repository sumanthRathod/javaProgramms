package strings;

import java.util.LinkedHashSet;

public class PositionOfWordsWithoutDuplicateInString {
	
	public static void main(String[] args) {
		
		String str= "I Love Love I Bangalore City";
		String[] s = str.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<>();
		
		for(int i=0; i<s.length; i++)
		{
			set.add(s[i]);
		}
		
		for(String ss : set)
		{
			for(int i=0; i<s.length; i++)
			{
				
				if(ss.equals(s[i]))
				{
					System.out.println(ss+" position is at "+(i+1));
					break;
				}
				
			}
		}
	}

}
