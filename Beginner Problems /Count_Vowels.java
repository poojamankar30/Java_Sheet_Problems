public class CountVowels {
    public static void main(String[] args) {
        String str = "Hello World";   // change the string
        int count = 0;

        str = str.toLowerCase();  // convert to lowercase

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        System.out.println("Number of vowels = " + count);
    }
}
