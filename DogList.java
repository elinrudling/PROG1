// Elin Rudling elru4802

public class DogList {

    Dog[] dogList = new Dog[0];

    public void addDog(Dog dogToAdd) {
        Dog[] newDogList = new Dog[dogList.length + 1];
        newDogList[dogList.length] = dogToAdd;
        System.arraycopy(dogList, 0, newDogList, 0, dogList.length);
        dogList = newDogList;
    }

    public void dogToRemove(Dog dogToRemove) {
        int index = ;
        dogList = ArrayUtils.remove(dogList, index);

    }

    public Dog dogExists(String nameOfDog) {
        for (Dog dog : dogList) {
            if (nameOfDog.equalsIgnoreCase(dog.getName())) {
                return dog;
            }
        }
        return null;
    }
}