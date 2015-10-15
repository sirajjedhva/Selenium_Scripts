package Collection_framework;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args){
		LinkedHashSet lh=new LinkedHashSet();
		lh.add("A");
		lh.add("B");
		lh.add("c");
		lh.add(null);
		lh.add("10");
		
		System.out.println(lh.add("B"));
		System.out.println(lh);
	}

}
