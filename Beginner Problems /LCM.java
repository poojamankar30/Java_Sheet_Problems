public class LCM {
    public static void main(String[] args) {
        int a = 12;   // change numbers
        int b = 18;

        int lcm = (a > b) ? a : b;  // start from the larger number

        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                break;   // lcm found
            }
            lcm++;
        }

        System.out.println("LCM = " + lcm);
    }
}
