package Set_HashSet;

import java.util.HashSet;

public class Test 
{
	public static void main(String[] args) 
	{
		HashSet h=new HashSet();
		
		h.add("a");
		h.add("a");
		h.add("a");
		h.add("aaaa");
		h.add(10);
		h.add(null);
		
		//Null insertion is possible
		//Insertion order is not preserved
		//Duplicate objects are not allowed
		
		System.out.println(h);//[10,null,a aaaa,] -->random answer
		System.out.println(h.size()); //4
	}
}
