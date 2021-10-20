package sourcesTP2;

public class ChaineDeCompteurs
{
    int nbDeCompteurs;
    Compteur[] compteurs;

    ChaineDeCompteurs(int[] valeurs, int[] min, int[] max, int[] pas)
    {
        nbDeCompteurs = valeurs.length;
        compteurs = new Compteur[nbDeCompteurs];
        
        for (int i = 0; i < nbDeCompteurs; i++)
        {
            compteurs[i] = new Compteur(valeurs[i], min[i], max[i], pas[i]);
        }
    }

    public void reinitialiserTousLesCompteursMax()
    {
        for (Compteur c : compteurs)
            c.reinitialiserValMax();
    }

    public void reinitialiserTousLesCompteursMin()
    {
        for (Compteur c : compteurs)
            c.reinitialiserValMin();
    }

    public void incrementer()
    {
        int i = 0;
        int avantIncrement = compteurs[i].getValeur();
        while (i < nbDeCompteurs)
        {
            compteurs[i].incrementer();

            //si le compteur s'est réinitialisé
            if(compteurs[i].getValeur() != avantIncrement + compteurs[i].getPas()){
                i += 1;
                if(i == nbDeCompteurs){
                    this.reinitialiserTousLesCompteursMin();
                    return;
                }
                avantIncrement = compteurs[i].getValeur();
            } else {
                return;
            }
        }
    }

    public void decrementer()
    {
        int i = 0;
        int avantDecrement = compteurs[i].getValeur();
        while (i < nbDeCompteurs)
        {
            compteurs[i].decrementer();

            //si le compteur s'est réinitialisé
            if(compteurs[i].getValeur() != avantDecrement - compteurs[i].getPas()){
                i += 1;
                if(i == nbDeCompteurs){
                    this.reinitialiserTousLesCompteursMax();
                    return;
                }
                avantDecrement = compteurs[i].getValeur();
            } else {
                return;
            }
        }
    }

    public Compteur[] getCompteurs()
    {
        return compteurs;
    }
}