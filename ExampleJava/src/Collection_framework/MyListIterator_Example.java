package Collection_framework;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;




public class MyListIterator_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   List<Integer> li=new ArrayList<Integer>();
   li.add(15);
   li.add(5);
   li.add(1);
   li.add(6);
   li.add(8);
   
   ListIterator<Integer> litr = li.listIterator();
   System.out.println("List Element in forward direction");
   while(litr.hasNext()){
	   System.out.println(litr.next());
   }
   System.out.println("List of Revious direction");
   while(litr.hasPrevious()){
	   System.out.println(litr.previous());
   }
	}

}
