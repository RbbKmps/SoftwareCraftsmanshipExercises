public class GameController {

    private Command crossButton;
    private Command triangleButton;
    private Command squareButton;
    private Command circleButton;

    public void setCrossButton(Command command) {
        this.crossButton = command;
    }

    public void setTriangleButton(Command command) {
        this.triangleButton = command;
    }

    public void setSquareButton(Command command) {
        this.squareButton = command;
    }

    public void setCircleButton(Command command) {
        this.circleButton = command;
    }

    public void pressCross() {
        crossButton.execute();
    }

    public void pressTriangle() {
        triangleButton.execute();
    }

    public void pressSquare() {
        squareButton.execute();
    }

    public void pressCircle() {
        circleButton.execute();
    }
}