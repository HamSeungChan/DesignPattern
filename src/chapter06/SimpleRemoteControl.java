package chapter06;

public class SimpleRemoteControl {

    Command slot;

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonPressed() {
        slot.execute();
    }
}
