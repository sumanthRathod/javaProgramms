package strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class PosotionWithoutDuplicate {
	
	public static void main(String[] args) {
		
        String str= "tester";
		
		Set<Character> set = new LinkedHashSet<>();
		
		for( int i=0; i<str.length(); i++)
		{
			set.add(str.charAt(i));
		}
		
		for(Character ch: set)
		{
			
			for(int i=0; i<str.length(); i++)
			{
				
				if(ch==str.charAt(i))
				{
					System.out.println(ch+" is at position "+(i+1));
					break;
				}
				
			}
			
		}
	}

}
