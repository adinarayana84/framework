package Test;

public class Student4 {
	int id;
	String name;
	//Creating Parameterised construter
	
	Student4(int i,String n){
		id=i;
		name=n;
		
	}
		
		//method to display the values
		
		void display() {
			System.out.println(id+" "+name);
			
		}
		public static void main(String[]args) {
			//creating the object and assgning the values
			Student4 s1=new Student4(1254,"Shilpa");
			Student4 s2=new Student4(2254,"Adi");
			//calling display for values
			
			s1.display();
			s2.display();
		}
	}
	

