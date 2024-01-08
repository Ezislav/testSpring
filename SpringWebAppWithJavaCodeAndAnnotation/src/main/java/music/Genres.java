package music;

import java.util.List;

public class Genres {
    private Music classicalMusic;
    private Music emoMusic;
    private Music RockMusic;

    public Genres(Music classicalMusic,
                  Music emoMusic,
                  Music rockMusic) {
        this.classicalMusic = classicalMusic;
        this.emoMusic = emoMusic;
        RockMusic = rockMusic;
    }
}
