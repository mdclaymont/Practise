package TestCase;

public class CountNonDuplicatString {
	public static String Str="Test you how Test work and you";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Str.lastIndexOf(""));
		System.out.println(Str.length());
		String[] ar=Str.split(" ");
		for(int i=0;i<ar.length;i++)
		{
			int count=1;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i].equals(ar[j]))
				{
					count=count+1;
					ar[j]="0";
				}
			}
			if(count>1 && ar[i]!="0")
			{
				System.out.println("** "+ar[i]+" ** This value has Total Count of "+ count);
			}
		}
	}
}
