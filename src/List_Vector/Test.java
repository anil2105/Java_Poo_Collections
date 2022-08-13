package List_Vector;

import java.util.Vector;

public class Test 
{
	public static void main(String[] args) 
	{
		Vector v1=new Vector();
		
			v1.addElement(0);
			v1.addElement(5);
			v1.addElement("Mamtha");
			v1.addElement(true);
			v1.addElement(5);
			
		System.out.println(v1); //[0,5,Mamtha,true,5]
		System.out.println(v1.size());//5
		
			v1.removeElement(0);
			v1.remove(2);
			v1.remove(2);
		
		System.out.println();
		System.out.println(v1); //[5,Mamtha]
		System.out.println(v1.size()); //2
		
			v1.clear();
		
		System.out.println();
		System.out.println(v1); //[]
		System.out.println(v1.size()); //0
	}
}
