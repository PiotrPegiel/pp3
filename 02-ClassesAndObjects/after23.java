public class after23 {
    public static void main(String[] args) {
        short vehicle_speed = 158;
        boolean is_speed_valid = false;
        if (vehicle_speed<40 & vehicle_speed<140) {
            is_speed_valid = true;
        }
        System.out.println("Vehicle speed: "+vehicle_speed);
        System.out.println("Speed is valid: "+is_speed_valid);
    }
}
