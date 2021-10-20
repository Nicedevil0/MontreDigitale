package sourcesTP2;

public class RadioDecArr extends Arretable{

    private final Radio radio;

    public RadioDecArr(Radio a){
        this.radio = a;
    }

    @Override
    public void declencher() {
        System.out.println("    - La radio \"" + this.radio.toString() + "\" s'allume.");
    }

    @Override
    public void arreter() {
        System.out.println("    - La radio \"" + this.radio.toString() + "\" s'éteint.");
    }
}
