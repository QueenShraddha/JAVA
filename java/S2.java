public class S2 {
    void rohit(S2 obj) {
        System.out.println("method is invoked");
    }
    void p(){
        rohit(this);
    }
    public static void main(String[] args) {
        S2 a = new S2();
        a.p();
    }
}
