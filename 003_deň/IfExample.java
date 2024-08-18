import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {
        int number = 9;
        Scanner sc = new Scanner(System.in);
        System.out.println("Aplikace zjistí, zda číslo je větší rovno nebo menší než pět. Číslem 0 ukončíte program.");
        while (number != 0) {
            System.out.println("zadejte cislo:");
            number = sc.nextInt();
            if (number > 5) {
                System.out.println("Číslo "+number+" je väčšie ako 5.");
            } else if (number == 5) {
                System.out.println("Číslo je pět");
            } else System.out.println("Číslo "+number+" je menší než pět");
        }
    }
}
