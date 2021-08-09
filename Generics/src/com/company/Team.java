package com.company;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team <T>> {
    private String name;
    private int won = 0;
    private int lost = 0;
    private int tied = 0;
    private int played = 0;
    private ArrayList<T> members = new ArrayList<>();
    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getCount()
    {
        return this.members.size();

    }
    public void addPlayer(T name)
    {
        if(this.members.contains(name))
        {
            System.out.println(name.getName()+ " already exists in team");
        }
        else
        {
            this.members.add(name);
            System.out.println(name.getName()+" added to the "+this.getName()+ ".");
        }

    }

    public void matchResult( Team<T> opponent, int theirScore, int ourScore)
    {
        String message = "";
        if(ourScore > theirScore)
        {
            this.won++;
            message = " beat ";
        }
        else if(theirScore == ourScore)
        {
            this.tied++;
            message = " drew with ";

        }
        else
        {
            this.lost++;
            message = " lost to ";
        }
        if(opponent!= null)
        {
            System.out.println(this.getName()+ message + opponent.getName());
            opponent.matchResult(null, ourScore, theirScore);
        }
    }
    public int ranking()
    {
        return won*2 + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking()> team.ranking())return -1;
        else if (this.ranking()< team.ranking())return 1;
        return 0;
    }
}
