package pokerBase;
import java.util.ArrayList;
import java.util.UUID;

public class Player {

	private UUID PlayerID;
	private String PlayerName;
	private int PlayerPosition;
	private ArrayList<Player> Players = new ArrayList<Player>();		

	
	public Player(UUID PlayerID, String PlayerName, int PlayerPosition) {
		this.PlayerID = PlayerID;
		this.PlayerName = PlayerName;
		this.PlayerPosition = PlayerPosition;
		
		Players.add(new Player(PlayerID, PlayerName, PlayerPosition));	
	}
	
	public UUID getID() {
		return PlayerID;
	}
	
	public String getPlayerName() {
			return PlayerName;
	}
	
	public int getPlayerPosition() {
		return PlayerPosition;
	}
	
	public void setID(UUID newID) {
		this.PlayerID = newID;
	}
	
	public void setPlayerName(String newName) {
		this.PlayerName = newName;
	}
	
	public void getPlayerPosition(int newPosition) {
		this.PlayerPosition = newPosition;
	}
	
}