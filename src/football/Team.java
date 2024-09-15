package football;

import java.util.ArrayList;
import java.util.List;

class Team {
    private List<FootballPlayer> players;

    Team() {
        players = new ArrayList<>();
    }

    void addPlayer(FootballPlayer player) {
        players.add(player);
    }

    void showTeam() {
        for (FootballPlayer player : players) {
            player.play();
        }
    }
}

