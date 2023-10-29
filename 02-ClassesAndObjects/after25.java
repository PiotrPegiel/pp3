public class after25 {
    public static void main(String[] args) {
        byte hours = 14;
        final byte min_in_hour = 60;
        final byte sec_in_min = 60;
        byte minutes = 27;
        String time = hours + ":" + minutes;
        System.out.println("minutes from midnight: "+(hours*min_in_hour+minutes));
        System.out.println("seconds from midnight: "+((hours*min_in_hour+minutes)*sec_in_min));
    }
}
