package turtle;

import java.util.Scanner;

public class EsercizioPoligoni extends TurtleScreen {

    int N, K; // variabili globali

    public EsercizioPoligoni(int N, int K) {
        super(800, 600);
        this.N = N;
        this.K = K;
    }

    @Override
    public void setup() {
        noLoop();
        disegnaPoligoni(N, K);
    }

    public void disegnaPoligoni(int n, int k) {
        // TurtleScreen screen = getInstance();
        Turtle t = new Turtle(this);

        t.speed(1);
        t.setPenSize(1);
        t.penDown();
        t.setPosition(0, 0);

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                t.forward(100); // lato più piccolo
                t.left(360.0 / n);
            }
            t.left(360.0 / k); // ruota per il prossimo poligono
        }
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
        if (K >= 100) {
            System.out.println("mi sembra un po' troppo");
            return;
        }

        EsercizioPoligoni disegno = new EsercizioPoligoni(N, K);
        disegno.run();
    }
}