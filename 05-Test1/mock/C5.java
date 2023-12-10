public class C5 {
    private int x;
    private int y;
    public C5(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public boolean isX(){
        if(y!=0){
            return false;
        }
        return true;
    }
    public boolean isY(){
        if (x!=0) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "P(" + x + "," + y + ")";
    }

    public static void main(String[] args) {
        C5 o = new C5(3,0);
        System.out.println(o.isX());  //true
        System.out.println(o.isY());  //false	
        System.out.println(o.toString()); //P(3,0) 
    }
}
