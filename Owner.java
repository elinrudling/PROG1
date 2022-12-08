// Elin Rudling elru4802

public class Owner {
    private String name;
    private int age;

    Owner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void changeAge() {
        this.age++;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return String.format("Name: %s\nAge: %2d years)", this.getName(), this.getAge());
    }
}