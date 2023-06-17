package List_ArrayList;

import java.util.ArrayList;

//Homogeneous objects example
//can be achieved by using wrapper classes

public class Test1 
{
	public static void main(String[] args) 
	{
		
		ArrayList<Integer> al=new ArrayList<Integer>();

		al.add(10);
		al.add(100);
		al.add(30);
		al.add(5);
		al.add(10);
		
		al.add(85);
		al.add(45);
		
		System.out.println(al); //[10,100,30,5,10,85,45]
		System.out.println(al.size()); //7
	}
	
}
