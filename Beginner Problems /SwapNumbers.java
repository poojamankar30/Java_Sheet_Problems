public class SwapNumbers {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        // Swap without temp variable
        a = a + b;  
        b = a - b;  
        a = a - b;  

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
