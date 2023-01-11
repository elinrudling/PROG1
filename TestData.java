// Elin Rudling elru4802

/**
 * Denna klass är bara till för att möjliggöra testning av de klasser och
 * metoder som du själv får namnge. Många av JUnit-testfallen till
 * inlämingsuppgiftens olika delar behöver kunna identifiera dessa, och de
 * kommer att leta efter namnen här.
 * <p>
 * De konstanter som finns nedan är de som behövs för testen till U6.3,
 * inläsningsklassen och . Du kommer själv att behöva lägga till ytterligare
 * konstanter i filen när du går in på uppgifterna till föreläsning 7 och
 * framåt. Namnen på dessa kommer att stå i instruktionerna för uppgifterna, och
 * kan också ses i JUnit-testfallen för dem.
 */
public final class TestData {
    //10.1
    public static final String MAIN_OWNER_LIST_NAME = "allOwners";
    public static final String MAIN_DOG_LIST_NAME = "allDogs";

    public static final String REGISTER_NEW_OWNER_METHOD_NAME = "registerNewOwner";
    public static final String REGISTER_NEW_DOG_METHOD_NAME = "registerNewDog";

    public static final String FIND_OWNER_METHOD_NAME = "findOwner";
    public static final String FIND_DOG_METHOD_NAME = "findDog";

    public static final String INCREASE_AGE_METHOD_NAME = "increaseAgeOfDog";

    public static final String REMOVE_OWNER_METHOD_NAME = "removeOwnerFromRegister";
    public static final String REMOVE_DOG_METHOD_NAME = "removeDogFromRegister";

    public static final String GIVE_DOG_METHOD_NAME = "giveDog";
    public static final String REMOVE_OWNED_DOG_METHOD_NAME = "removeOwnedDog";

    public static final String LIST_OWNERS_METHOD_NAME = "listAllOwners";
    public static final String LIST_DOGS_METHOD_NAME = "listAllDogs";

    public static final String SWAP_DOGS_OWN_METHOD_NAME = "swapDogs";
    public static final String FIND_SMALLEST_METHOD_NAME = "findSmallestDog";
    public static final String SORT_DOGS_METHOD_NAME = "sortDogs";

    //DogList
    public static final String DOG_LIST_CLASS_NAME = "DogList";
    public static final String DOG_LIST_CLASS_ADD_DOG_METHOD_NAME = "addDogToOwnedDogs";
    public static final String DOG_LIST_CLASS_REMOVE_DOG_METHOD_NAME = "removeDogFromOwnedDogs";
    public static final String DOG_LIST_CLASS_DOG_EXISTS_METHOD_NAME = "checkDog";

    //Owner
    public static final String ADD_DOG_TO_OWNER_METHOD_NAME = "addDogToOwner";
    public static final String REMOVE_DOG_FROM_OWNER_METHOD_NAME = "removeDogFromOwner";
    public static final String OWNS_DOG_METHOD_NAME = "checkIfOwnerOwnsDog";

    //Dog
    public static final String SET_OWNER_OF_DOG_METHOD_NAME = "addOwnerToDog";
    public static final String REMOVE_OWNER_OF_DOG_METHOD_NAME = "removeOwnerFromDog";

    //InputScanner
    public static final String SCANNER_ADAPTER_CLASS_NAME = "InputScanner";
    public static final String READ_TEXT_METHOD_NAME = "inputString";
    public static final String READ_INTEGER_METHOD_NAME = "inputInt";
    public static final String READ_DECIMAL_METHOD_NAME = "inputDouble";

}