import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startNumber, endNumber;

        System.out.print("Digite o número inicial: ");
        startNumber = sc.nextInt();

        System.out.print("Digite o número final: ");
        endNumber = sc.nextInt();

        for (int i = startNumber; i <= endNumber; i ++) {
            System.out.println(i);
        }
    }
}
