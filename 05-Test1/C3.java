public class C3 {
    private int count = 0;

    public void increase(){
        count++;
    }
    public void decrease(){
        count--;
    }
    
    public void increase(int n){
        if(!(n<0)){
            count+=n;
        }
    }
    public void decrease(int n){
        if(!(n<0)){
            count-=n;
        }
    }

    public int value(){
        return count;
    }

    public void cancel(){
        count=0;
    }


    public static void main(String[] args) {
        C3 c = new C3();
        System.out.println(c.value()); //0
        c.increase();
        c.increase();
        c.decrease();
        c.increase(5);
        c.increase(-3);
        c.decrease(2);
        System.out.println(c.value()); //4
        c.cancel();
        System.out.println(c.value()); //0
    }
}
