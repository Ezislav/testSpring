package music;

import music.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    private List<Music> musicList;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic() {
        Random random = new Random();

        return "Playing: " + musicList.get(random.nextInt(musicList.size())).getSong()
                + " with volume " + this.volume;
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