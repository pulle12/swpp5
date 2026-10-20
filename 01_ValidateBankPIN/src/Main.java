import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int systemPin = 5723;
        Scanner scanner = new Scanner(System.in);
        int enteredPin;
        int tries = 0;
        System.out.println("Geben Sie Ihren Pin ein");
        do {
            if(tries>0) {
                System.out.println("FALSCH!");
                System.out.println("Erneut PIN eingeben");
            }
            enteredPin = Integer.parseInt(scanner.nextLine());
            tries++;
        } while (enteredPin != systemPin);
        System.out.println("Sie haben den richtigen PIN eingegeben und jetzt Zugriff auf Ihren Account.");
    }
}