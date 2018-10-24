package MinutesToYearsAndDaysCalculator;

public class Test {
    public static void main(String[] args) {
        printYearsAndDays(525600); //should print "525600 min = 1 y and 0 d"
        printYearsAndDays(1051200); //should print "1051200 min = 2 y and 0 d"
        printYearsAndDays(561600); //should print "561600 min = 1 y and 25 d"
    }

    public static void printYearsAndDays(int minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            //1 year = 525 600 minutes
            int year = minutes / 525_600;
            int day = (minutes % 525_600) / 1440;

            System.out.println(minutes + " min = " + year + " y and " + day + " d");
        }

    }
}
