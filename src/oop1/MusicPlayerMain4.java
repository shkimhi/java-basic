package oop1;

public class MusicPlayerMain4 {

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer(); //이걸 사용하는 개발자는 기능만 불러다 사용하면 된다.

        player.on();

        player.volumeUp();
        player.volumeUp();
        player.volumeDown();
        player.volumeStatus();

        player.off();

    }
}
