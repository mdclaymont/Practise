package OOPConcept;

public class CallByValueCalByRefr {
	int p;
	int q;

	public static void main(String[] args) {
		CallByValueCalByRefr obj= new CallByValueCalByRefr();
		int x=10;
		int y=20;
		obj.testSum(x, y);// call by value or pass by value

	}

	public int testSum(int a, int b)
	{
		a=30;
		b=40;
		int c=a+b;
		return c;
	}
/// Call by refreance or 
	public void swap(CallByValueCalByRefr t) {
		int temp;

		temp = t.p;
		t.p = t.q;
		t.q = temp;
	}
}
