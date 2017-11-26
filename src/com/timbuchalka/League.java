package com.timbuchalka;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by Antonina on 2017-11-19.
 */
public class League<T extends Team> {
    private String name;
    private ArrayList<T> teams;

    public League(String name) {
        this.name = name;
        this.teams = new ArrayList<T>();
    }

    public ArrayList<T> getTeams() {
        return teams;
    }

    public void addTeam(T team){
        if(this.teams.contains(team)){
            System.out.println("League " + this.name + " contains " + team.getName());
        }
        else {
            this.teams.add(team);

        }
    }

    public <T extends Player> void matchResult(Team<T> team1, Team<T> oponent, int ourScore, int theirScore){
        String message;
        if(ourScore>theirScore){
            team1.setWins(team1.getWins()+1);
            oponent.setLooses(oponent.getLooses()+1);
            message = " beat ";
        }
        else if(ourScore<theirScore){
            team1.setLooses(team1.getLooses()+1);
            oponent.setWins(oponent.getWins()+1);
            message = " lost to ";
        }
        else{
            team1.setTies(team1.getTies()+1);
            oponent.setTies(oponent.getTies()+1);
            message = " drew with ";
        }
        team1.setPoints(team1.getTies() + 2*team1.getWins());
        oponent.setPoints(oponent.getTies() + 2*oponent.getWins());

        System.out.println(team1.getName() + message + oponent.getName());
    }

    public void printLeague(){
        this.teams.sort(new Comparator<T>() {
            @Override
            public int compare(T team1, T team2) {
                return team2.getPoints() - team1.getPoints();
            }
        });
        System.out.println("League " + this.name + " teams: ");
        for(int i=0; i<this.teams.size(); i++){
            System.out.println(i+1 + ". " + teams.get(i).getName());
        }

        for(Team team : this.getTeams()){
            System.out.println("Size of team " + team.getName() + " = " + team.getMembers().size() + ", points = " + team.getPoints());
        }
    }

}
