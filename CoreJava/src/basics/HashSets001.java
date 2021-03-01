package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashSets001 {

	public static void main(String[] args) {
		HashSet<String> hset= new HashSet<>();
		HashSet<String> hset1= new HashSet<>();
		hset.add("Ali");
		hset.add("Veli");
		hset.add("Ali");
		hset.add("Red");
         hset.add("Green");
         hset.add("Black");
         hset.add("White");
         hset.add("Pink");
         hset.add("Yellow");
         
         System.out.println(hset);
         for(String w: hset) {
        	 System.out.print(w +" ");
         }
		
         hset1= (HashSet<String>)hset.clone();
         System.out.println("\nThis is Clone "+ hset1 );
         //hset.removeAll(hset);
         System.out.println("\nBlank==> hset "+ hset);
         System.out.println(hset.isEmpty());
         
         Object[] rr = hset.toArray();
         System.out.println(Arrays.toString(rr)+"<== this is arr");
         String arr[] = new String[hset.size()];
         hset.toArray(arr);
         System.out.println(Arrays.toString(arr)+" 2nd Arr");
         System.out.println(arr.length);
         String arr2[]=new String[arr.length]; 
         int k=0;
         for(int i=arr.length-1;i>=0;i--) {
        	 arr2[k]=arr[i];
        	 k++;
         }
         
         System.out.println(Arrays.toString(arr2)+" <==Reverse of Array");
         
         
         TreeSet<String> tset= new TreeSet<String>();
         for(int t=0;t<arr2.length;t++) {
        	 tset.add(arr2[t]);
         }
         System.out.println(" Tree set==> " + tset);
         System.out.println(tset.contains("Ali"));
         List<String> ll=new ArrayList<String>(tset);
         
        System.out.println(ll+" <== This is List from Tset");
        
        
        for(String w: hset) {
        	
        System.out.println(hset1.contains(w)?"Yes"+hset:"No");
        
        }
       Iterator itr= hset.iterator();
       int c=0;
       while(itr.hasNext()) {
    	   Object obj=itr.next();
    	   System.out.print(obj + "-");
    			   c++;
       }
        System.out.println("\nthis hset has "+ c+" # of elements");
        
        Queue<String> q1= new PriorityQueue<String>();
        
        	q1.addAll(hset);
        	
        	System.out.println(q1+ " <===== this Que");
        	Random ran = new Random();
        	List<Integer>intlis=new ArrayList<Integer>();
        	Queue <Integer> intq= new PriorityQueue<Integer>();
        	
        	for(int g=0;g<10;g++) {
        		int r= ran.nextInt(100);
        		intq.add(ran.nextInt(100));
        		intlis.add(ran.nextInt(100));
        	}
        	System.out.println(intq+" Queue");
        	System.out.println(intlis +" Integer List");
        	Collections.reverse(intlis);
        	System.out.println(intlis+" reversed");
      
        	

         
         
         	
         
         
         
         

	}

}
