import java.util.Scanner;

public class Phrases {

    private static final String STOP_SIGNAL = "pare";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase;

        do {
            System.out.print("Digite sua frase (PARE para sair): ");
            phrase = sc.nextLine().trim();
            if (phrase.equalsIgnoreCase(STOP_SIGNAL)) {
                break;
            }
            System.out.println("Você digitou: " + phrase);
        } while (true);

        sc.close();
        System.out.println("Até mais!");
    }
}
