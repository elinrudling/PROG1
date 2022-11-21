// Elin Rudling elru4802

import java.util.ArrayList;
import java.util.List;

public class AssignmentSevenPointOne{

    private static List<Dog> dogList = new ArrayList<>();

    public static void registerNewDog(InputScanner scanner){
        String dogName = scanner.inputString("Name");
        String dogBreed = scanner.inputString("Breed");
        int dogAge = scanner.inputInt("Age");
        int dogWeight = scanner.inputInt("Weight");

        Dog dog = new Dog (dogName, dogBreed, dogAge, dogWeight);
        dogList.add(dog);
    }
}