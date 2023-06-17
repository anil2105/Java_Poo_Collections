package List_LinkedList;

import java.util.LinkedList;

//Homogeneous objects example
//can be achieved by using wrapper classes

public class Test 
{
	public static void main(String[] args) 
	{
		LinkedList<String> l=new LinkedList<String>();
			
			l.add("a");
			l.add("ratan");
			l.add("anu");
			l.add("aaa");
			
		System.out.println(l); //[a,ratan,anu,aaa]
		System.out.println(l.size()); //4
					
	}
}
