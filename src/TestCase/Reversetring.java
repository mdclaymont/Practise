package TestCase;

public class Reversetring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str="Test ffsg   hhfgsk  fgkkh";
		String Str1="1 2 4 5 5  6 7 8 88 8 8 8 ";
		String Nstr="";
		for(int i=Str.length();i>0;i--)
		{
			System.out.print(Str.charAt(i-1));
		}
		System.out.println();
		StringBuffer a = new StringBuffer(Str1);
	    System.out.println(a.reverse());
		
	}

}
