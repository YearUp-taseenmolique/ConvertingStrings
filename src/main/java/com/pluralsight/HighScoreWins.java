package com.pluralsight;
import java.util.*;

public class HighScoreWins {
    static Scanner s = new Scanner(System.in);
    public static void main (String [] args){

        String gameScore = promptForScore("What is the game score? ");


        String[] parts = gameScore.split("\\|");
        String teams = parts[0];
        String points = parts [1];

        String[] teamNames = teams.split(":");
        String homeTeam = teamNames[0];
        String awayTeam = teamNames[1];

        String[] teamScore = points.split(":");
        int homeScore = Integer.parseInt(teamScore[0]);
        int awayScore = Integer.parseInt(teamScore[1]);


        String winner;
        if (homeScore > awayScore){
            winner = homeTeam;
        } else {
            winner = awayTeam;
        }

        System.out.println("WINNER: " + winner);





    }

    public static String promptForScore (String prompt){
        System.out.print(prompt);
        return s.nextLine();
    }

}
