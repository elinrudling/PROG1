// Elin Rudling elru4802

public class AssignmentSevenPointOne{

    private static List<Dog> dogList = new ArrayList<>();

    public static void registerNewDog(){
        String dogName = scanner.inputString("Name");
        String dogBreed = scanner.inputString("Breed");
        int dogAge = scanner.inputInt("Age");
        int dogWeight = scanner.inputInt("Weight");

        Dog dog = new Dog (dogName, dogBreed, dogAge, dogWeight);
        dogList.add(dog);
    }
}