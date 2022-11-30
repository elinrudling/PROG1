// Elin Rudling elru4802

public class DogList {

    Dog[] dogList = new Dog[0];

    public void addDog(Dog dogToAdd) {
        Dog[] newDogList = new Dog[dogList.length + 1];
        newDogList[dogList.length] = dogToAdd;
        //System.arraycopy(dogList, 0, newDogList, 0, dogList.length);
        dogList = newDogList;
    }

    public void removeDog(Dog dogToRemove) {
        Dog[] newDogList = new Dog[dogList.length - 1];
        boolean found = false;
        for (int i = 0; i < dogList.length; i++){
            if (!found) {
                if (dogList[i].getName().equalsIgnoreCase(dogToRemove.getName())){
                    found = true;
                    continue;
                }
                newDogList[i] = dogList[i];
            } else {
                newDogList[i-1] = dogList[i];
            }
        }
        dogList = newDogList;
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