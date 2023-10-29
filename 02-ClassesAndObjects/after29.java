public class after29 {
    public static void main(String[] args) {
        Rectangle a = new Rectangle();
        Rectangle b = new Rectangle();

        a.setX(3);
        a.setY(4);

        b.setX(2);
        b.setY(7);

        a.displayDimensions();
        System.out.println(a.perimeter());
        System.out.println(a.surfaceArea());

        b.displayDimensions();
        System.out.println(b.perimeter());
        System.out.println(b.surfaceArea());
    }
}
