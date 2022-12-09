// Elin Rudling elru4802

import java.util.ArrayList;

public class AssignmentEightPointTwo {

    private ArrayList<Owner> ownerList = new ArrayList<>();

    public Owner findOwner(String nameOfOwner) {
        for (Owner owner : ownerList) {
            if (nameOfOwner.equalsIgnoreCase(owner.getName())) {
                return owner;
            }
        }
        return null;
    }
}