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

        dogName = dogName.trim();
        dogName = dogName.substring(0,1).toUpperCase() + dogName.substring(1).toLowerCase();

        dogBreed = dogBreed.trim();
        dogBreed = dogBreed.substring(0,1).toUpperCase() + dogBreed.substring(1).toLowerCase();

        if (dogName.length() == 0){
            System.out.println("Error: the name can’t be empty");
            dogName = scanner.inputString("Name");
        }

        if (dogBreed.length() == 0){
            System.out.println("Error: the breed can’t be empty");
            dogBreed = scanner.inputString("Breed");
        }

        Dog dog = new Dog (dogName, dogBreed, dogAge, dogWeight);
        dogList.add(dog);
    }
}