public class C2 {
    private int id;

    public C2(int id) {
        this.id = id;
    }
    
    public boolean ok(){
        if(id>=1000){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        if(id<10){
            return "000"+id;
        }
        if(id<100){
            return "00"+id;
        } else if(id<1000){
            return "0"+id;
        } else {
            return ""+id;
        }
    }

    public static void main(String[] args) {
        C2 o = new C2(23);
        System.out.println(o.ok());
        System.out.println(o.toString());

        C2 o2 = new C2(234567);
        System.out.println(o2.ok());
        System.out.println(o2.toString());

        C2 o3 = new C2(3);
        System.out.println(o3.ok());
        System.out.println(o3.toString());
    }
}
