import java.io.InputStream;
import java.util.Scanner;

public class InputScanner{
    private static Scanner input;
    
    public InputScanner(InputStream is){
        if (input != null)
            throw new IllegalStateException("Scanner already exists");
        input = new Scanner(is);
    }

    public static String inputString(String text){
        System.out.println(text + "?>");
        return input.nextLine();
    }

    public static int inputInt(String age, String weight){
        age = "Enter age";
        weight = "Enter weight";
        input.nextInt();
        int userInputInt = input.nextInt();
        return userInputInt;
    }

    public static double inputDouble(){
        input.nextInt();
        double userInputDouble = input.nextDouble();
        return userInputDouble;
    }

}