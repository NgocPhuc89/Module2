package CodeGym.Array;

public class AscendingSeries {
    public static void main(String[] args) {
        String p = "";
        String str = "Welcom";
        char min = str.charAt(0) ;
//        for (int i = 0; i < str.length() - 1; i++) {
//            if ( str.charAt(i) < min )
//                min = str.charAt(i);
//        }
        p += min ;
        for (int i = 0; i < str.length() ; i++) {
            if ( p.charAt(p.length() - 1) < str.charAt(i))
                p += str.charAt(i);
        }
        System.out.println(p);
    }
}
