import java.util.HashSet;
import java.util.Iterator;


public class Hashset_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashSet<String> hs=new HashSet<String>();
    hs.add("India");
    hs.add("Japan");
    hs.add("China");
    hs.add("USA");
    System.out.println("HashSet = " +hs);
    
    Iterator it=hs.iterator();
    System.out.println("Iterator elements : ");
    while(it.hasNext()){
    	String s=(String)it.next();
    	System.out.println(s);
    }
	}

}
