import java.util.Scanner;
 class Number{
    String phno;
     int val,val1;
     void checknumber(String phno){
         String no=phno.substring(0,3);
          val=Integer.parseInt(no);
         if (phno.length()==10){
             if (val == 706) {
                 System.out.println("Georgia phone number ");
                 System.out.println("(706)" + phno.substring(3, 6) + "-" + phno.substring(6, 10));
             } else if (val == 423) {
                 System.out.println("Tenesee Phone number");
                 System.out.println("(423)" + phno.substring(3, 6) + "-" + phno.substring(6, 10));
             } else {
                 System.out.println("Enter proper code");
             }
       }else {

             System.out.println("Enter valid Input");
         }
     }
}
public class PrintPhoneNumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the phone Number:");
       Number n1=new Number();
       n1.phno=sc.next();
       n1.checknumber(n1.phno);
    }
}