package Set_TreeSet;

import java.util.TreeSet;

public class Test2 
{
	public static void main(String[] args) 
	{
		 //Heterogeneous data is not allowed
		  //we should take homogeneous
	
		TreeSet t1=new TreeSet();
		
			t1.add("M");
			t1.add("a");
			t1.add("m");
			
			//ASCII Table
			
		System.out.println(t1); //[M,a,m]
		System.out.println(t1.size()); //3
			
	}
}
