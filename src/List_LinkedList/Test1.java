package List_LinkedList;

import java.util.LinkedList;

//Heterogeneous objects example

public class Test1 
{
	public static void main(String[] args) 
	{
		LinkedList l=new LinkedList();
			
			l.add("A");
			l.add("ratan");
			l.add("Poo");
			l.add("aaa");
			l.add(10);
			l.add("A");
			l.add(99.99);
			l.addFirst(100);
			l.addLast("Mamtha");
			
		System.out.println(l); //[100,A,ratan,Poo,aaa,10,A,99.99,Mamtha]
		System.out.println(l.size()); //9
		
			l.remove(4);
			l.remove("A"); //it will remove first A, coz Insertion order is preserved
		
		System.out.println();
		System.out.println(l); //[100,ratan,Poo,10,A,99.99,Mamtha]
		System.out.println(l.size()); //7
		
			l.removeFirst();
			l.removeLast();
		
		System.out.println();
		System.out.println(l); //[ratan,Poo,10,A,99.99]
		System.out.println(l.size()); //5
		
			l.clear();
		
		System.out.println();
		System.out.println(l); //[]
		System.out.println(l.size()); //0
	}
}
