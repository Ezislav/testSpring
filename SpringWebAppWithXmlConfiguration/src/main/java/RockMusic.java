public class RockMusic implements Music {

    @Override
    public String getSong() {
//        System.out.println("Rock music");
        return "Rock music";

    }

    void doMyInit() {
        System.out.println("Doing my inialization");
    }

    void doMyDestruct() {
        System.out.println("Doing my destruction");
    }
}
