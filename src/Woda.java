public class Woda extends Napoje{
    String gaz;
    public Woda(String nazwa, String gaz){
        super(nazwa);
        this.gaz = gaz;
    }
    @Override
    public String pij() {
        return "pije wode";
    }
}
