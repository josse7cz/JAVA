public class Premenne {
    public static void main(String[] args) {
        // Deklarácia a inicializácia celého čísla
        int vek = 42;

        // Deklarácia a inicializácia desatinného čísla
        double hmotnost = 100.2;
        
        // Deklarácia a inicializácia reťazca
        String meno = "Marián";

        // Deklarácia a inicializácia booleanovej hodnoty
        boolean JeProgramator = true;

        // Vypísanie hodnôt premenných
        System.out.println("Meno: " + meno);
        System.out.println("Vek: " + vek);
        System.out.println("Hmotnosť: " + hmotnost);
        System.out.println("Som Programátor : " + JeProgramator);

        // Zmena hodnoty premennej
        vek = 43;
        System.out.println("Aktualizovaný vek: " + vek);
    }
}
