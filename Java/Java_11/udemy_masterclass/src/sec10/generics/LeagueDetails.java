package sec10.generics;

import java.util.ArrayList;
import java.util.Collections;

public class LeagueDetails {
    public static void main(String[] args) {
        FootBallPlayer joe = new FootBallPlayer("Joe");
        FootBallPlayer banks = new FootBallPlayer("Gordon");
        BaseBallPlayer pat = new BaseBallPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootBallPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootBallPlayer> melbourne = new Team<>("Melbourne");
        Team<FootBallPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootBallPlayer> fremantle = new Team<>("Fremantle");

        Team<BaseBallPlayer> chicagoCubs = new Team<>("Chicago Cubs");
        Team<SoccerPlayer> manUnited = new Team<>("Manchester United");

        adelaideCrows.addPlayer(joe);
        melbourne.addPlayer(banks);
        chicagoCubs.addPlayer(pat);
        manUnited.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);
        adelaideCrows.matchResult(hawthorn, 1, 0);

        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));

        ArrayList<Team> teams = new ArrayList<>();
        teams.add(adelaideCrows);
        teams.add(melbourne);
        teams.add(hawthorn);
        teams.add(fremantle);

        Collections.sort(teams);

        System.out.println();
        for (Team team : teams) {
            System.out.println(team.getName());
        }
    }
}
