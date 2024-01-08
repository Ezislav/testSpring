package music;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Music music = context.getBean("emoMusic", Music.class);

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

//
        musicPlayer.playMusic();

//        Computer computer = context.getBean("computer", Computer.class);

//        System.out.println(computer);

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());


        context.close();
    }
}
