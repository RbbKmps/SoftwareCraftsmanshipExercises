public class TriangleCommand implements Command {
    private final Receiver receiver;

    public TriangleCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.actionTriangle();
    }
}