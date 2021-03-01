package basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayLists {

	public static void main(String[] args) {

		ArrayList<String> list= new ArrayList<>();
		ArrayList<String> list2= new ArrayList<>();
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter how many elements you want in the lsit ");
		int el= scan.nextInt();
		System.out.println("Now Enter elements");
		
		for(int i=0;i<el;i++) {
			
			list.add(scan.next().toUpperCase());
		}
		for(String w: list) {
			System.out.println(w);
		}
		System.out.println(list +" <=== is your list");
		System.out.println("Now lets revers it");
		for(int j=list.size()-1;j>=0;j--) {
			
			list2.add(list.get(j));
			
		}
		System.out.println("Reverse is ==> "+ list2);
		System.out.println("Add element we will insert it in first");
		
		list.add(0, scan.next());
		System.out.println("Final List==> "+ list);
		
		System.out.println("Enter index and we will get element");
		
		int idx=scan.nextInt();
		System.out.println(list.get(idx));
		System.out.println(list.get(list.size()-1)+" Last element");
		list.remove(list.size()-1);
		System.out.println(list+ " <==3rd element removed");
		System.out.println("What color you want search for?");
		
		String sr= scan.next().toUpperCase();
		if(list.contains(sr)) {
			System.out.println("we found it and it is in index "+ list.indexOf(sr)+ " of the list"+ list);
		}else {
			System.out.println(list + " does not have your input "+ sr);
		}
		
		list2.addAll(list);
		System.out.println("Your new List2 looks like "+ list2);
		Collections.reverse(list);
		System.out.println("Lets Compare");
		if(list.equals(list2)) {
			System.out.println("List1 and List2 are identical");
		}else {
			System.out.println("List1"+ list+ "List2"+ list2+ " are not identical");
		}
		
		List<String> sub_list=  list2.subList(0, 3);
		System.out.println("Half portion of the List2 is " +sub_list);
		
		System.out.println("Which two elements you want to swap");
		int swap1=scan.nextInt();
		int swap2 = scan.nextInt();
		if(swap1>list.size()-1 && swap2>list.size()-1) {
			System.out.println("Try index numbers only max is " +( list.size()-1));
		}else {
		System.out.println(list.get(swap1)+" and will be swapped "+ list.get(swap2));
		System.out.println(list+"<===== so far");
//		list.add(swap2, list.get(swap2));
//		list.add(swap1, list.get(swap1));
		System.out.println("---------------------------");
		Collections.swap(list, swap1, swap2);
		}
		System.out.println(list+"<============");
		
		list.addAll(sub_list);
		list.isEmpty();
		list.trimToSize();
		list.ensureCapacity(9);
		
		System.out.println("Enter element Color that you want to replace with");
		String color= scan.next();
		list.set(1, color);
		System.out.println("Swapped with 2nd element "+ list);
		list.removeAll(sub_list);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	  
}
