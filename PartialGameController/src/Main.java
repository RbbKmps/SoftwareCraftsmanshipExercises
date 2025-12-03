public class Main {

    public static void main(String[] args) {

        Receiver receiver = new Receiver();
        GameController controller = new GameController();

        controller.setCrossButton(new CrossCommand(receiver));
        controller.setTriangleButton(new TriangleCommand(receiver));
        controller.setSquareButton(new SquareCommand(receiver));
        controller.setCircleButton(new CircleCommand(receiver));

        System.out.println("Before change");
        controller.pressCross();
        controller.pressTriangle();
        controller.pressSquare();
        controller.pressCircle();

        controller.setCrossButton(new CircleCommand(receiver));

        System.out.println("\nAfter change");
        controller.pressCross();
    }
}