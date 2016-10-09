package pokerBase;
import java.util.ArrayList;
import java.util.UUID;

public class Table {
	
	private UUID TableID;
	private ArrayList<Player> Players = new ArrayList<Player>();		
	
	public Table(UUID TableID, ArrayList<Player> Players) {
		this.TableID = TableID;
		this.Players = Players;
	}
		
		public UUID getID() {
			return TableID;
		}
		
		public ArrayList<Player> getPlayers() {
				return Players;
		}
		
		public void setID(UUID newID) {
			this.TableID = newID;
		}
		
		public void setPlayerName(ArrayList<Player> newPlayers) {
			this.Players = newPlayers;
		}
		
		public void getPlayerPosition(int newPosition) {
	
			}
		
		public void addPlayer() {
			Players.add(new Player(PlayerID, PlayerName, PlayerPosition));	
			this.Players.add(new Player(PlayerID, PlayerName, PlayerPosition));
		}
}