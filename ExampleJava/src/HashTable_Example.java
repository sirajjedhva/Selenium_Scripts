import java.util.*;


public class HashTable_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Hashtable<Integer, String> hm=new Hashtable<Integer, String>();
	    hm.put(100, "siraj");
	    hm.put(101, "Inx");
	    hm.put(103, "ravi");
	    
	    for(Map.Entry m:hm.entrySet()){
	    	System.out.println(m.getKey() +" " +m.getValue());
	    }
	}

}
