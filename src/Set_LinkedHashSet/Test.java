package Set_LinkedHashSet;

import java.util.LinkedHashSet;

public class Test 
{
	public static void main(String[] args) 
	{
		LinkedHashSet h=new LinkedHashSet();
		
		h.add("a");
		h.add("a");
		h.add("a");
		h.add("aaaa");
		h.add(10);
		h.add(null);
		
		//Null insertion is possible
		//Insertion order is preserved
		//Duplicate objects are not allowed
		
		System.out.println(h);//[a,aaaa,10,null] 
		System.out.println(h.size()); //4
	}
}
