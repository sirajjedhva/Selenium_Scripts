
public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] myList={1.9,2.9,3.9,4.9};
		int i;
		//print all array elemnet
		for(i=0;i<myList.length;i++)
		System.out.println(myList[i]+" ");
		
		// Summing all elements
		double total=0;
		for(i=0;i<myList.length;i++)
			total+=myList[i];
		System.out.println("Tatal : " +total);
		
		// Finding the largest element
		double max = myList[0];
		for(i=1;i<myList.length;i++)
			 if (myList[i] > max) max = myList[i];
		System.out.println("max is " +max);
		
		double min=myList[0];
		for(i=1;i<myList.length;i++)
			if(myList[i]<min)min=myList[i];
		System.out.println("Min vlaue is" + min);
	}


}
