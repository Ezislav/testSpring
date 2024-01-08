package music.genres;

import music.Music;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class EmoMusic implements Music {

//    @PostConstruct
//    void doMyInit() {
//        System.out.println("Doing my inialization");
//    }
//
//    @PreDestroy
//    void doMyDestruct() {
//        System.out.println("Doing my destruction");
//    }

    @Override
    public String getSong() {
        return "Emo music";
    }
}