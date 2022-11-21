// Elin Rudling elru4802

import java.util.ArrayList;
import java.util.List;

public class AssignmentSevenPointOne{
    private InputScanner scanner = new InputScanner(System.in);
    private List<Dog> dogList = new ArrayList<>();

    public void registerNewDog(){
        String dogName = scanner.inputString("Name");
        String dogBreed = scanner.inputString("Breed");
        int dogAge = scanner.inputInt("Age");
        int dogWeight = scanner.inputInt("Weight");

        Dog dog = new Dog (dogName, dogBreed, dogAge, dogWeight);
        dogList.add(dog);
    }
}