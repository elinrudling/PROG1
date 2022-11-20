//Elin Rudling elru4802

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputScanner{
    private Scanner input;

    private static final List<InputStream> list = new ArrayList<>();
    
    public InputScanner(InputStream is){
        if (!list.contains(is))
            throw new IllegalStateException("Scanner already exists");
        list.add(is);
        input = new Scanner(is);
    }

    public InputScanner(){
        new InputScanner(System.in);
    }

    public String inputString(String text){
        System.out.println(text + "?>");
        return input.nextLine();
    }

    public int inputInt(String text){
        System.out.println(text + "?>");
        int userInput = input.nextInt();
        input.nextLine();
        return userInput;
    }

    public double inputDouble(String text){
        System.out.println(text + "?>");
        double userInput = input.nextDouble();
        input.nextLine();
        return userInput;
    }

}