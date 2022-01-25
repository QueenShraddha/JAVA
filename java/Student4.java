public class Student4 {
    int id;
    String name;

    Student4(int i, String n){
        id = i;
        name = n;
    }

    void rohit(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        Student4 s1 = new Student4(234, "Shraddha");
        Student4 s2 = new Student4(214, "Rohit");
        s1.rohit();
        s2.rohit();
    }
}