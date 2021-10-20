package sourcesTP2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Reveil extends Montre
{
    private boolean estActif;
    private Horaire heureDeclenchage;
    private Affichage vue;

    public void addDeclenchables(Declenchable declenchable) {
        this.declenchables.add(declenchable);
    }

    public void removeDeclenchables(Declenchable declenchable) {
        this.declenchables.remove(declenchable);
    }

    private final List<Declenchable> declenchables = new ArrayList<>();

    public Reveil()
    {
        super();
        this.estActif = false;
    }

    public Reveil(Horaire heureDeclenchage)
    {
        super();
        this.heureDeclenchage = heureDeclenchage;
        this.estActif = true;
    }

    @Override
    public void incrementer() {
        super.incrementer();
        vue.update();
        if (estActif && heureDeclenchage.compareTo(this.getHoraire()) == 0) {
            declencher();
            this.desactiver();
        }
    }

    public void activer()
    {
        estActif = true;
    }

    public void setHeureDeclenchage(Horaire h){
        this.heureDeclenchage = h;
    }

    public void desactiver()
    {
        if (this.estActif)
        {
            this.estActif = false;
        }
    }

    public void declencher()
    {
        System.out.println("IL EST " + super.toString() + ", déclenchement des opérations suivantes :");
        for (Declenchable d : this.declenchables){
            d.declencher();
        }
    }

    public void pause(int secondes){
        this.arreter();
        this.setHeureDeclenchage(new Horaire(this.getHoraire().getHeures(),this.getHoraire().getMinutes(),this.getHoraire().getSecondes()+secondes));
        this.activer();
    }

    public void arreter(){
        for (Declenchable d : this.declenchables){
            if(d instanceof Arretable){
                ((Arretable)d).arreter();
            }
        }
    }

    public void addVue(Affichage vue) {
        this.vue = vue;
    }
}
