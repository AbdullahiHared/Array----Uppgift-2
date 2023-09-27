import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // user array choice
        System.out.println("first digit");
        int firstIndex = scan.nextInt();

        System.out.println("second digit");
        int secondIndex = scan.nextInt();

        System.out.println("Third digit");
        int thirdIndex = scan.nextInt();

        System.out.println("fourth digit");
        int fourthIndex = scan.nextInt();

        int[] userArr = { firstIndex, secondIndex, thirdIndex, fourthIndex };
        System.out.println("User array: " + Arrays.toString(userArr));
        scan.nextLine();

        // check user String
        System.out.println("Guess the word");
        String userInput = scan.nextLine();
        String[] mainArray = { "first", "second", "third" };
        boolean answer = mainArray[0].equalsIgnoreCase(userInput)
        || mainArray[1].equalsIgnoreCase(userInput)
        || mainArray[2].equalsIgnoreCase(userInput);
        System.out.println("Your value " + userInput + " is " + answer);

        // if (answer == true) {
        //     System.out.println("Your value " + userInput + " is true") ;
        // }  else {
        //     System.out.println("Your value " + userInput + " is false");
        // }
    }
}