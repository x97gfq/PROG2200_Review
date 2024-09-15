package football;

abstract class FootballPlayer {
    String name;
    int number;

    FootballPlayer(String name, int number) {
        this.name = name;
        this.number = number;
    }

    abstract void play();
}


