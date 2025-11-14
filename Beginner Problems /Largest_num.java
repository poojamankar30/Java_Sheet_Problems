//Check if a number is prime.

package Beginners_Problems;
import java.util.Scanner;

public class Prime_or_not {

	public static void main(String[]args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number: ");
		
		int num=scanner.nextInt();
		
		if(num<2) {
			System.out.println("Number is not prime ");
		    return;
		}
		    
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println("Number is not prime");
				return;
			}
			
		}
		 System.out.println(num + " is prime");
		scanner.close();
			
	}
}
	
