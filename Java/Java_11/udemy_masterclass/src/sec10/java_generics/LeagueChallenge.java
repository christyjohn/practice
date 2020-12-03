package sec10.java_generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeagueChallenge {
    public static void main(String[] args) {
        FootballTeam manUnited = new FootballTeam("Manchester United");
        FootballTeam chelsea = new FootballTeam("Chelsea");
        FootballTeam arsenal = new FootballTeam("Arsenal");
        FootballTeam liverpool = new FootballTeam("Liverpool");
        FootballTeam totenham = new FootballTeam("Totenham");
        FootballTeam wolves = new FootballTeam("Wolverhampton");

        CricketTeam bangalore = new CricketTeam("RoyalChallengers bangalore");
        CricketTeam mumbai = new CricketTeam("Mumbai Indians");
        CricketTeam rajasthan = new CricketTeam("Rajasthan Royals");

        List<FootballTeam> footballTeams = new ArrayList<>();
        footballTeams.add(manUnited);
        footballTeams.add(chelsea);
        footballTeams.add(arsenal);
        footballTeams.add(liverpool);
        footballTeams.add(totenham);
        footballTeams.add(wolves);

        List<CricketTeam> cricketTeams = new ArrayList<>();
        cricketTeams.add(bangalore);
        cricketTeams.add(mumbai);
        cricketTeams.add(rajasthan);

        League epl = new League("English Premier League", footballTeams);
        League ipl = new League("Indian Premier League", cricketTeams);

        manUnited.matchResult(chelsea, 4, 1);
        manUnited.matchResult(wolves, 2, 0);
        wolves.matchResult(liverpool, 1, 1);
        manUnited.matchResult(totenham, 1, 6);
        liverpool.matchResult(arsenal, 0, 0);
        manUnited.matchResult(chelsea, 4, 1);
        arsenal.matchResult(wolves, 2, 0);
        chelsea.matchResult(liverpool, 1, 1);
        totenham.matchResult(chelsea 1, 6);
        wolves.matchResult(arsenal, 0, 0);
        liverpool.matchResult(chelsea, 4, 1);
        manUnited.matchResult(wolves, 2, 0);
        wolves.matchResult(liverpool, 1, 1);
        liverpool.matchResult(totenham, 1, 6);
        manUnited.matchResult(arsenal, 0, 0);

        Collections.sort(footballTeams);
        System.out.println("Rankings");

        for (Team team : footballTeams) {
            System.out.println(team.getName() + ": " + team.ranking());
        }
    }
}
