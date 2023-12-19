import java.util.Scanner;

public class ReversedString {
    public static void main(String[] args) {
        Scanner stringScanner = new Scanner(System.in);

        // Scanning String Input
        System.out.println("Enter a String");
        String st = stringScanner.nextLine();

        // Printing Original String
        System.out.println("Original String: " + st);

        System.out.print("Reversed String: ");
        for (int i = st.length() - 1; i >= 0; i--) {     //initializing i to the index of the last character st.length() - 1
            System.out.print(st.charAt(i));              // retriving character from a specified index 
        }


        System.out.println();

        stringScanner.close();
    }
}
