public class minToYearAndDays {
    public static void printYearsAndDays(long minutes) {
        if(minutes<0) {
            System.out.println("Invalid Value");
        } 
        int year =(int) minutes/(24*365*60);
        int remainingMinutes = (int) minutes%(24*365*60);
        int days = remainingMinutes/(24*60);
        System.out.println(minutes + " min = " + year + "y and " + days + " d");
    }
}
