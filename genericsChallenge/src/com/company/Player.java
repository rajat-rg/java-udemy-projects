package com.company;

public class Player {
    private String name;
    private int age;
    private String role;
    private boolean inTeam;

    public Player(String name, int age, int role) {
        this.name = name;
        this.age = age;
        switch (role){
            case 0: this.role = "Batsman";
            break;
            case 1: this.role = "Bowler";
            break;
            case 2: this.role= " All-rounder";
            break;
            default:
                this.role = "Bench";
                break;

        }
        this.inTeam = false;

    }

    public String getName() {
        return name;
    }

    public boolean isInTeam() {
        return inTeam;
    }

    public void setInTeam(boolean inTeam) {
        this.inTeam = inTeam;
    }
}
