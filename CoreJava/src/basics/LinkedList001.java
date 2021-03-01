package basics;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedList001 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
   List<String> linkedList = new LinkedList<String>();
   
   System.out.println("Enter how many linkedList Elements");
   int el= scan.nextInt();
   
   
   for(int i=0;i<el;i++) {
	   System.out.println("Enter Element # "+ i);
	   linkedList.add(scan.next());
	   
   }
   
   System.out.println("Your Linked List so far "+ linkedList);
   
   linkedList.add(linkedList.size(), "MyLast");
   System.out.println("Last element added " + linkedList);
   for(String w: linkedList) {
	   System.out.println(w+ " ");
   }
	System.out.println(" Enter Starting point of linkedList ");   
	int sp= scan.nextInt();
	for(int i=sp;i<=linkedList.size()-1;i++) {
		System.out.println(linkedList.get(i));
	}
	
	for(int j=linkedList.size()-1;j>=0;j--) {
		System.out.print(" "+ linkedList.get(j));
		
	}
	System.out.println("Enter element position and what element to add to your linked list");
	int sp1=scan.nextInt();
	String ele=scan.next();
	//linkedList.set(sp1, ele);
	linkedList.add(sp1, ele);
	linkedList.add(0, "First "+ele);
	linkedList.add(linkedList.size(), "Last"+ele);
	System.out.println("Final Linked list looks==> "+ linkedList);
	
	System.out.println("Enter starting position and how many elements to add some elements to linked list");
	int spos=scan.nextInt();
	int hm=scan.nextInt();
	for(int k=1;k<=hm;k++) {
		
		linkedList.add(spos, scan.next());
		
		
	}
	
	System.out.println("Final List 3 ==> "+ linkedList);
	int counter=0;
	for(int h=1;h<linkedList.size();h++) {
		if((linkedList.get(h-1).equals(linkedList.get(h)))) {
			
			counter++;
			System.out.println(linkedList.get(h));
			
		}else {
			System.out.println("no duplicates found");
		}
		System.out.println("duplicates "+ counter);
	}
	
	for(String w: linkedList) {
		System.out.print(w + " ");
	}
	System.out.println("+++++++++++++++++++");
	for(int k=0;k<linkedList.size();k++) {
		System.out.println(linkedList.get(k)+ " is at index posisiton of "+ k );		
	}
	linkedList.remove(spos);
	linkedList.remove(linkedList.get(0));
	linkedList.remove(linkedList.size()-1);
	System.out.println("After Removal "+ linkedList);
	linkedList.removeAll(linkedList);
	Collections.shuffle(linkedList);
	
	
	
	System.out.println(linkedList+" <===is blank");
	
	
	
	
	
	
	
	
   
   

	}

}
