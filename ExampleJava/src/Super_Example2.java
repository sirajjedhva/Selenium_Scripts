	class Box
	{
		private double height;
		private double width;
		private double length;

		//construct clone of an object
		Box(Box ob){
	    width=ob.width;
	    height=ob.height;
	    length=ob.length; 
	    }
		// constructor used when all dimensions specified
		Box(double h,double w,double l){
		height=h;
		width=w;
		length=l;
		}
		// constructor used when no dimensions specified
		Box(){
		height=-1;
		width=-1;
		length=-1;
		}
		// constructor used when cube is created
		Box(double len){
		width=height=length=len;	
		}
		// compute and return volume
		double  vol(){
			
			return height*length*width;
		}
}
	
	
	class BoxWeight extends Box{
		double weight;
	
		// construct clone of an object
		public BoxWeight(BoxWeight ob) {
		super(ob);	// call superclass constructor
		weight=ob.weight;
				
		}
		// constructor when all parameters are specified
		BoxWeight(double h,double w,double l,double m){
		super(w,h,l); // call superclass constructor
		weight=m;
		}
		// constructor used when no dimensions specified
		BoxWeight() {
		super();
		weight=-1;
		}
		BoxWeight(double len,double m){
		// constructor used when cube is created
		super(len);
		weight=m;
		}
	}
	

public class Super_Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    BoxWeight box1=new BoxWeight(10,20,15,34.5);
    BoxWeight box2=new BoxWeight(2,3,4,0.076);
    BoxWeight box3=new BoxWeight();
    
    BoxWeight cube=new BoxWeight(8,9);
    BoxWeight cube1=new BoxWeight(box1);
    double volume;
    
    volume=box1.vol();
    System.out.println("Volume of box1 is " + volume);
    System.out.println("Weight of box1 is " + box1.weight);
    System.out.println();
    
    volume=box2.vol();
    System.out.println("Volume of box2 is " + volume);
    System.out.println("Weight of box2 is " + box2.weight);
    System.out.println();
    
    volume=box3.vol();
    System.out.println("Volume of box3 is " + volume);
    System.out.println("Weight of box3 is " + box3.weight);
    System.out.println();
    
    volume=cube1.vol();
    System.out.println("Volume of cube1 is " + volume);
    System.out.println("Weight of cube1 is " + cube1.weight);
    System.out.println();
	
    volume=cube.vol();
    System.out.println("Volume of cube is " + volume);
    System.out.println("Weight of cube is " + cube.weight);
    System.out.println();
	}

}
