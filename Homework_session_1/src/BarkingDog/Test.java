package BarkingDog;

public class Test {
    public static void main(String[] args) {
        if(bark(true, 1)) {
            System.out.println("Wake up!");
        }

        if(bark(false, 2)) {
            System.out.println("Wake up!");
        }

        if(bark(true, 8)) {
            System.out.println("Wake up!");
        }

        if(bark(true, -1)) {
            System.out.println("Wake up!");
        }
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        if(hourOfDay < 0 || hourOfDay > 23) {
            System.out.println("Hour of day can take values from 0 to 23.");
            return false;
        }

        return ((barking && hourOfDay < 8) || (barking && hourOfDay > 22)) ? true : false;
    }
}
