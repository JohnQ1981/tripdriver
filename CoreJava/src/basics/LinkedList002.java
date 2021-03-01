package basics;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList002 {

	public static void main(String[] args) {
		LinkedList <String> l_list = new LinkedList <String> ();
		LinkedList <String> newll = new LinkedList <String> ();
		  // use add() method to add values in the linked list
		  l_list.add("Red");
		  l_list.add("Green");
		  l_list.add("Black");
		  l_list.add("Pink");
		  l_list.add("orange");
		  // print the list
		  System.out.println("Linked list before shuffling:\n" + l_list);  
		  Collections.shuffle(l_list);
		  System.out.println("Linked list after shuffling:\n" + l_list); 
		  Collections.reverse(l_list);
		  System.out.println("Linked list reverse\n" + l_list);
		  l_list.addAll(l_list);
		  System.out.println("Linked list reverse\n" + l_list);
		  newll=(LinkedList<String>) l_list.clone();
		  System.out.println("Cloned one is "+ newll);
		  System.out.println(newll.remove(0));
		  System.out.println(newll.get(0));
		  
		  
	}

}
