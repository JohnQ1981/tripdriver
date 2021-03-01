package basics;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class TreeSet001 {

	public static void main(String[] args) {

		Random ran= new Random();
		HashSet<Integer> hset= new HashSet<Integer>();
		for(int i=0;i<10;i++) {
			
			hset.add(ran.nextInt(100));
			
		}
		System.out.println(hset);
		
		
		TreeSet<Integer> tset = new TreeSet<Integer>();
		
		for(int j=0;j<10;j++) {
			
			tset.add(ran.nextInt(500));
			
		}
		System.out.println(tset);
		 TreeSet<String> tsetstr= new TreeSet<String>();
		 for(int k=0;k<10;k++) {
			 tsetstr.add("A"+ran.nextInt(500));
			 		 
		 }
		 System.out.println(tsetstr);
		
		
		
	}

}
