package football;

class Linebacker extends FootballPlayer {
    Linebacker(String name, int number) {
        super(name, number);
    }

    @Override
    void play() {
        System.out.println(name + " (Number " + number + ") is tackling the opponent.");
    }
}