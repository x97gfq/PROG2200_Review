package football;

abstract class FootballPlayer implements Play {
    String name;
    int number;

    FootballPlayer(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public abstract void play();
}


