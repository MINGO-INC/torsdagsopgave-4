import java.util.ArrayList;

class Team{
	
	private ArrayList<String> players = new ArrayList<>();

	private String teamName;
	private int teamRank;


	public Team(String playerTeam){
		this.teamName=playerTeam;
	}

public ArrayList<String> getPlayers() {
	//◊◊😀◊◊
	return this.players;
}

public int getRank(){
	return this.teamRank;
}

	public void setRank(int newRank){
		this.teamRank=newRank;
		System.out.println(teamRank);
	}


	public String toString(){

        String s = "Team: " + this.teamName + "spillere: " + players + " 😀 Rank: " + teamRank ;

        return s;

	}

}