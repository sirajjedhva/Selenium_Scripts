package Collection_framework;
import java.util.Vector;


public class VectorClass_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		//Vector v=new Vector(25);
		
		//Vector v=new Vector(10, 5);
		System.out.println(v.capacity());
		for(int i=0;i<10;i++){
			v.addElement(i);
			
		}
		System.out.println(v.capacity());
		v.addElement("A");
		System.out.println(v.capacity());
		System.out.println(v);
	}

}
