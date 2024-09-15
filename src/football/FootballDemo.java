package football;

public class FootballDemo {
    public static void main(String[] args) {
        Team team = new Team();

        team.addPlayer(new Quarterback("Tom", 12));
        team.addPlayer(new Receiver("Jerry", 88));
        team.addPlayer(new Linebacker("Mike", 52));
        team.addPlayer(new Receiver("Sam", 81));
        team.addPlayer(new Linebacker("Jake", 55));
        team.addPlayer(new Quarterback("Alex", 10));
        team.addPlayer(new Receiver("Chris", 87));
        team.addPlayer(new Linebacker("Ryan", 50));
        team.addPlayer(new Quarterback("Nick", 11));
        team.addPlayer(new Receiver("Steve", 82));

        team.showTeam();
    }
}
