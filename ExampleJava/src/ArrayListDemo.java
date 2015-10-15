import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

import java.util.*;


public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList l=new ArrayList();
    //LinkedList l2=new LinkedList();
    l.add("A");
    l.add("1");
    l.add("B");
    l.add(null);
    System.out.println(l);
    
    l.remove(2);
    System.out.println(l);
    
    l.add(2, "M");
    l.add("N");
    System.out.println(l);
    
   /* System.out.println(l1 instanceof Serializable);
    System.out.println(l2 instanceof Cloneable);
    System.out.println(l1 instanceof RandomAccess);	
    System.out.println(l2 instanceof RandomAccess);*/	
	}

}
