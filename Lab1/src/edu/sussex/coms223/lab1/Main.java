package edu.sussex.coms223.lab1;

public class Main {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("Hello");
		list.add("World");
		
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		
		list.remove("World");
		System.out.println("\nRemoving 'World'\n");
		
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}
}
