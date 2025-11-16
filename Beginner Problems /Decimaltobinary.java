public class DecimalToBinary {
    public static void main(String[] args) {
        int num = 10;   // change number here
        int binary = 0;
        int place = 1;

        while (num > 0) {
            int rem = num % 2;       // remainder
            binary = binary + rem * place;  
            place = place * 10;      // move to next digit (like 1,10,100...)
            num = num / 2;           // divide
        }

        System.out.println("Binary = " + binary);
    }
}
