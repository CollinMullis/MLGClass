public class mlg {

// Class to keep track of MLG Players & teams
// CMP112 Collin Mullis 13 February 2015 edit

	public String team;
	public String player;
	public double kd;
	public double caps;
	public double defends;
	
/* -------------------------------------------------------------------*/

 	mlg () {
		team = "No team";
		player = "No one";
		kd = 0;
		caps = 0;
		defends = 0;
		}
	mlg (String thisTeam, String thisPlayer, double thisKD, double thiscaps, double thisdefends) {
		team = thisTeam;
		player = thisPlayer;
		kd = thisKD;
		caps = thiscaps;
		defends = thisdefends;
		}
	public String toString() {
		String output = "";
		output = "Team: " + team + " Player: " + player + " K/D: " + kd + " Caps: " + caps + " Defends: " + defends;
		return output;
		}
}
			   
