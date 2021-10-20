package sourcesTP2;

public class Objet {
    protected String nom;

    public Objet(String n) {
        this.nom = n;
    }

    @Override
    public String toString() {
        return this.nom;
    }
}
