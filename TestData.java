// Elin Rudling elru4802
/**
 * Denna klass är bara till för att möjliggöra testning av de klasser och
 * metoder som du själv får namnge. Många av JUnit-testfallen till
 * inlämingsuppgiftens olika delar behöver kunna identifiera dessa, och de
 * kommer att leta efter namnen här.
 *
 * De konstanter som finns nedan är de som behövs för testen till U6.3,
 * inläsningsklassen och . Du kommer själv att behöva lägga till ytterligare
 * konstanter i filen när du går in på uppgifterna till föreläsning 7 och
 * framåt. Namnen på dessa kommer att stå i instruktionerna för uppgifterna, och
 * kan också ses i JUnit-testfallen för dem.
 */
public final class TestData {
	//8.8
	public static final String MAIN_DOG_LIST_NAME = "allDogs";
	public static final String MAIN_OWNER_LIST_NAME = "allOwners";

	public static final String REGISTER_NEW_DOG_METHOD_NAME = "registerNewDog";

	public static final String REMOVE_DOG_METHOD_NAME = "removeDogFromRegister";
	public static final String REMOVE_OWNER_METHOD_NAME = "removeOwnerFromRegister";

	public static final String GIVE_DOG_METHOD_NAME = "giveDog";
	public static final String REMOVE_OWNED_DOG_METHOD_NAME = "removeDog";

	public static final String LIST_DOGS_METHOD_NAME = "listAllDogs";
	public static final String LIST_OWNERS_METHOD_NAME = "listAllOwners";

	//DogList
	public static final String DOG_LIST_CLASS_NAME = "DogList";
	public static final String DOG_LIST_CLASS_DOG_EXISTS_METHOD_NAME = "checkDog";

	//Dog
	public static final String SET_OWNER_OF_DOG_METHOD_NAME = "addOwnerToDog";
	public static final String REMOVE_OWNER_OF_DOG_METHOD_NAME = "removeOwnerFromDog";

	//Owner
	public static final String OWNS_DOG_METHOD_NAME = "checkIfOwnerOwnsDog";
	public static final String ADD_DOG_TO_OWNER_METHOD_NAME = "addDogToOwner";
	public static final String REMOVE_DOG_FROM_OWNER_METHOD_NAME ="removeDogFromOwner";

}