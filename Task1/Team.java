import java.util.ArrayList;

public class Team {
  private String teamName;
  private int teamRank;
  private ArrayList<String> PlayerName; 

  public Team(String teamName){
    this.teamName = teamName; 
  }
  public void setRank(int rank){
    this.teamRank = rank;
  }
  public String toString(){

    return "Team: " + teamName + " Rank: " + teamRank;
  }
}