package sourcesTP2;
import java.util.concurrent.TimeUnit;

public class Montre extends ChaineDeCompteurs implements Runnable
{
    protected boolean estDemarree = false;

    public Montre()
    {
        super(new int[]{0,0,0}, new int[]{0,0,0}, new int[]{60,60,24}, new int[]{1,1,1}); //sec, min, H, pas de 1
    }

    @Override
    public void run(){
        estDemarree = true;
        while(estDemarree){
            try{
                TimeUnit.MILLISECONDS.sleep(1000);
            }catch(Exception e){
                System.out.println("Il y a eu un problème dans la montre...");
            }
            this.incrementer();
            System.out.println("Heure actuelle : " + this.toString());
        }
    }
    
    public void arreter()
    {
        estDemarree = false;
    }

    public Horaire getHoraire(){
        return new Horaire(this.getCompteurs()[2].getValeur(), this.getCompteurs()[1].getValeur(), this.getCompteurs()[0].getValeur());
    }

    public String toString()
    {
        int heure = this.getCompteurs()[2].getValeur();
        int minute = this.getCompteurs()[1].getValeur();
        int seconde = this.getCompteurs()[0].getValeur();    

        return String.format("%02d:%02d:%02d", heure, minute, seconde);
    }

    public void setEstDemarree(boolean estDemarree)
    {
        this.estDemarree = estDemarree;
    }
}
