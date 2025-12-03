public class CircleCommand implements Command {
    private final Receiver receiver;

    public CircleCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.actionCircle();
    }
}