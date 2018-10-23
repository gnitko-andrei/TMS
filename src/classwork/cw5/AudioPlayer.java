package ClassWork.CW5;

public class AudioPlayer implements Player, Player2 {
    public AudioPlayer() {
    }

    public void play() {
        System.out.println("Audio play");
    }

    public void stop() {
        System.out.println("Audio stop");
    }
}