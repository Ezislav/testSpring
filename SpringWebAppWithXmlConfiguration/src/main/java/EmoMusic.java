public class EmoMusic implements Music {

    private EmoMusic() {}

    public static EmoMusic getEmoMusic() {
        return new EmoMusic();
    }

    @Override
    public String getSong() {
        System.out.println("Emo music");
        return "Emo music";
    }

    void doMyInit() {
        System.out.println("Doing my inialization");
    }

    void doMyDestruct() {
        System.out.println("Doing my destruction");
    }
}