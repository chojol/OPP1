public abstract class Napoje {
    private String nazwa;

    public Napoje(String nazwa) {
        this.nazwa = nazwa;
    }
    public String getOho() {
        return nazwa;
    }
    public abstract String pij();
}
