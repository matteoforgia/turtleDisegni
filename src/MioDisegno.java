


import java.awt.Color;

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
        // Disegna usando la tua tartaruga "t"
    }
    // Il main sarà sempre uguale
    public static void main(String[] args) {
        MioDisegno disegno = new MioDisegno();
        disegno.run();
    }
}