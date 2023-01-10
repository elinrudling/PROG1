// Elin Rudling elru4802

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class InputScanner {
    private static ArrayList<InputStream> list = new ArrayList<>();
    private Scanner input;

    public InputScanner(InputStream is) {
        if (list.contains(is)) {
            throw new IllegalStateException("Scanner already exists");
        }

        list.add(is);
        this.input = new Scanner(is);
    }

    public InputScanner() {
        new InputScanner(System.in);
    }

    public String formatString(String inputCommand, String errorMessage) {
        String formattedString = inputString(inputCommand).trim();
        while (formattedString.length() < 1) {
            System.out.println(errorMessage);
            formattedString = inputString(inputCommand).trim();
        }
        return formattedString.substring(0, 1).toUpperCase() + formattedString.substring(1).toLowerCase();
    }

    public int formatInt(String inputCommand, String errorMessage) {
        int formattedInt = inputInt(inputCommand);
        while (formattedInt < 0) {
            System.out.println(errorMessage);
            formattedInt = inputInt(inputCommand);
        }
        return formattedInt;
    }

    public String inputString(String text) {
        System.out.print(text + "?>");
        return input.nextLine();
    }

    public int inputInt(String text) {
        System.out.print(text + "?>");
        int userInput = input.nextInt();
        input.nextLine();
        return userInput;
    }

    public double inputDouble(String text) {
        System.out.print(text + "?>");
        String userInput = input.next().replace(",", ".");
        double result = Double.parseDouble(userInput);
        input.nextLine();
        return result;
    }

}