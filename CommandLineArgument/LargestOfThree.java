//Find the largest of three numbers

package CommandLineArgument;

public class LargestOfThree {

	public static void main(String[]args) {
	int a=Integer.parseInt(args[0]);
	int b=Integer.parseInt(args[1]);
	int c=Integer.parseInt(args[2]);
	
	int max=a;
	
	if (b>max) max=b;
	if (c>max) max=c;
	
	System.out.println("Largest Number is "+max);
	
	}
}
