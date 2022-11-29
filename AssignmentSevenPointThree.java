// Elin Rudling elru4802

import java.util.ArrayList;

public class AssignmentSevenPointThree {

    private ArrayList<Dog> dogList = new ArrayList<>();

    public Dog findDog(String nameOfDog) {
        for (Dog dog : dogList) {
            if (nameOfDog.equalsIgnoreCase(dog.getName())) {
                return dog;
            }
        }
        return null;
    }

}
