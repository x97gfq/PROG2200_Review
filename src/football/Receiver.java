package football;

class Receiver extends FootballPlayer {
    Receiver(String name, int number) {
        super(name, number);
    }

    @Override
    public void play() {
        System.out.println(name + " (Number " + number + ") is catching the ball.");
    }
}