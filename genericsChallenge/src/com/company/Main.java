package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cricketer msd = new Cricketer("MS Dhoni",38,0);
        Cricketer virat = new Cricketer("Virat kohli",38,0);
        Cricketer rohit = new Cricketer("Rohit Sharma",38,0);
        Cricketer pant = new Cricketer("Rishabh Pant",38,0);
        Cricketer ashwin = new Cricketer("RaviChandran Ashwin",38,2);
        Cricketer abd = new Cricketer("AB de villiers",38,0);
        Cricketer smith = new Cricketer("Steve Smith",38,0);
        Cricketer bhuvi = new Cricketer("bhuvneshwar Kumar",38,1);
        Cricketer pandya = new Cricketer("Hardik Pandya",38,2);
        Cricketer raina = new Cricketer("Suresh Raina",38,2);
        Cricketer archer = new Cricketer("Jofra Archer",38,1);
        Cricketer lungi = new Cricketer("Lungi Ngidi",38,1);
        Cricketer deepak = new Cricketer("Deepak Chahar",38,1);
        Cricketer bumrah = new Cricketer("Jasprit Bumrah",38,1);
        Cricketer mayank = new Cricketer("Mayank Agarwal",38,1);
        Cricketer iyer = new Cricketer("Shreyas Iyer",38,0);

        Team CSK = new Team("Chennai Super Kings");
        Team MI = new Team("Mumbai Indians");
        Team RR = new Team("Rajasthan Royals");
        Team RCB = new Team("Royal Challengers Bangalore");
        Team DC = new Team("Delhi Capitals");
        Team SRH = new Team("Sunrisers Hydrabad");
        Team PBKS = new Team("Punjab Kings");
        Team KKR = new Team("Kolkata Knight Riders");


        CSK.addPlayer(msd);
        CSK.addPlayer(raina);
        SRH.addPlayer(deepak);
        KKR.addPlayer(lungi);
        MI.addPlayer(rohit);
        MI.addPlayer(pandya);
        KKR.addPlayer(bumrah);
        RCB.addPlayer(virat);
        RCB.addPlayer(abd);
        RR.addPlayer(smith);
        RR.addPlayer(archer);
        PBKS.addPlayer(ashwin);
        PBKS.addPlayer(mayank);
        DC.addPlayer(iyer);
        SRH.addPlayer(bhuvi);
        DC.addPlayer(pant);
        PBKS.squad();



    }
}
