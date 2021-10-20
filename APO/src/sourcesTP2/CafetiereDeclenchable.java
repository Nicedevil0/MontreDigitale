package sourcesTP2;

public class CafetiereDeclenchable extends Declenchable{

    private final Cafetiere cafetiere;

    public CafetiereDeclenchable(Cafetiere a){
        this.cafetiere = a;
    }

    @Override
    public void declencher() {
        System.out.println("    - La cafetière \"" + this.cafetiere.toString() + "\" lance la production de café.");
    }
}
