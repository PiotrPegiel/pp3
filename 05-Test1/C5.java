public class C5 {
    public static String m(String t){
        String result = "";
        if (t.length()<=2) {
            return t;
        } else {
            for(int i=0; i<t.length();i+=2){
                if(t.length()-i>=2){
                    result += t.substring(i, i+2);
                } else {
                    result += t.substring(i, i+1);
                }
                if(t.length()-i>2){
                    result+="+";
                }
            }
            return result;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(C5.m("computer")); //co+mp+ut+er
        System.out.println(C5.m("water")); //wa+te+r
        System.out.println(C5.m("ok")); //ok
        System.out.println(C5.m("f")); //f
        System.out.println(C5.m("oko")); //ok+o
    }
}
