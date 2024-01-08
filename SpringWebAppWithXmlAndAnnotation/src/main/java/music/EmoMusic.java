package music;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class EmoMusic implements Music {


    @PostConstruct
    void doMyInit() {
        System.out.println("Doing my inialization");
    }

    @PreDestroy
    void doMyDestruct() {
        System.out.println("Doing my destruction");
    }

    @Override
    public String getSong() {
        System.out.println("Emo music");
        return "Emo music";
    }
}