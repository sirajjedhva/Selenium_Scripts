package Collection_framework;

import java.util.*;

public class ListiteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		System.out.println(l);
		
		ListIterator li=l.listIterator();
		while(li.hasNext()){
			String s=(String) li.next();  
			
			if(s.equals("B")){
			li.remove();	
			}
			else if(s.equals("C")){
			li.add("E");	
			}
			else if(s.equals("D")){
				li.set("F");
			}
		}
		System.out.println(l);
		}

}
