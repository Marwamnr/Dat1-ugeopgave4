public class Main {
	public static void main (String[] args){

	Team team1 = new Team("Danmark");
	team1.setRank(1);
	System.out.println(team1);

	Team team2 = new Team("Marokko");
	team2.setRank(2);
	System.out.println(team2);

	Team team3 = new Team("Sverige");
	team3.setRank(3);
	System.out.println(team3);
	
	Team team4 = new Team("Tyrkiet");
	team4.setRank(4);
	System.out.println(team4);

	Team team5 = new Team("Tyskland");
	team5.setRank(5);
	System.out.println(team5);
}
}