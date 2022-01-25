public class StudentData{
    int id;     
    String name;
    int age;
    String gender;
    
    StudentData(){
        id=234;
        name="Shraddha";
        age=19;
        gender="Female";
    }
    
    StudentData(int a, String b, int c, String d){
        id = a;
        name = b;
        age = c;
        gender = d;
    }
    void display(){System.out.println(id+" "+name+" "+gender+" "+age);}
    
    
    public static void main(String args[]) {
        StudentData s1 = new StudentData();
        StudentData s2 = new StudentData(201,"Aaradhya",19,"Male");
        s1.display();
        s2.display();
    }
    
    }
