// Elin Rudling elru4802

public class Owner {
    private String name;

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return String.format("Name: %s)", this.getName());
    }
}