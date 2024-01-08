package music;

import music.genres.ClassicalMusic;
import music.genres.EmoMusic;
import music.genres.RockMusic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;
import java.util.List;

@Configuration
//@ComponentScan("music")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public EmoMusic emoMusic() {
        return new EmoMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public List<Music> musicList() {
        return Arrays.asList(classicalMusic(), rockMusic(), emoMusic());
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicList());
    }

//    @Bean
//    public Computer computer() {
//        return new Computer(musicPlayer());
//    }

}
