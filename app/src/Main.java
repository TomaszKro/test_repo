import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!!");
        while (true) {
            System.out.println("Podaj liczbę do policzenia pierwiastka");
            Scanner scanner = new Scanner(System.in);
            int liczba = scanner.nextInt();
            System.out.println(Math.sqrt((double) liczba));
        }
    }
}
