import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float n1, n2, n3;

        System.out.print("Enter the first number: ");
        n1 = sc.nextFloat();
        System.out.print("Enter the second number: ");
        n2 = sc.nextFloat();
        System.out.print("Enter the third number: ");
        n3 = sc.nextFloat();

        sc.close();

        float mean = (n1 + n2 + n3) / 3;
        System.out.printf("The mean is: %.2f\n", mean);

    }
}
