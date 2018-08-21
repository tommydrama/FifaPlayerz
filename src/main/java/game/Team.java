package game;

import java.util.Scanner;

public class Team {
    private String playerName;
    private String teamName;
    int victories;
    int draws;
    int looses;
    int points;
    int matchGoals;
    Scanner name =new Scanner(System.in);
    int games;

    public Team(String playerName, String teamName) {
        this.playerName = playerName;
        this.teamName = teamName;

    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = name.nextLine();
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getVictories() {
        return victories;
    }

    public void setVictories(int victories) {
        this.victories = victories;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getMatchGoals() {
        return matchGoals;
    }

    public void setMatchGoals(int matchGoals) {
        this.matchGoals = matchGoals;
    }
}
