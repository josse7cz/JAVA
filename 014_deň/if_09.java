import java.util.Scanner;
public class if_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zadajte heslo: ");
        String zadaneHeslo = scanner.nextLine();
        String spravneHeslo = "tajneHeslo";

        if (zadaneHeslo.isEmpty()) {
            System.out.println("Heslo nemôže byť prázdne.");
        } else {
            if (zadaneHeslo.equals(spravneHeslo)) {
                System.out.println("Heslo je správne.");
            } 
            else {
                System.out.println("Heslo je nesprávne.");
            }
        }
    } 
}
