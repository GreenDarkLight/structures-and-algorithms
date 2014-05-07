
public class UserMenu {

	public static void main(String[] args) {
		int Choice;
		do {

			System.out.println(" Welcome");
			System.out.println("Please choose from the following options:");
			System.out.println("0. Exit");
			System.out.println("1. New Game");
			System.out.println("2. Continue Game");

			Choice = Input.getInteger("Please select an option");
			if (Choice == 1) {
				CreateGame();
			}
			if (Choice == 2) {
				System.out.println("Option 2");
			}
			if (Choice == 3) {
				System.out.println("Option 3");
			}
		} while (Choice != 0); // loops until the user chooses 3 to exit
	}// main

	public static void CreateGame() {
		// int Total;
		System.out.println("Welcome");

		int noOfPlayers = Input.getInteger("Please select how many Players");
		String[] PlayerName = new String[noOfPlayers];
		for (int I = 0; I < noOfPlayers; I++) {
			PlayerName[I] = Input.getString("Please enter player " + (I + 1)
					+ ":");
			System.out.println("Player " + (I + 1) + " is: " + PlayerName[I]);

		}

		Probability.ThrowTest1();
	}// CreateGame
		// left this alone as it works will work on the saving data aspect next

}// UserMenu
