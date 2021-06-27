package Test;

public class Student5 {
 int roll;
 String name;
 static String college="IRM";
 
 //Creating constructer
 
 Student5(int r,String n){
	 roll=r;
	 name=n;
 }
	 //method to display value
	 
	 void display() {
		 System.out.println(roll+""+name+""+college);}
	 
	public static void main(String[] args) {
		// Creating the objects and assigning values
		
		Student5 s1=new Student5(12345,"Dhanwish");
		Student5 s2=new Student5(23456,"Poori");
		
		//calling display value
		
		s1.display();
		s2.display();
		
		
	}

}
