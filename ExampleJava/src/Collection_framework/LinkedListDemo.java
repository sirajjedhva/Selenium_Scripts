package Collection_framework;
import java.util.*;


public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LinkedList l=new LinkedList();
    l.add("siraj");
    l.add("10");
    l.add("siraj");
    l.add(null);
    System.out.println(l);
    l.set(0, "Ahmed");
    System.out.println(l);
    l.add(0,"Ali");
    System.out.println(l);
	}

}
