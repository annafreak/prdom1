import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Zadanie 1
        System.out.print("Zadanie 1: Podaj liczbę zmiennoprzecinkową: ");
        double liczbaZmiennoprzecinkowa = scanner.nextDouble();
        int liczbaCalkowita = (int) Math.floor(liczbaZmiennoprzecinkowa);
        System.out.println("Zaokrąglona liczba całkowita: " + liczbaCalkowita);

        // Zadanie 2
        System.out.print("Zadanie 2: Podaj tekst, który ma być konwertowany na double: ");
        String tekst = scanner.next();
        double liczbaDouble = Double.parseDouble(tekst);
        double kwadrat = Math.pow(liczbaDouble, 2);
        System.out.println("Kwadrat liczby: " + kwadrat);

        // Zadanie 3: Obliczenia dla przykładowych liczb 12 i 5
        int a = 12, b = 5;
        System.out.println("Zadanie 3: Suma: " + (a + b));
        System.out.println("Różnica: " + (a - b));
        System.out.println("Iloczyn: " + (a * b));
        System.out.println("Iloraz: " + (a / b));
        System.out.println("Reszta z dzielenia: " + (a % b));

        // Zadanie 4: Obliczenie reszty z dzielenia
        System.out.print("Zadanie 4: Podaj pierwszą liczbę: ");
        int pierwszaLiczba = scanner.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int drugaLiczba = scanner.nextInt();
        int reszta = pierwszaLiczba % drugaLiczba;
        System.out.println("Reszta z dzielenia: " + reszta);

        // Zadanie 5
        System.out.print("Zadanie 5: Podaj liczbę do sprawdzenia parzystości i wartości: ");
        int liczbaDoSprawdzenia = scanner.nextInt();
        if (liczbaDoSprawdzenia % 2 == 0 && liczbaDoSprawdzenia > 10) {
            System.out.println("Liczba jest parzysta i większa niż 10.");
        } else {
            System.out.println("Liczba nie spełnia warunków.");
        }

        // Zadanie 6
        System.out.print("Zadanie 6: Podaj liczbę do sprawdzenia zakresu: ");
        int liczbaZakres = scanner.nextInt();
        if (liczbaZakres < 5 || liczbaZakres > 15) {
            System.out.println("Liczba jest mniejsza niż 5 lub większa niż 15.");
        } else {
            System.out.println("Liczba jest w zakresie 5-15.");
        }

        scanner.close();
    }
}
