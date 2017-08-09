package sugas;

public class Leapyear {
	public static void main(String[] args){
		int n=2004;
		if((n%100)==0){
			if((n%400)==0){
			System.out.println("leap year");
			}
			else{
				System.out.println("not a leap year");
			}
				
		}
		else if((n%4)==0){
		System.out.println("leap year");	
		}
		else{
			System.out.println("not a leap year");
		}
	}

}
