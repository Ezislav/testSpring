package music.genres;

import music.Music;

//@Component
public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Rock music";
    }
}
