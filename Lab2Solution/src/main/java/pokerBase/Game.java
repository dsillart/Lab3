package pokerBase;
import java.util.ArrayList;
import java.util.UUID;

public class Game {

	private UUID GameID;
	private UUID TableID;
	private ArrayList<Player> GamePlayers = new ArrayList<Player>();

	public Game(UUID GameID, UUID TableID, ArrayList<Player> GamePlayers) {
		this.GameID = GameID;
		this.TableID = TableID;
		this.GamePlayers = GamePlayers;	
	}
	
	public UUID getGameID() {
		return GameID;
	}
	
	public UUID getTableID() {
			return TableID;
	}
	
	public ArrayList<Player> getPlayers() {
		return GamePlayers;
	}
	
	public void setGameID(UUID newGameID) {
		this.GameID = newGameID;
	}
	
	public void setTableID(UUID newTableID) {
		this.TableID = newTableID;
	}
	
	public ArrayList<Player> setPlayers(ArrayList<Player> newGamePlayers) {
		return this.GamePlayers = newGamePlayers;
	}
}
