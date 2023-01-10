// Elin Rudling elru4802

public class Owner {
    private String name;
    private DogList dogList;

    public Owner(String name) {
        this.name = name;
        this.dogList = new DogList();
    }

    public String getName() {
        return this.name;
    }

    public DogList getDogList() {
        return dogList;
    }

    public String toString() {
        return String.format("Name: %s)", this.getName());
    }

    public void addDogToOwner(Dog dog) {
        if (dog != null) {

            if (dog.getOwner() == null) {
                dog.addOwnerToDog(this);
            }

            if (!dogList.checkDog(dog) && dog.getOwner().equals(this)) {
                dogList.addDogToOwnedDogs(dog);
            }
        }
    }

    public void removeDogFromOwner(Dog dog) {
        if (dog != null) {
            if (this.checkIfOwnerOwnsDog(dog)) {
                dogList.removeDogFromOwnedDogs(dog);
                dog.removeOwnerFromDog();
            }
        }
    }

    public boolean checkIfOwnerOwnsDog(Dog dog) {
        if (dogList.checkDog(dog)) {
            return true;
        }
        return false;
    }
}