package pokerBase;
import java.util.Scanner;
import java.util.UUID;

public class Player {

	private UUID PlayerID;
	private String PlayerName;
	
	public Player(String strPlayerName) {
		
		Scanner input = new Scanner(System.in);
		
		PlayerID = UUID.randomUUID();
		System.out.println("Enter your name:");
			String PlayerName = input.nextLine();
			players.add(new Player(PlayerID, PlayerName);
	}	
}