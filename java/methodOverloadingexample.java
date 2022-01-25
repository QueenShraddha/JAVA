public class methodOverloadingexample {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(7, 5);
        calcFeetAndInchesToCentimeters(5);
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if( feet >= 0 && (inches >= 0 || inches <=12 )) {
            double centimeters = (feet*12)*2.54;
            centimeters += inches*2.54;
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
            return centimeters;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches <=12) {
            double centimeters = inches*2.54;
            System.out.println(inches + " inches = " + centimeters + " cm");
            return centimeters;
        } else {
            return -1;
        }
    }


    

}
