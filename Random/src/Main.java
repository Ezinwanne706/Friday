import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String>Accessories = new ArrayList<String>();
        Accessories.add("Fendi");
        Accessories.add("Gucci");
        Accessories.add("Polo");
        Accessories.add("Versace");
        Accessories.add("Nike");
        Accessories.set(3, "Adidas");
        System.out.println(Accessories);
    }
}