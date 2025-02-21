public class NarrowingCasting {
    public static void main(String[] args) {
        double doubleValue = 9.8;
        int value = (int) doubleValue;

        System.out.printf("The double value is: %f\n", doubleValue);
        System.out.printf("The int value is: %d\n", value);
    }
}
