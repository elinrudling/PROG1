// Elin Rudling elru4802

import java.util.ArrayList;

public class AssignmentSevenPointFour {

    private InputScanner scanner = new InputScanner(System.in);
    private ArrayList<Dog> dogList = new ArrayList<>();

    public Dog findDog(String nameOfDog) {
        for (Dog dog : dogList) {
            if (nameOfDog.equalsIgnoreCase(dog.getName())) {
                return dog;
            }
        }
        return null;
    }

    public void increaseAge() {
        String nameOfDog = scanner.inputString("Enter the name of the dog");
        Dog dog = findDog(nameOfDog);
        if (dog != null) {
            dog.changeAge();
        } else {
            System.out.println("Error: no such dog");

        }
    }
}
