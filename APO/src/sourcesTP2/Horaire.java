package sourcesTP2;

public class Horaire implements Comparable
{
    private final int heures;
    private final int minutes;

    public int getHeures() {
        return heures;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSecondes() {
        return secondes;
    }

    private final int secondes;

    public Horaire(int h, int m, int s){
        this.heures = h%24 + m/60;
        this.minutes = m%60 + s/60;
        this.secondes = s%60;
    }

    public Horaire(int h, int m){
        this.heures = h%24 + m/60;
        this.minutes = m%60;
        this.secondes = 0;
    }

	@Override
	public int compareTo(Object o) {
		return this.heures*3600+this.minutes*60+this.secondes - (((Horaire)o).heures*3600+((Horaire)o).minutes*60+((Horaire)o).secondes);
	}

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", heures, minutes, secondes);
    }
}