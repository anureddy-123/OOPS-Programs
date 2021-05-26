package player;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Player {

	String name;
	String country;
	int totalRuns;
	int highestScore;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getTotalRuns() {
		return totalRuns;
	}

	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}

	public int getHighestScore() {
		return highestScore;
	}

	public void setHighestScore(int highestScore) {
		this.highestScore = highestScore;
	}

	public Player(String name, String country, int totalRuns, int highestScore) {
		super();
		this.name = name;
		this.country = country;
		this.totalRuns = totalRuns;
		this.highestScore = highestScore;
	}

	public Player() {
		super();

	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", country=" + country + ", totalRuns=" + totalRuns + ", highestScore="
				+ highestScore + "]";
	}

}

class CricketStatistics {

	List<Player> playersList;

	public List <Player> getplayersList() {
		return playersList;
	}

	public void setplayersList(List<Player> playersList) {
		this.playersList = playersList;
	}

	public CricketStatistics(List<Player> playersList) {
		super();
		this.playersList = playersList;
	}

	@Override
	public String toString() {
		return "CricketStatistics [playersList=" +" "+playersList + "]";
	}

}

public class PlayerFileRead {
	public static void main(String[] args) {

		try {

			File file = new File("./src/Player.txt");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			StringBuffer sb = new StringBuffer();
			String playerLines;
			ArrayList<Player> playersList = new ArrayList<Player>();
			
			while ((playerLines = br.readLine()) != null) {
				String[] values = playerLines.split(";");
				if (!values[0].equals("PlayerName")) {
					Player player = new Player();
					player.setName(values[0]);
					player.setCountry(values[1]);
					player.setTotalRuns(Integer.parseInt(values[2]));
					player.setHighestScore(Integer.parseInt(values[3]));
					playersList.add(player);
					System.out.println("Player : " + player.toString());
				}
			}
			CricketStatistics playersDetails = new CricketStatistics(playersList);
			System.out.println("playersDetails : " +" "+ playersDetails.toString());
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
