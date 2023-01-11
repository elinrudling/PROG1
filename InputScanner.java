// Elin Rudling elru4802

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class InputScanner {
    private static ArrayList<InputStream> list = new ArrayList<>();
    private Scanner input;

    //Konstruktor som ser till att det bara finns en inputkälla.
    public InputScanner(InputStream is) {
        if (list.contains(is)) {
            throw new IllegalStateException("Scanner already exists");
        }

        list.add(is);
        this.input = new Scanner(is);
    }

    //Konstruktor för klassen vilken defaultar till System.in.
    public InputScanner() {
        this(System.in);
    }

    //Formaterar användarens sträng input.
    public String formatString(String inputCommand, String errorMessage) {
        String formattedString = inputString(inputCommand).trim();
        while (formattedString.length() < 1) {
            System.out.println(errorMessage);
            formattedString = inputString(inputCommand).trim();
        }
        return formattedString.substring(0, 1).toUpperCase() + formattedString.substring(1).toLowerCase();
    }

    //Returnerar användarens sträng input.
    public String inputString(String text) {
        System.out.print(text + "?>");
        return input.nextLine();
    }

    //Får användarens int input, tömmer bufferten och returnerar användaren input.
    public int inputInt(String text) {
        System.out.print(text + "?>");
        int userInput = input.nextInt();
        input.nextLine();
        return userInput;
    }

    //Får användarens sträng input, tömmer bufferten och gör om inputen till en double och returnerar denna.
    public double inputDouble(String text) {
        System.out.print(text + "?>");
        String userInput = input.next().replace(",", ".");
        double result = Double.parseDouble(userInput);
        input.nextLine();
        return result;
    }
}