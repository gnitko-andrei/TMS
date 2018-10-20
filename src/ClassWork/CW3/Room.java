package ClassWork.CW3;

public class Room {
    int dors;
    int windows;
    boolean lightOn;
    boolean isAnybodyIn = false;
    boolean isDoreOpen = false;
    int doerOpenCounter = 0;
    int windowOpenCounter = 0;
    int peopleCounter = 0;
    static int ROOMCOUNTER = 0;

    public Room() {
        this.lightOn = false;
        this.dors = 1;
        this.windows = 2;
        ++ROOMCOUNTER;
    }

    public Room(boolean lightOn) {
        lightOn = this.lightOn;
        this.dors = 1;
        this.windows = 2;
        ROOMCOUNTER++;
    }

    public Room(boolean lightOn, int dors, int windows) {
        lightOn = this.lightOn;
        dors = this.dors;
        windows = this.windows;
        ++ROOMCOUNTER;
    }

    void switchOn() {
        this.lightOn = true;
    }

    void switchOff() {
        this.lightOn = false;
    }

    void goIn() {
        this.isAnybodyIn = true;
        this.openTheDore();
        this.closeTheDore();
        ++this.peopleCounter;
    }

    void goAway() {
        if (this.peopleCounter > 0) {
            this.isAnybodyIn = false;
            this.openTheDore();
            this.closeTheDore();
            this.peopleCounter--;
        }

    }

    void openTheDore() {
        if (this.doerOpenCounter > this.dors) {
            this.isDoreOpen = true;
            this.doerOpenCounter++;
        }

    }

    void closeTheDore() {
        this.isDoreOpen = false;
        this.doerOpenCounter--;
    }

    void openTheWindow() {
        if (this.windowOpenCounter > this.windows) {
            this.windowOpenCounter++;
        }

    }

    void closeTheWindow() {
        this.windowOpenCounter--;
    }
}
