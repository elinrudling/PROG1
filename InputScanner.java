// Elin Rudling elru4802

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class InputScanner {
    private static ArrayList<InputStream> list = new ArrayList<>();
    private Scanner input;

    /*
    Constructor that takes an inputstream and sets this scanner to that inputstream in a case where that inputstream
    hasn't already been added to a list keeping track of mentioned inputstreams.
     */
    public InputScanner(InputStream is) {
        if (list.contains(is)) {
            throw new IllegalStateException("Scanner already exists");
        }

        list.add(is);
        this.input = new Scanner(is);
    }

    /*
    Constructor for this class which defaults to System.in
     */
    public InputScanner() {
        this(System.in);
    }

    /*
    Verifies that the input from the used follows the rule that the string has at least 1 in length,
    removes all spaces and capitalizes the letter of the input and returns said input.
     */
    public String formatString(String inputCommand, String errorMessage) {
        String formattedString = inputString(inputCommand).trim();
        while (formattedString.length() < 1) {
            System.out.println(errorMessage);
            formattedString = inputString(inputCommand).trim();
        }
        return formattedString.substring(0, 1).toUpperCase() + formattedString.substring(1).toLowerCase();
    }

    /*
    Returns a string input from the user.
     */
    public String inputString(String text) {
        System.out.print(text + "?>");
        return input.nextLine();
    }

    /*
    Gets the int input from the user, clears input buffer and returns said input.
     */
    public int inputInt(String text) {
        System.out.print(text + "?>");
        int userInput = input.nextInt();
        input.nextLine();
        return userInput;
    }

    /*
    Gets a string input from the user, clears input buffer and parses the input to a double.
    Returns said double.
     */
    public double inputDouble(String text) {
        System.out.print(text + "?>");
        String userInput = input.next().replace(",", ".");
        double result = Double.parseDouble(userInput);
        input.nextLine();
        return result;
    }
}