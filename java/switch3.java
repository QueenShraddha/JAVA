public class switch3 {
    public static void main(String[] args) {
        String month = "JAnuaRY";
        switch (month.toLowerCase()) {
            case "january":
               System.out.println("Jan");
               break;
            case "june":
               System.out.println("Jun");
               break;
            default:
               System.out.println("Not sure");
               break;
        }
    }
}
