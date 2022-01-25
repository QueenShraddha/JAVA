import java.util.Scanner;
class Commission
{
    float sales;
    float CommissionPercent;
    float CommissionAmount=0;
     
    float calculateCommission()
    {
        CommissionAmount=(sales*CommissionPercent)/100;
        return CommissionAmount;
    }
}

public class DemoCommission
{
    public static void main(String[] args) {
        Commission c1=new Commission();

        System.out.println("Enter Sales Value :");
        Scanner sc = new Scanner(System.in);
        c1.sales = sc.nextFloat();

        System.out.println("Enter Commission Percentage : ");
        c1.CommissionPercent = sc.nextFloat();

        System.out.println("Commission Amount on the given sales : "+c1.calculateCommission());

        if(c1.sales<0 || c1.sales==0)
        {
            System.out.println("Invalid Sales");
        }
        else{
            System.out.println("Mission Accomplished");
        }
        
    }
}
