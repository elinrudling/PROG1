// Elin Rudling elru4802

import java.util.ArrayList;
import java.util.List;

public class AssignmentSevenPointTwo {
    private InputScanner scanner = new InputScanner(System.in);
    private List<Dog> dogList = new ArrayList<>();

    public void registerNewDog() {
        String dogName = scanner.inputString("Name");
        String dogBreed = scanner.inputString("Breed");
        int dogAge = scanner.inputInt("Age");
        int dogWeight = scanner.inputInt("Weight");

        Dog dog = new Dog(dogName, dogBreed, dogAge, dogWeight);
        dogList.add(dog);
    }

    public void listDogs() {

        if (dogList.size() == 0) {
            System.out.println("Error: no dogs in register");
        } else  {
            double smallestTailLength = scanner.inputDouble("Smallest tail length to display");

            List<Dog> dogsWithCorrectLength = getDogsWithLength(smallestTailLength);

            if (dogsWithCorrectLength.size() > 0) {
                System.out.println("The following dogs have such a large tail:");
                for (Dog d : dogsWithCorrectLength) {
                    System.out.println(d.toString());
                }
            } else {
                System.out.println("Error: no dog has a tail that long");
            }
        }
    }

    private List<Dog> getDogsWithLength(double smallestTailLength) {
        List<Dog> dogsWithCorrectLength = new ArrayList<>();
        for (Dog d : dogList) {
            if (d.getTailLength() >= smallestTailLength) {
                dogsWithCorrectLength.add(d);
            }
        }
        return dogsWithCorrectLength;
    }
}
