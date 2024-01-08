package music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    @Autowired
    public ClassicalMusic() {
    }

    @Override
    public String getSong() {
        return "Classical music";
    }
}
