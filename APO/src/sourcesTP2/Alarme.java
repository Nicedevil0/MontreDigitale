package sourcesTP2;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Alarme extends Objet implements Runnable{
    private final Affichage vue;
    Clip clip;

    public Alarme(String n, Affichage vue){
        super(n);
        this.vue = vue;
    }

    public void sonner() {
        new Thread(this).start();
    }

    @Override
    public void run() {
        try{
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File("C:/Users/Epulapp/IdeaProjects/APO/src/sourcesTP2/sons/sonnerie.wav")));
            clip.start();
        }catch (Exception exc){exc.printStackTrace();}
        vue.popup();
    }

    public void stopper() {
        clip.stop();
    }
}
