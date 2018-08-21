package game;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Game {

    Scanner scanner = new Scanner(System.in);

    Team team1 = new Team(scanner.nextLine(), scanner.nextLine());
    Team team2 = new Team(scanner.nextLine(), scanner.nextLine());

    int games;

    public void winOrLose() {
        if (team1.matchGoals > team2.matchGoals) {
            team1.setPoints(team1.getPoints() + 3);
            System.out.println("Drużyna nr 1 zwycięża " + team1.matchGoals + " do " + team2.matchGoals);
        } else if (team2.matchGoals > team1.matchGoals) {
            team2.setPoints(team2.getPoints() + 3);
            System.out.println("Drużyna nr 2 zwycięża " + team2.matchGoals + " do " + team1.matchGoals);

        }
        team1.games++;
        team2.games++;
    }

    public void draw() {
        if (team1.matchGoals == team1.matchGoals) {
            team1.setPoints(team1.getPoints() + 1);
            team2.setPoints(team2.getPoints() + 1);
            System.out.println("Mamy remis " + team1.matchGoals + " : " + team2.matchGoals);
        }
        team1.games++;
        team2.games++;
    }

    public String addresult(int home, int away) {
        home = team1.matchGoals;
        away = team2.matchGoals;
        return toString(addresult(team1.matchGoals, team2.matchGoals));
    }

    private String toString(String addresult) {
        return toString();
    }

    public  void table(){

    List <Team> table = new ArrayList <>();
        table.add(team1);
        table.add(team2);
        
}
}

