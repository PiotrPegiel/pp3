public class Counter {
    private int count=0;

    public int getCount() {
        return count;
    }

    public void inc1(){
        count++;
    }
    public void inc10(){
        count+=10;
    }
    public void dec1(){
        count--;
    }
    public void dec10(){
        count-=10;
    }
    public void reset(){
        count=0;
    }
}
