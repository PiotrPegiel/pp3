public class C2 {
    private int counter = 0;
    
    public void increase(){
        counter++;
    }
    public void increase(int n){
        counter+=n;
    }

    public void decrease(){
        counter--;
    }
    public void decrease(int n){
        counter-=n;
    }

    public int value(){
        return counter;
    }

    public static void main(String[] args) {
        C2 o = new C2();
        System.out.println(o.value());
        o.increase();
        o.increase();
        o.decrease();
        o.increase(5);
        o.decrease(2);
        System.out.println(o.value());
    }
}