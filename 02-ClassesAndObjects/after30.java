public class after30 {
    public static void main(String[] args) {
        Counter first = new Counter();
        Counter second = new Counter();

        first.inc10();
        first.inc10();
        for(int i=0;i<3;i++){
            first.inc1();
        }
        System.out.println(first.getCount());

        for(int i=0;i<5;i++){
            second.dec10();
        }
        for(int i=0;i<3;i++){
            second.inc1();
        }
        System.out.println(second.getCount());
    }
}
