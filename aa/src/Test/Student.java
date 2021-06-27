package Test;

public class Student {
     int a=0;
     int b=a++;
    static String Adi="Dhanwish i Love you chinu ";
	Student(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Student s=new Student();
		Student s1=new Student();
		Student s2=new Student();
		System.out.println(s.a);
		System.out.println(s1.a);
		System.out.println(Adi);
		System.out.println(s2.b);
		
		
	}
	
	}


