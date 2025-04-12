import java.util.Scanner;

public class CharacterFrequency {

    public static int characterFrequency(String text, char c) {
        text = text.toLowerCase();
        c = Character.toLowerCase(c);
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == c) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        if (text.isEmpty()) {
            System.out.println("The input string is empty.");
            return;
        }

        System.out.print("Enter the character to find its frequency: ");
        String inputChar = scanner.nextLine();
        if (inputChar.length() != 1) {
            System.out.println("Please enter exactly one character.");
            return;
        }
        char c = inputChar.charAt(0);

        
        int freq = characterFrequency(text, c);

        
        System.out.println("The frequency of '" + c + "' in the string is: " + freq);

        scanner.close();
    }
}
