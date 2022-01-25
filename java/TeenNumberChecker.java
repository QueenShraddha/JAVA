public class TeenNumberChecker {
    public static boolean hasTeen(int a, int b, int c) {
        if((a | b | c) >= 13 & (a | b | c)<=19) {
            return true;
        }
        return false;
    }
    public static boolean isTeen(int d) {
        if(d>=13 & d<=19){
        return true;
    }
    return false;
}
}

