package EqualSumChecker;

public class Test {
    public static void main(String[] args) {


            if (hasEqualsSum(1, 1, 1))
                System.out.println("TRUE");
            else System.out.println("FALSE");

            if (hasEqualsSum(1, 1, 2))
                System.out.println("TRUE");
            else System.out.println("FALSE");

            if (hasEqualsSum(1, -1, 0))
                System.out.println("TRUE");
            else System.out.println("FALSE");



    }

    public static boolean hasEqualsSum(int param1, int param2, int param3)  {
        return ((param1 + param2) == param3) ? true : false;
    }
}
