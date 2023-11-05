// Module 2.1. Task 1.

package Module2.TaskSet1;

public class Television {
    private boolean isOn;
    private int channel;

    public Television() {
        this.isOn = false;
        this.channel = 1;
    }

    public boolean isOn() {
        return isOn;
    }

    public void pressOnOff() {
        isOn = !isOn;
    }

    public int getChannel () {
        return channel;
    }

    public void setChannel (int newChannel) {
        if (newChannel > 10) {
            newChannel = 1;
        }
        this.channel = newChannel;
    }
}
