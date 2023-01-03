// Elin Rudling elru4802

public class DogList {

    private Dog[] dogList = new Dog[0];

    public void addDog(Dog dogToAdd) {
        if (dogToAdd != null && !checkDog(dogToAdd)) {
            Dog[] newDogList = new Dog[dogList.length + 1];
            newDogList[dogList.length] = dogToAdd;
            System.arraycopy(dogList, 0, newDogList, 0, dogList.length);
            dogList = newDogList;
        }
    }

    public void removeDog(Dog dogToRemove) {
        if (dogToRemove != null && checkDog(dogToRemove)) {
            Dog[] newDogList = new Dog[dogList.length - 1];
            boolean found = false;
            for (int i = 0; i < dogList.length; i++) {
                if (!found) {
                    if (dogList[i].getName().equalsIgnoreCase(dogToRemove.getName())) {
                        found = true;
                        continue;
                    }
                    newDogList[i] = dogList[i];
                } else {
                    newDogList[i - 1] = dogList[i];
                }
            }
            dogList = newDogList;
        }
    }

    public boolean checkDog(Dog dog) {
        for (Dog d : dogList) {
            if (dog.getName().equalsIgnoreCase(d.getName())) {
                return true;
            }
        }
        return false;

    }
}