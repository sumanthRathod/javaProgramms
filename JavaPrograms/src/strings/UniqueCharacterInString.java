package strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCharacterInString {
	
        public static void main(String[] args) {
		
        String str= "tester";
		
		Set<Character> set = new LinkedHashSet<>();
		
		for( int i=0; i<str.length(); i++)
		{
			set.add(str.charAt(i));
		}
		
		for(Character ch: set)
		{
			int count=0;
			
			for(int i=0; i<str.length(); i++)
			{
				
				if(ch==str.charAt(i))
				{
					count++;
				}
				
			}
			
			if(count==1)
			{
				System.out.println(ch+" occured "+count+" times");
			}
		}
	}

}
