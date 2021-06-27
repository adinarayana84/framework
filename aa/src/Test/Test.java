package Test;

public class Test {
   
	public static void main(String[] args) {
		// ifelse
		int year=2000;
		
		if((year%2==0) || (year%400==0) && (year%100==0)) {
			
			System.out.println("Leap Year");
		}else{
			System.out.println("Commen year");
		}
		 
		
		
	}

}
