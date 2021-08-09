package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CricketPlayer virat = new CricketPlayer("Virat");
        CricketPlayer Dhoni = new CricketPlayer("Dhoni");
        FootballPlayer sunil = new FootballPlayer("Sunil");
        BaseballPlayer tim = new BaseballPlayer("Tim");

        Team<CricketPlayer> CricketTeam  = new Team<>("Indian cricket team");
        Team<CricketPlayer> CricketTeam2  = new Team<>("Chennai Super Kings");
        Team<FootballPlayer> FootballTeam  = new Team<>("Indian football team");
        Team<BaseballPlayer> BaseballTeam  = new Team<>("Indian baseball team");
        CricketTeam.addPlayer(virat);
        CricketTeam2.addPlayer(Dhoni);
        FootballTeam.addPlayer(sunil);
        BaseballTeam.addPlayer(tim);


        CricketTeam.matchResult(CricketTeam2,2,4);
        CricketTeam2.matchResult(CricketTeam,6,4);

        CricketTeam.ranking();
        CricketTeam2.ranking();

        System.out.println(CricketTeam.compareTo(CricketTeam2));
    }
}
