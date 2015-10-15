package Collection_framework;
import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		hs.add("a");
		hs.add("B");
		hs.add("C");
		hs.add("10");
		hs.add(null);
		
		System.out.println(hs.add("a"));
		System.out.println(hs);
	}

}
