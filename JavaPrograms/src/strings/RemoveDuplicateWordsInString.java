package strings;

import java.util.LinkedHashSet;

public class RemoveDuplicateWordsInString {
	
	public static void main(String[] args) {
		
		String str= "I Love Love I Bangalore City";
		String[] s = str.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<>();
		
		for(int i=0; i<s.length; i++)
		{
			set.add(s[i]);
		}
		
		for(String str1: set)
		{
			System.out.print(str1+" ");
		}
	}

}
