package com.company;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    private int played,won,lost,tie;
    private ArrayList<T> players = new ArrayList<>();
    private T captain ;

    public Team(String name) {
        this.name = name;
        this.played = 0;
        this.lost=0;
        this.tie=0;
        this.won = 0;

    }

    public String getName() {
        return name;
    }
    public boolean makeCaptain(T player)
    {
        if(this.players.contains(player)) {
            this.captain = player;
            System.out.println(player.getName() + " is the Captain of " + this.getName());
            return true;
        }
        else
        {
            System.out.println(this.getName()+" do not have "+player.getName()+" in squad.");
            return false;
        }
    }
    public void addPlayer(T player)
    {
        if(player.isInTeam())
        {
            System.out.println(player.getName()+" already exists in team.");
        }
        else
        {
            this.players.add(player);
            player.setInTeam(true);
            System.out.println(player.getName()+" added to "+this.getName());
        }
    }

    public void squad()
    {
        System.out.println(this.getName()+" Squad:");
        for (T player : this.players)
            System.out.println(player.getName());
    }

    public int points()
    {
        return 2* this.won+ this.tie;
    }

}
