public class C3 {

    public static boolean isAlphabet(String t){
        for(int i =0;i<t.length()-1;i++){
            if (t.charAt(i+1)<t.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static String hideText(String t){
        if (t.length()<=2) {
            return t;
        } else {
            String string = "";
            string+=t.charAt(0);
            for(int i=0;i<t.length()-2;i++){
                string+='*';
            }
            string+=t.charAt(t.length()-1);
            return string;
        }
    }

    public static void main(String[] args) {
        System.out.println(C3.isAlphabet("abegsw"));
        System.out.println(C3.isAlphabet("abcmhsw"));
        System.out.println(C3.isAlphabet("a"));
        System.out.println(C3.isAlphabet("aa"));
        System.out.println(C3.isAlphabet("ba"));

        System.out.println(C3.hideText("apple"));
        System.out.println(C3.hideText("ok"));
        System.out.println(C3.hideText("o"));
        System.out.println(C3.hideText("oke"));
        System.out.println(C3.hideText("okkkkkkkkkko"));
    }
}
