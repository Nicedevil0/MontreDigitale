public class Personne {
    String nom;

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    String prenom;

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    String adresse;

    public Personne(String nom, String prenom){
        this(nom, prenom, "");
    }

    public Personne(String nom, String prenom, String adresse){
        this.adresse = adresse;
        this.nom = nom;
        this.prenom = prenom;
    }

}
