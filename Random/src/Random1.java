import java.util.ArrayList;
public class Random1 {
    public static void main(String[] args) {
        ArrayList<String>colors = new ArrayList<String>();
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Purple");
        colors.add("orange");
        colors.set(3, "Black");
        System.out.println(colors.size());
    }
}
