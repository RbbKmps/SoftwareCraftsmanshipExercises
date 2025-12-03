public class CrossCommand implements Command {
    private final Receiver receiver;

    public CrossCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.actionCross();
    }
}