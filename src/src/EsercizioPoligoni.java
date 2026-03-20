package src;

import java.util.Scanner;

import src.Turtle;
import src.TurtleScreen;

public class EsercizioPoligoni extends TurtleScreen{
    public EsercizioPoligoni() {
        super(800, 600); // Dimensioni finestra
    }
    @Override
    public void setup() {
        noLoop();
    }
    public static void disegnaPoligoni(int N, int K) {
        Turtle t = createTurtle();
        t.speed(1);
        t.setPenSize(2);
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < N; j++) {
                t.forward(100); // Avanza di 100 pixel
                t.left(360.0 / N); // Ruota a sinistra di un angolo basato sul numero di lati
            }
            t.left(360.0 / K); // Ruota a sinistra per posizionare il prossimo poligono
        }
        t.hideTurtle(); // Nasconde la tartaruga alla fine
    }
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
        disegnaPoligoni(N, K);

    }
}
