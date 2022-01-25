public class A {
    A(){
        System.out.println("Hello a");
    }
    A(int x){
        this();
        System.out.println("x");
    }
}
