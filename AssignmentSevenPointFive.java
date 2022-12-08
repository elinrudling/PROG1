// Elin Rudling elru4802

import java.util.ArrayList;

public class AssignmentSevenPointFive {

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

    public void removeDog() {
        String nameOfDog = scanner.inputString("Enter the name of the dog");
        Dog dog = findDog(nameOfDog);
        if (dog != null) {
            dogList.remove(dog);
        } else {
            System.out.println("Error: no such dog");
        }
    }

}
