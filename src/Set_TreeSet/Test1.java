package Set_TreeSet;

import java.util.TreeSet;

public class Test1 
{
	public static void main(String[] args) 
	{
		 //Heterogeneous data is not allowed
		  //we should take homogeneous
	
		TreeSet t1=new TreeSet();
		
			t1.add("Pinga");
			t1.add("Manga");
			t1.add("Donga"); 
			t1.add("Singa");
			t1.add("Dinga");
			t1.add("Konga");
			t1.add("Manga"); //Duplicate objects are not allowed
			
			//Insertion order is not preserved 
			 //it is based some sorting order
			  //ascending order
			
		System.out.println(t1); //[Dinga,Donga,Konga,Manga,Pinga,Singa] -->sorting/ascending order
		System.out.println(t1.size()); //6
		
		System.out.println(); 
		System.out.println(t1.tailSet("Mamtha")); //[Manga,Pinga,Singa]
							//fromElement
			
		System.out.println();
		System.out.println(t1.headSet("Pingi")); //[Dinga,Donga,Konga,Manga,Pinga]
							//toElement
		
		System.out.println();
		System.out.println(t1.subSet("Dingi", "Mangi")); //[Donga,Konga,Manga]
		                   //fromElement //fromElement
		
	}
}
