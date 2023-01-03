// Elin Rudling elru4802

import java.util.ArrayList;

public class Owner {
    private String name;
    private ArrayList<Dog> ownedDogs = new ArrayList<>();

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return String.format("Name: %s)", this.getName());
    }

    public void addOwnedDog(Dog dog) {
        for (Dog d : ownedDogs) {
            if (dog.getName().equalsIgnoreCase(d.getName())) {
                return;
            }
        }
        ownedDogs.add(dog);
    }
}