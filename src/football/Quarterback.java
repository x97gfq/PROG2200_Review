package football;

class Quarterback extends FootballPlayer {
    Quarterback(String name, int number) {
        super(name, number);
    }

    @Override
    public void play() {
        System.out.println(name + " (Number " + number + ") is throwing the ball.");
    }
}
