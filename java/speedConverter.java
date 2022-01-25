public class speedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            return -1;
        }
        long MilesPerHour = Math.round(kilometersPerHour / 1.609);
        return MilesPerHour;
        }
    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0){
            System.out.println("invalid value");
        } 
        else {
            long MilesPerHour = Math.round(kilometersPerHour /1.609);
            System.out.println(kilometersPerHour+ "km/h = "+ MilesPerHour+ "mi/h");
        
        }
    }
}
