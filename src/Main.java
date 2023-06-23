import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");

        String userInput = scanner.nextLine();
        char ch;
        String newString = "";

        System.out.print("Original string: ");
        System.out.println(userInput);

        for (int i = 0; i < userInput.length(); i++) {
            ch = userInput.charAt(i); //extracts the letter at index i
            newString = ch + newString; // adds the character in front of previous letters extracted
        }

        System.out.print("Reversed string: ");
        System.out.println(newString);


    }
}
