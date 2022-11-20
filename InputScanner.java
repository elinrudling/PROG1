import java.io.InputStream;
import java.util.Scanner;

public class InputScanner{
    private static Scanner input;
    
    public InputScanner(InputStream is){
        if (input != null)
            throw new IllegalStateException("Scanner already exists");
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