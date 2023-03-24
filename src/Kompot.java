public class Kompot extends Napoje{
    String owoc;

    public Kompot(String nazwa, String owoc){
        super(nazwa);
        this.owoc = owoc;
    }
    @Override
    public String pij() {
        return "pije kompot";
    }
}