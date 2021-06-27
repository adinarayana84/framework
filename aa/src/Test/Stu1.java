package Test;

public class Stu1 {
	
	
	String a="adi";
	static int b=25;
	
	public void display() {
		
		System.out.println("Addition:"+ (a+b));	
	}

	private void Stu1(String name,int i) {
				name=a;
				i=b;
		
	}

	public static void main(String[] args) {
		Stu1 add=new Stu1("adi",25);
		
		add.display();
		
		

	}

}
