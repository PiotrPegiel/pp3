public class after22 {
    public static void main(String[] args) {
        float height = 169f;
        final float inch_in_cm = 2.54f;
        float height_in_inches = height/inch_in_cm;
        final float feet_in_inch = 12;

        System.out.println("I'm "+(int)height+"cm tall, i.e. "+(int)(height_in_inches/feet_in_inch)+" feet and "+(height_in_inches - (feet_in_inch*(int)(height_in_inches/feet_in_inch)))+" inches");
    }
}
