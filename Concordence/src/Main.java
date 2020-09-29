import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner s = new Scanner (System.in);	
	String	b=s.next();
	
	if(b.contains(","))
		b= b.substring(0, b.length()-1);
	
	
	
	System.out.println(b);
		
		
		
		
	}
}
