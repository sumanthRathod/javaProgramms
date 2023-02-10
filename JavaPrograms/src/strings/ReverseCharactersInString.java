package strings;

public class ReverseCharactersInString {
	
	public static void main(String[] args) {
		
		String s="I Love Bagalore";
		String[] st= s.split(" ");
		
		for(int i=st.length-1; i>=0; i--)
		{
			System.out.print(st[i]+" ");  //including space
			
		}
		
		System.out.println();
		for(int i=st.length-1; i>=0; i--)
		{
			System.out.print(st[i]);    //excluding space
		}
	}

}
