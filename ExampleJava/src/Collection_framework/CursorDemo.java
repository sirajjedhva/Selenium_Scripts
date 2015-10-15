package Collection_framework;
import java.util.*;
public class CursorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		Enumeration e=v.elements();
		Iterator i=v.iterator();
		ListIterator li=v.listIterator();
		
		System.out.println(e.getClass().getName());
		System.out.println(i.getClass().getName());
		System.out.println(li.getClass().getName());
	}

}
