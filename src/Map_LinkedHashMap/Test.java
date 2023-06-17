package Map_LinkedHashMap;

import java.util.LinkedHashMap;

public class Test 
{
	public static void main(String[] args) 
	{
		//The key and value pairs we can call it as map Entry. 
  
		LinkedHashMap h1=new LinkedHashMap();
		
			h1.put(101, "Dinga");
			h1.put(201, "Konga");
			h1.put(301, "Manga");
			h1.put(401, "Donga");
			h1.put(501, "Dinga"); //Duplicate keys are not allowed but values can be duplicated.
			h1.put(201, "Pooja"); //Konga will be replaced by Pooja
			
			//Insertion order is preserved in LinkedHashMap
			
		System.out.println(h1); //[101=Dinga,201=Pooja,301=Manga,401=Donga,501=Dinga]-- correct order
		System.out.println(h1.size()); //5
		
		System.out.println();
		System.out.println(h1.keySet()); //only keys
		
		System.out.println();
		System.out.println(h1.values()); //only values	
			
	}
}
