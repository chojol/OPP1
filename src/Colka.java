public class Colka extends Napoje{
    String smaki;

    public Colka(String nazwa, String smaki){
        super(nazwa);
        this.smaki = smaki;
    }
    @Override
    public String pij() {
        return "pije colke";
    }
}
