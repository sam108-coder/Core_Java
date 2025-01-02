package threadClasss;


// WITHOUT THREAD
class PlayVideo {
    void executeVideo() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Video is Playing");
        }
    }
}

class PlaySound {
    void executeSound() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Sound is Executing");
        }
    }
}

public class Vlc1 {
    public static void main(String[] args) {
        PlayVideo pv = new PlayVideo();
        pv.executeVideo();

        PlaySound ps = new PlaySound();
        ps.executeSound();
    }
}
