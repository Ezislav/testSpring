package music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

    private Music music;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    @Autowired
    public MusicPlayer(@Qualifier("emoMusic") Music music) {
        this.music = music;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic() {
//        System.out.println("Playing: " + classicalMusic.getSong());
//        System.out.println("Playing: " + music.getSong());
        return "Playing: " + music;

    }










    //Внедрение через приватное поле (рефлексия)
//    @Autowired
//    private Music music;

    //Внедрение через конструктор
//    @Autowired
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }

    //Внедрение через сеттер
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }
}