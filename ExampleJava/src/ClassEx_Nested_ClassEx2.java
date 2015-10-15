
public class ClassEx_Nested_ClassEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new outer().callouter();
	}

}

class outer {
	int i,a=10;
	
	void callouter() {
		for(i=1;i<=10;i++) {
			class inner {
				void loop() {
					System.out.println( "Value : " + i );
				}
			}
			inner in = new inner();
			in.loop();
		}
	}
}