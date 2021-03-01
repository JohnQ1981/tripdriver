package basics;

import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class Maps001 {

	public static void main(String[] args) {
		Random rnd = new Random();
		String c = (String) ("A" + rnd.nextInt(500));
			Random ran= new Random();
			
			String randomstr="abcde";
			
			
			HashMap<Integer,String> hmap=new HashMap<>();
			for(int i=0;i<10; i++) {
				String rrstr=generateRandom(randomstr);
				hmap.put(i, rrstr);
			}
			
			System.out.println(hmap);
			
			Set<Integer> keys = hmap.keySet();
			for(Integer key: keys) {
				System.out.println(key+ " " + hmap.get(key));
			}
		

	}
	
	private static String generateRandom(String aToZ) {
	    Random rand=new Random();
	    StringBuilder res=new StringBuilder();
	    for (int i = 0; i < 5; i++) {
	       int randIndex=rand.nextInt(aToZ.length()); 
	       res.append(aToZ.charAt(randIndex));            
	    }
	    return res.toString();
	}

}
