public class CompteBancaire {
    Personne titulaire;

    public float getSolde() {
        return solde;
    }

    public boolean retirerArgent(float montant){
        if(montant > 0) {
            this.solde -= montant;
            return true;
        }else{
            return false;
        }
    }

    public boolean deposerArgent(float montant){
        if(montant > 0) {
            this.solde += montant;
            return true;
        }else{
            return false;
        }
    }

    String numero;

    public Personne getTitulaire() {
        return titulaire;
    }

    public String getNumero() {
        return numero;
    }

    float solde;

    public CompteBancaire(Personne titulaire, String numero) {
        this.titulaire = titulaire;
        this.numero = numero;
    }
}
