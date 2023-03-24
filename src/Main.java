import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static ArrayList <Napoje> napoj = new ArrayList<>();
    public static String napis = "wock";
    public static void  main(String[] args){
        pij();
        sortowanieNazwa();

        napoj.add(new Colka("colka zero",""));
        napoj.add(new Kompot("kompot wisniowy","wisnia"));
        napoj.add(new Woda("zywiec","mocny"));
    }


    private static void pij() {
        for (Napoje napoje : napoj){
            System.out.println(napoje.pij());
        }
    }
    private static void sortowanieNazwa(){
        napoj.sort(new Comparator<Napoje>() {
            @Override
            public int compare(Napoje o1, Napoje o2) {
                return 0;
            }
        });
        for (Napoje napoje : napoj){
            System.out.println(napoje.getOho());
        }
    }
}