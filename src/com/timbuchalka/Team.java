package com.timbuchalka;

import java.util.ArrayList;

/**
 * Created by Antonina on 2017-11-19.
 */
public class Team<T extends Player>{
    private String name;
    private int points;
    private int wins;
    private int looses;
    private int ties;

    private ArrayList<T> members;

    public Team(String name) {
        this.name = name;
        this.members = new ArrayList<T>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<T> getMembers() {
        return members;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLooses() {
        return looses;
    }

    public void setLooses(int looses) {
        this.looses = looses;
    }

    public int getTies() {
        return ties;
    }

    public void setTies(int ties) {
        this.ties = ties;
    }

    public boolean addPlayer(T player){
        if(this.members.contains(player)){
            System.out.println("Player " + player.getName() + " is already part of team " + this.name);
            return false;
        }

        else if(player.isTaken()){
            System.out.println("Player " + player.getName() + " is already picked for another team");
            return false;
        }

        else {
            this.members.add(player);
            player.setTaken(true);
            System.out.println("Player " + player.getName() + " picked for team " + this.name);
            return true;
        }
    }



}
