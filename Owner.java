// Elin Rudling elru4802

public class Owner {
    private String name;
    private DogList ownedDogs;

    public Owner(String name) {
        this.name = name;
        this.ownedDogs = new DogList();
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return String.format("Name: %s)", this.getName());
    }

    public void addDogToOwner(Dog dog) {
        if (dog != null) {

            if (!ownedDogs.checkDog(dog)) {
                ownedDogs.addDogToOwnedDogs(dog);
            }

            if (!dog.getOwner().equals(this)) {
                dog.setOwner(this);
            }
        }
    }
}