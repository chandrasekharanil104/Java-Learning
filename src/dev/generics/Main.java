package dev.generics;

interface Player{
    String name();
};
record  BaseballPlayer(String name, String position) implements Player{}
record FootballPlayer(String name, String position) implements Player{}

public class Main {
    public static void main(String[] args){

        BaseballTeam phukies1 = new BaseballTeam("Phukies");
        BaseballTeam newkies1= new BaseballTeam("Newkies");
        scoreResult(phukies1, 10, newkies1, 5);;

        SportsTeam phukies2 = new SportsTeam("Phukies");
        SportsTeam newkies2 = new SportsTeam("Newkies");
        scoreResult(phukies2, 10, newkies2, 5);;


        Team<BaseballPlayer> phukies = new Team<>("Phukies");
        Team<BaseballPlayer> newkies = new Team<>("Newkies");
        scoreResult(phukies, 10, newkies, 5);;

        BaseballPlayer player1 = new BaseballPlayer("John", "Pitcher");
        var player2 = new BaseballPlayer("Mike", "Catcher");


        phukies.addTeamNumber(player1);
        phukies.addTeamNumber(player2);
        phukies.listTeamMembers();



        SportsTeam afc = new SportsTeam("AFC");
        FootballPlayer footballPlayer1 = new FootballPlayer("Tom", "Quarterback");
        var footballPlayer2 = new FootballPlayer("Jerry", "Wide Receiver");
        afc.addTeamNumber(footballPlayer1);
        afc.addTeamNumber(footballPlayer2);
        afc.listTeamMembers();

        Team<BaseballPlayer> StrawHats = new Team<>("Straw Hats");
        BaseballPlayer playerL = new BaseballPlayer("Monkey D Luffy", "Captain");
        StrawHats.addTeamNumber(playerL);
//        StrawHats.addTeamNumber(footballPlayer2); // This line would cause a compile-time error
        StrawHats.listTeamMembers();

        Team<String> MonkeyDWarriors = new Team<>("Monkey D Warriiors");
        MonkeyDWarriors.addTeamNumber("Monkey D Luffy");
        MonkeyDWarriors.listTeamMembers();

    }

    public static void scoreResult(BaseballTeam team1, int t1Score, BaseballTeam team2, int t2Score){
        String message = team1.setScore(t1Score, t2Score);
        team2.setScore(t2Score, t1Score);
        System.out.println(team1 + " " + message + " " + team2);
    }

    public static void scoreResult(SportsTeam team1, int t1Score, SportsTeam team2, int t2Score){
        String message = team1.setScore(t1Score, t2Score);
        team2.setScore(t2Score, t1Score);
        System.out.println(team1 + " " + message + " " + team2);
    }

    public static void scoreResult(Team team1, int t1Score, Team team2, int t2Score){
        String message = team1.setScore(t1Score, t2Score);
        team2.setScore(t2Score, t1Score);
        System.out.println(team1 + " " + message + " " + team2);
    }
}
