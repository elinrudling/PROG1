public class Owner {
    String name;
    int age;

    Owner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nName of owner: " + this.getName());
        sb.append("\nAge of owner: " + this.getAge());
        return sb.toString();
    }
}
