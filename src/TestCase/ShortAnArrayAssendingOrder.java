package TestCase;

public class ShortAnArrayAssendingOrder {
	public static int []as= {21,2,5,55,2,47,8,9,52,-12};
	public static int a,b,c;
	public static void main(String[] args) {
		for(int i=0;i<as.length;i++)
		{
			for(int j=0;j<as.length;j++)
			{
				if(as[i]<as[j])
				{
					a=as[i];
					as[i]=as[j];
					as[j]=a;
					
				}
				
			}
		}
		for(int i=0;i<as.length;i++)
		{
			System.out.println(as[i]);
		}
	}

}
