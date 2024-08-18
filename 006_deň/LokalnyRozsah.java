public class LokalnyRozsah {
    public void ukazMetodu() {
        int lokVar = 5; // Lokálna premenná
        System.out.println("Hodnota lokVar: " + lokVar);
    }

    public static void main(String[] args) {
        LokalnyRozsah obj = new LokalnyRozsah();
        obj.ukazMetodu();
        // System.out.println(lokVar); // Chyba: lokVar nie je viditeľná mimo ukazMetodu()
    }
}
