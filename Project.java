// Elin Rudling elru4802

import java.util.ArrayList;

public class Project {

    //7.1
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

    //7.2
    public void listDogs() {

        if (dogList.size() == 0) {
            System.out.println("Error: no dogs in register");
        } else {
            double smallestTailLength = scanner.inputDouble("Smallest tail length to display");

            ArrayList<Dog> dogsWithCorrectLength = getDogsWithCorrectLength(smallestTailLength);

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

    private ArrayList<Dog> getDogsWithCorrectLength(double smallestTailLength) {
        ArrayList<Dog> dogsWithCorrectLength = new ArrayList<>();
        for (Dog d : dogList) {
            if (d.getTailLength() >= smallestTailLength) {
                dogsWithCorrectLength.add(d);
            }
        }
        return dogsWithCorrectLength;
    }

    //7.3
    public Dog findDog(String nameOfDog) {
        for (Dog dog : dogList) {
            if (nameOfDog.equalsIgnoreCase(dog.getName())) {
                return dog;
            }
        }
        return null;
    }

    //7.4
    public void increaseAge() {
        String nameOfDog = scanner.inputString("Enter the name of the dog");
        Dog dog = findDog(nameOfDog);
        if (dog != null) {
            dog.changeAge();
        } else {
            System.out.println("Error: no such dog");

        }
    }

    //7.5
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
