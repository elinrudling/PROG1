// Elin Rudling elru4802

public class Dog {
    private static final double DACHSHUND_TAIL_LENGTH = 3.7;
    private String name;
    private String breed;
    private int age;
    private int weight;
    private double tailLength;
    private Owner owner;

    public Dog(String name, String breed, int age, int weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.tailLength = setTailLength(breed, age, weight);
    }

    private double setTailLength(String breed, int age, int weight) {
        double tailLength;
        if (breed.equalsIgnoreCase("tax") || breed.equalsIgnoreCase("dachshund")) {
            tailLength = DACHSHUND_TAIL_LENGTH;
        } else {
            tailLength = (double) age * weight / 10;
        }
        return tailLength;
    }

    public void changeAge() {
        this.age++;
        this.tailLength = setTailLength(breed, age, weight);
    }

    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }

    public int getAge() {
        return this.age;
    }

    public int getWeight() {
        return this.weight;
    }

    public double getTailLength() {
        return this.tailLength;
    }

    public Owner getOwner() {
        return this.owner;
    }

    public void addOwnerToDog(Owner owner) {
        if (this.owner == null && owner != null) {
            this.owner = owner;
            owner.addDogToOwner(this);
        }
    }

    public void removeOwnerFromDog() {
        if (this.owner != null) {
            if (owner.checkIfOwnerOwnsDog(this)) {
                owner.removeDogFromOwner(this);
                this.owner = null;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("* %s (%s, %2d years, %2d kilo, %.2f cm tail",
                this.getName(), this.getBreed(), this.getAge(), this.getWeight(), this.getTailLength()));

        if(this.owner != null) {
            sb.append(", owned by " + this.getOwner().getName());
        }

        sb.append(")");

        return sb.toString();
    }

}
