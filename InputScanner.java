// Elin Rudling elru4802

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputScanner{
    private static List<InputStream> list = new ArrayList<>();
    private Scanner input;

    public InputScanner(InputStream is){
        if (list.contains(is)) {
            throw new IllegalStateException("Scanner already exists");
        }

        list.add(is);
        this.input = new Scanner(is);

    }

    public InputScanner(){
        new InputScanner(System.in);
    }

    public String inputString(String text){
        System.out.print(text + "?>");
        return input.nextLine();
    }

    public int inputInt(String text){
        System.out.print(text + "?>");
        int userInput = input.nextInt();
        input.nextLine();
        return userInput;
    }

    public double inputDouble(String text){
        System.out.print(text + "?>");
        double userInput = input.nextDouble();
        input.nextLine();
        return userInput;
    }

}