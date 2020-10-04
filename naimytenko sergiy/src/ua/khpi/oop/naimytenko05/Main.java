package ua.khpi.oop.naimytenko05;

import java.util.Iterator;

public class Main { 
	  
	public static void main(String[] args ) {
		Container container = new Container("Hi user.","This lab aims to show how I can deal with the container development problem.","All this is needed so that I can keep strings with palindromes safe and sound."); 
		 Iterator<String> it = container.getIterator() ;
		for (;it.hasNext();) {
				String str = it.next();
				System.out.println(str);
		}
		it = container.getIterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		System.out.println("Removing the first similar item from the container and displaying it using the method toString :");
		 
		System.out.println("Result checking - " + container.remove("Hi user."));
		System.out.println(container.toString());
		System.out.println("Size of the container - " + container.size());
		System.out.println("Contains test with string: " + "All this is needed so that I can keep strings with palindromes safe and sound - " + container.contains("All this is needed so that I can keep strings with palindromes safe and sound."));
		System.out.println("Add one string in my conteiner");
		container.add("adda wad ss.");
		System.out.println("Show : " + container.toString());
		System.out.println("\nContains all text - " + container.containsAll(new Container("adda wad ss.", "This lab aims to show how I can deal with the container development problem.","All this is needed so that I can keep strings with palindromes safe and sound.")));
		System.out.println("Clearing the container");
		container.clear();
		
		
	} 

}

