package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("footballLeague");
        FootballPlayer tim = new FootballPlayer("Tim");
        FootballPlayer sam = new FootballPlayer("Sam");

        FootballPlayer nick = new FootballPlayer("Nick");
        FootballPlayer leon = new FootballPlayer("Leon");

        FootballPlayer kim = new FootballPlayer("Kim");
        FootballPlayer jack = new FootballPlayer("Jack");

        BasketballPlayer sim = new BasketballPlayer("Sim");
        BasketballPlayer tom = new BasketballPlayer("Tom");

        Team<FootballPlayer> bears = new Team<>("Bears");
        bears.addPlayer(tim);
        bears.addPlayer(sam);

        Team<BasketballPlayer> bulls = new Team<>("Bulls");
        bulls.addPlayer(sim);
        bulls.addPlayer(tom);

        Team<FootballPlayer> boats = new Team<>("Boats");
        boats.addPlayer(nick);
        boats.addPlayer(leon);

        Team<FootballPlayer> bees = new Team<>("Bees");
        bees.addPlayer(tim);
        bees.addPlayer(jack);

        footballLeague.addTeam(bears);
        footballLeague.addTeam(bees);
        footballLeague.addTeam(boats);

        footballLeague.matchResult(bears, bees, 3, 2);
        footballLeague.matchResult(bees, boats, 1, 3);
        footballLeague.matchResult(boats, bears, 3, 2);

        footballLeague.printLeague();

       /* for(Team team : footballLeague.getTeams()){
            System.out.println("Size of team " + team.getName() + " = " + team.getMembers().size() + ", points = " + team.getPoints());
        } */

    }
}
