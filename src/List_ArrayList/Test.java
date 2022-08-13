package List_ArrayList;

import java.util.ArrayList;

//Heterogeneous objects example

public class Test 
{
	
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
			
			al.add(10);
			al.add(100);
			al.add(30);
			al.add(5); //Insertion order is preserved
			al.add(10); //Duplicate objects are allowed
			al.add("IBM");
			al.add(true);
			al.add(45.99); //Heterogeneous objects are allowed
			
		System.out.println(al); //[10,100,30,5,10,IBM,true,45.99]
		System.out.println(al.size()); //8
		
			//ArrayList supports  dynamic array that can be grow as needed.
        	//it can dynamically increase and decrease the size. 
		
			al.remove(true);
			al.remove(4);
			al.remove(45.99);
			al.add(2, "Mamtha");
			al.add(4, 10000);
			
		System.out.println(al); //[10,100,Mamtha,30,10000,5,IBM]
		System.out.println(al.size()); //7
			
	}
}
