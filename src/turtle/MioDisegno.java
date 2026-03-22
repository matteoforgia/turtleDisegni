package turtle;

public class MioDisegno extends TurtleScreen {

    private Turtle t;
    private double dx = 0;
    private double dy = 0;
    private double posX = 0;
    private double posY = 0;

    public MioDisegno() {
        super(800, 600);
    }

    @Override
    public void setup() {
        t = createTurtle();
        t.speed(1);
        t.setPenSize(3);
        posX = 0;
        posY = 0;
    }

    private void handleInput() {
        String key = getLastKey();
        if (key == null) return;

        switch (key) {
            case "w": dy = 1; break;
            case "s": dy = -1; break;
            case "a": dx = -1; break;
            case "d": dx = 1; break;
            case "r":
                posX = 0;
                posY = 0;
                dx = 0;
                dy = 0;
                break;
        }
    }

    private void updatePosition() {
        posX += dx * 5;
        posY += dy * 5;
        t.setPosition(posX, posY);
    }

    @Override
    public void loop() {
        handleInput();
        updatePosition();
    }

    public static void main(String[] args) {
        MioDisegno disegno = new MioDisegno();
        disegno.run();
    }
}