package strings;

public class ReverseEachCharInString {
	
public static void main(String[] args) {
		
		String s="I Love Bagalore City";
		String[] st= s.split(" ");
		
//		String rev="";
//		
//		for(String w: st)
//		{
//			String chars="";
//			for(int i=w.length()-1; i>=0; i--)
//			{
//				chars= chars+w.charAt(i);
//			}
//			
//			rev=rev+chars+" ";
//			
//		}
//		
//		System.out.println(rev);
		
		//or
		
		for(int i=0; i<st.length; i++)
		{
			String s1=st[i];
			
			for(int j=s1.length()-1; j>=0; j--)
			{
				System.out.print(s1.charAt(j));
			}
			System.out.print(" ");
		}
		
	}

}
