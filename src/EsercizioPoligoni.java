import java.util.Scanner;
import turtle.TurtleScreen;

public class EsercizioPoligoni extends TurtleScreen{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("dammi un numero di lati compreso tra 3 e 12");
        int N = in.nextInt();
        if (N < 3 || N > 12) {
            System.out.println("Numero non valido. Riprova.");
            return;
        }
        System.out.println("dimmi quanti poligoni stampare, possibilmente minore di 100");
        int K = in.nextInt();
        if (K>=100) {
            System.out.println("mi sembra un po' troppo");
            return;
        }
        EsercizioPoligoni a = new EsercizioPoligoni();
        a.run();
    }
}
