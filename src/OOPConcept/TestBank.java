package OOPConcept;

public class TestBank {

	public static void main(String[] args) {

		HSBCBank h=new HSBCBank();
		h.credit();
		h.debit();
		h.transfermoney();
		h.carloan();
		h.loan();
		System.out.println(UsBank.min_balance);//using class and dot variable name and you cant change this value after define 
		//dynamic polymorphism
		//child class object can be refred by parant interface refreance variable
		

	}

}
