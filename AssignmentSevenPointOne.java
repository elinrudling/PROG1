// Elin Rudling elru4802

import java.util.ArrayList;

public class AssignmentSevenPointOne {
    private InputScanner scanner = new InputScanner(System.in);
    private ArrayList<Dog> dogList = new ArrayList<>();

    private String fetchFormattedString(String inputCommand, String errorMessage) {
        String formattedString = scanner.inputString(inputCommand).trim();
        while (formattedString.length() < 1) {
            System.out.println(errorMessage);
            formattedString = scanner.inputString(inputCommand).trim();
        }

        return formattedString.substring(0, 1).toUpperCase() + formattedString.substring(1).toLowerCase();
    }

    public void registerNewDog() {
        String dogName = fetchFormattedString("Name", "Error: the name can’t be empty");
        String dogBreed = fetchFormattedString("Breed", "Error: the breed can’t be empty");
        int dogAge = scanner.inputInt("Age");
        int dogWeight = scanner.inputInt("Weight");
        Dog dog = new Dog(dogName, dogBreed, dogAge, dogWeight);
        dogList.add(dog);
    }


}