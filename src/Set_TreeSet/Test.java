package Set_TreeSet;

import java.util.TreeSet;

public class Test 
{
	public static void main(String[] args) 
	{
		 //Heterogeneous data is not allowed
		  //we should take homogeneous
	
		TreeSet t1=new TreeSet();
		
			t1.add(20);
			t1.add(5);
			t1.add(20); //Duplicate objects are not allowed
			t1.add(90);
			t1.add(60);
			t1.add(30);
			
			//t1.add("Mamatha"); //ClassClassException
			
			//Insertion order is not preserved 
			 //it is based some sorting order
			  //ascending order
			
		System.out.println(t1); //[5,20,30,60,90] --> sorting/ascending order
		System.out.println(t1.size()); //6
		
		System.out.println(); 
		System.out.println(t1.tailSet(20)); //[20,30,60,90]
							//fromElement
			
		System.out.println();
		System.out.println(t1.headSet(50)); //[5,20,30]
							//toElement
		
		System.out.println();
		System.out.println(t1.subSet(9, 80)); //[20,30,60]
		              //fromElement //fromElement
		
	}
}
