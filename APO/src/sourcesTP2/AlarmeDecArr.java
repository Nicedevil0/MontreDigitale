package sourcesTP2;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class AlarmeDecArr extends Arretable{

    private final Alarme alarme;

    public AlarmeDecArr(Alarme a){
        this.alarme = a;
    }

    @Override
    public void declencher() {
        System.out.println("    - L'alarme \"" + this.alarme.toString() + "\" sonne.");
        alarme.sonner();
    }

    @Override
    public void arreter() {
        System.out.println("    - L'alarme \"" + this.alarme.toString() + "\" s\'arrête de sonner.");
        alarme.stopper();
    }
}
