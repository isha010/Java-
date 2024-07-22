import java.util.Scanner;
public class SUPPLY {

	int input;
	String FoodName, Sticker, FoodType;
	
	void GetType() {
		if(Sticker.equalsIgnoreCase("Green")) {
			FoodType = "Vegetarian";
		}
		else if(Sticker.equalsIgnoreCase("Yellow")) {
			FoodType = "Contains egg";
		}
		else if(Sticker.equalsIgnoreCase("Red")) {
			FoodType = "Non-vegetarian";
		}
		else {
			FoodType = "Unknown";
		}
	}

	void FoodIn() {
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Enter Code:");
		input = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter FoodName:");
		FoodName = scanner.nextLine();
		System.out.println("Enter Sticker:");
		Sticker = scanner.nextLine();
		GetType();
	}
	
	void FoodOut() {
		System.out.println("Code: "+input);
		System.out.println("FoodName: "+FoodName);
		System.out.println("Sticker: "+Sticker);
		System.out.println("FoodType: "+FoodType);
	}

	public static void main(String[] args) {
		SUPPLY s = new SUPPLY();
		s.FoodIn();
		s.FoodOut();
	}
}
