//Program to print sum of two numbers:

package CommandLineArgument;

public class SumOfTwo {


	public static void main(String[]args) {
		
		int sum1=Integer.parseInt(args[0]);
		int sum2=Integer.parseInt(args[1]);
		
		System.out.println("sum="+(sum1+sum2));
	}
}


