package strings;

public class ReverseLastToFirstString {
	
	public static void main(String[] args) {
		
		String st="I Love Bagalore City";
		String[] s= st.split(" ");
		
//		for(int i=s.length-1; i>=0; i--)
//		{
//			System.out.print(s[i]+" ");		         // city bangalore love i
//		}
		
		
		String temp= s[0];
		s[0]=s[s.length-1];
		s[s.length-1]=temp;
		
		for(int i=0; i<s.length; i++)
		{
			System.out.print(s[i]+" ");
		}
		
		
	}

}
