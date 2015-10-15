import java.util.Scanner;

	interface Shape
	{
	void area();
	void volume();
	double pi=3.14;
	}
	class Circle implements Shape{
		double r;
		Circle(double radius) {
		r=radius;
		
		}
		public void area(){
			System.out.println("Area of circle : "+ (pi*r*r));
		}
		public void volume(){
			System.out.println("Volume of circle : "+(2*pi*r));
		}
	}
	class Rectangle implements Shape{
		double l,b;
		Rectangle(double length,double breadth){
			l=length;
			b=breadth;
		}
		public void area(){
			System.out.println("Area of Rectangle : "+(l*b));
		}
		public void volume(){
			System.out.println("Volume of Rectangle : " +2*(l+b));
		}
	}
public class Interface_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /*Scanner sc=new Scanner(System.in);
    System.out.print("Enter Circle of Radius : ");
    double r=sc.nextDouble();
    
    System.out.print("Enter length of Rectangle : ");
    double l=sc.nextDouble();
    
    System.out.println("Enter breadth of Rectangle : ");
    double b=sc.nextDouble();
    
    
    Circle c=new Circle(r);
    c.area();
    c.volume();
    
    Rectangle r1=new Rectangle(l, b);
    r1.area();
    r1.volume();*/
   
	Circle c=new Circle(10.6);
	c.area();c.volume();
	
	Rectangle r1=new Rectangle(15,	20);
	r1.area();r1.volume();
	}

}
