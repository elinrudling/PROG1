// Elin Rudling elru4802

public class Dog {
    private static final double DACHSHUND_TAIL_LENGTH = 3.7;
    private String name;
    private String breed;
    private int age;
    private int weight;
    private double tailLength;

    public Dog(String name, String breed, int age, int weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.tailLength = setTailLength(breed, age, weight);
    }

    private static double setTailLength(String breed, int age, int weight) {
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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name of dog: " + this.getName());
        sb.append(" Breed of dog: " + this.getBreed());
        sb.append(" Age of dog: " + this.getAge());
        sb.append(" Weight of dog: " + this.getWeight());
        sb.append(" Taillength of dog: " + this.getTailLength());

        return sb.toString();
    }

}
