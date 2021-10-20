package sourcesTP2;

public class Main 
{
    public static void main( String[] args )
    {
        Reveil r = new Reveil(new Horaire(0, 0, 10));
        Affichage vue = new Affichage(r);
        r.addVue(vue);
        r.addDeclenchables(new AlarmeDecArr(new Alarme("Ding dong",vue)));
        r.addDeclenchables(new RadioDecArr(new Radio("VIRGIN Radio")));
        r.addDeclenchables(new CafetiereDeclenchable(new Cafetiere("Senseo")));

        r.run();
    }
}
