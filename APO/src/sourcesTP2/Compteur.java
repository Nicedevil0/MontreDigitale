package sourcesTP2;

public class Compteur
{
    int valeur, min, max, pas;

    public Compteur(int valeur, int min, int max, int pas)
    {
        this.valeur = valeur;
        this.min = min;
        this.max = max;
        this.pas = pas;
    }

    public void reinitialiserValMin()
    {
        valeur = min;
    }

    public void reinitialiserValMax()
    {
        valeur = max;
    }

    public void incrementer()
    {
        valeur += pas;
        while (valeur >= max) valeur = min + (valeur - max);
    }

    public void decrementer()
    {
        valeur -= pas;
        while (valeur < min) valeur = max + valeur;
    }

//#region accesseurs

    public int getValeur()
    {
        return this.valeur;
    }

    public void setValeur(int valeur)
    {
        this.valeur = valeur;
    }

    public int getInf()
    {
        return this.min;
    }

    public void setInf(int inf)
    {
        this.min = inf;
    }

    public int getSup()
    {
        return this.max;
    }

    public void setSup(int sup)
    {
        this.max = sup;
    }

    public int getPas()
    {
        return this.pas;
    }

    public void setPas(int pas)
    {
        this.pas = pas;
    }

//#endregion
}