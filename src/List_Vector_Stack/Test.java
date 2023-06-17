package List_Vector_Stack;

import java.util.Stack;

public class Test 
{
	public static void main(String[] args) 
	{
		Stack s1=new Stack();
		
			s1.push("Manual Teting");
			s1.push("Java");
			s1.push("Selenium");
			s1.push("Python");
			
		System.out.println(s1); //[Manual Teting,Java,Selenium,Python]
		System.out.println(s1.size()); //4
			
			s1.pop(); //last in first order
			
		System.out.println();	
		System.out.println(s1); //[Manual Teting,Java,Selenium]
		System.out.println(s1.size()); //3
				
			s1.pop(); //last in first order
			s1.pop(); //last in first order
			s1.pop(); //last in first order
			
		System.out.println();	
		System.out.println(s1); //[]
		System.out.println(s1.size()); //0
	}
}
