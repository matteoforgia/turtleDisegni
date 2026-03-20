package src;

import turtle.Turtle;
import turtle.TurtleScreen;

public class MioDisegno extends TurtleScreen {
    private Turtle t;
    public MioDisegno() {
    super(800, 600); // Dimensioni finestra
    }
    @Override
    public void setup() {
        noLoop();
        t = createTurtle();
        t.speed(1);
        t.setPenSize(3);
    }
        
    // Il main sarà sempre uguale
    public static void main(String[] args) {
        MioDisegno disegno = new MioDisegno();
        disegno.run();
    }
}