// Elin Rudling elru4802

import java.util.ArrayList;

public class AssignmentEightPointOne {
    private InputScanner scanner = new InputScanner(System.in);
    private ArrayList<Owner> ownerList = new ArrayList<>();

    private String fetchFormattedString(String inputCommand, String errorMessage) {
        String formattedString = scanner.inputString(inputCommand).trim();
        while (formattedString.length() < 1) {
            System.out.println(errorMessage);
            formattedString = scanner.inputString(inputCommand).trim();
        }
        return formattedString.substring(0, 1).toUpperCase() + formattedString.substring(1).toLowerCase();
    }

    public void registerNewOwner() {
        String ownerName = fetchFormattedString("Name", "Error: the name can’t be empty");
        int ownerAge = scanner.inputInt("Age");
        Owner owner = new Owner(ownerName, ownerAge);
        ownerList.add(owner);
    }
}