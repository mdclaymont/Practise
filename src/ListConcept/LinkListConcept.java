package ListConcept;

import java.util.LinkedList;

public class LinkListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList li=new LinkedList();
		li.add("Test");
		li.add(12);
		li.add("dev");
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		
		System.out.println("*******************");
		li.addFirst("yahoo");
		li.addLast("Tester");
		System.out.println(li);
		
		// if user want set value 
		
		li.set(2," element");
		System.out.println("*******************");
		System.out.println(li);
		
		//for advanched print for loop must need data type is string 
		
	/*	for(String str:li)
		{
			System.out.println(li);
		}
		*/

	}

}
