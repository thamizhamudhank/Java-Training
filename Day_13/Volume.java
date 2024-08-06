package New_13;

public class Volume {
    public static void main(String[] args) {
        prismVolume prismVolume = new prismVolume();
        prismVolume.setBase(20);
        prismVolume.setHeight(20);
        prismVolume.setLength(30);

        double b=prismVolume.base;
        double h= prismVolume.height;
        double v = prismVolume.base * prismVolume.height;
        System.out.println(v);
    }
}
