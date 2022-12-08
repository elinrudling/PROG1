// Elin Rudling elru4802

public class Main {
    public static void main(String[] args) {
        String[] arr = {"First", "Second", "Third", "Fourth"};
        System.out.println("Array before Swap" + "\n");
        for (String element : arr) {
            System.out.println(element);
        }
        //Simple Swapping logic
        String temp = arr[1];
        arr[1] = arr[2];
        arr[2] = temp;

        System.out.println("\n" + "Array after Swap" + "\n");
        for (String element : arr) {
            System.out.println(element);
        }
    }
}