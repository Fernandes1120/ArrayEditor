import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class test1 {

	
	static boolean continueProgress = false;
	static ArrayList<String> animalList = new ArrayList<String>();

	
	public static void main(String[] args) {
		
		animalList.add("Dog");
		animalList.add("Cat");
		animalList.add("Rabbit");
		
		System.out.print("Starting array: " + animalList);
		
		//uncomment for debug
		//System.out.println(" size = " + animalList.size());
		
		Scanner firstQuestion = new Scanner(System.in);
		
		do {
		System.out.println("\nWould you like to (a)dd, (i)nsert, (r)emove, re(p)lace, or (q)uit?");
		
		int selection1 = 0;
		do {
		String firstAnswer = firstQuestion.nextLine();
		if(firstAnswer.equalsIgnoreCase("a")) {
			selection1 = 1;
			addInput();
		}else if(firstAnswer.equalsIgnoreCase("i")) {
			selection1 = 1;
			insertInput();
		}else if(firstAnswer.equalsIgnoreCase("r")) {
			selection1 = 1;
			removeInput();
		}else if(firstAnswer.equalsIgnoreCase("p")) {
			selection1 = 1;
			replaceInput();
		}else if(firstAnswer.equalsIgnoreCase("q")) {
			selection1 = 1;
			System.exit(0);
		}else {
			
		System.out.println("Invalid input, please re-enter your answer");
		selection1 = 0;
		}
		
		}while(selection1 == 0);
	}while(continueProgress == true);
	}

	public static void replaceInput() {
		Scanner newReplacement = new Scanner(System.in);
		System.out.println("Enter the animal you would like to replace for the one that preexists");
		String actualReplacement = newReplacement.nextLine();
		Scanner getReplaceIndex = new Scanner(System.in);
		System.out.println("Where would you like " + actualReplacement + " to replace? (Integer values only)");
		int replacementSelection = 0;
		do {
		int actualReplaceIndex = getReplaceIndex.nextInt();
		if(actualReplaceIndex < 0) {
			System.out.println("Out of bounds, please try again");
			replacementSelection = 0;
		}else if(actualReplaceIndex > animalList.size()) {
			System.out.println("Out of bounds, please try again");
			replacementSelection = 0;
		}else if((actualReplaceIndex > 0) || actualReplaceIndex <= animalList.size()) {
			animalList.set(actualReplaceIndex-1, actualReplacement);
			System.out.println(animalList);
		}
		}while(replacementSelection == 0);
		
		Scanner continueYN = new Scanner(System.in);
		System.out.println("Would you like to continue editing your array list? Y or N");
		String userInput = continueYN.nextLine();
		
		if(userInput.equalsIgnoreCase("Y")) {
			continueProgress = true;
		}else {
			System.exit(0);
		}
	}//end of replacement method

	public static void insertInput() {
		Scanner newInsert = new Scanner(System.in);
		System.out.println("Enter the animal you would like to insert: ");
		String toInsert = newInsert.nextLine();
		Scanner newInsert2 = new Scanner(System.in);
		System.out.println("Enter the position where you like like " + toInsert + " to go");
		int insertSelection = 0;
		do {
			int toInsert2 = newInsert2.nextInt();
		if(toInsert2 > animalList.size()) {
			System.out.println("Out of bounds, please try again");
			insertSelection = 0;
		}else if(toInsert2 < 0) {
			System.out.println("Out of bounds, please try again");
			insertSelection = 0;
		}else if((toInsert2 > 0) || (toInsert2 <= animalList.size())) {
			animalList.add(toInsert2-1, toInsert);
			insertSelection = 1;
			System.out.println(animalList);
		}
	}while(insertSelection == 0);
		
		Scanner continueYN = new Scanner(System.in);
		System.out.println("Would you like to continue editing your array list? Y or N");
		String userInput = continueYN.nextLine();
		
		if(userInput.equalsIgnoreCase("Y")) {
			continueProgress = true;
		}else {
			System.exit(0);
		}
		
}//end of insertInput method

	public static void removeInput() {
		Scanner newRemove = new Scanner(System.in);
		System.out.println("Which position or index would you like to remove?");
		int removeIndex = newRemove.nextInt();
		int removeSelection = 0;
		do {

		if(removeIndex < 0) {
			System.out.println("Out of bounds, please try again");
			removeSelection = 0;
		}else if(removeIndex > animalList.size()) {
			System.out.println("Out of bounds, please try again");
			removeSelection = 0;
		}else if((removeIndex > 0) || removeIndex <= animalList.size()) {
			removeSelection = 1;
			animalList.remove(removeIndex-1);
			System.out.println(animalList);
		}
	
		}while(removeSelection == 0);
		
		Scanner continueYN = new Scanner(System.in);
		System.out.println("Would you like to continue editing your array list? Y or N");
		String userInput = continueYN.nextLine();
		
		if(userInput.equalsIgnoreCase("Y")) {
			continueProgress = true;
		}else {
			System.exit(0);
		}
	}

	public static void addInput() {
		Scanner newAdd = new Scanner(System.in);
		System.out.println("Enter the animal you would like to add");
		String toAdd = newAdd.nextLine();
		animalList.add(toAdd);
		System.out.println(animalList);
		
		Scanner continueYN = new Scanner(System.in);
		System.out.println("Would you like to continue editing your array list? Y or N");
		String userInput = continueYN.nextLine();
		
		if(userInput.equalsIgnoreCase("Y")) {
			continueProgress = true;
		}else {
			System.exit(0);
		}
	// end of insertInput method
	}
}



