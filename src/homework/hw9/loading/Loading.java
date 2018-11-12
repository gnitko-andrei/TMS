package homework.hw9.loading;

public class Loading {
    private int boxNumber;
    private int loadersNumber;

    public Loading(int boxNumber, int loadersNumber) {
        this.boxNumber = boxNumber;
        this.loadersNumber = loadersNumber;
    }

    public synchronized void takeBox(){
        if(boxNumber > 0) {
            boxNumber--;
        }

    }

    public int getBoxNumber() {
        return boxNumber;
    }

    public void setBoxNumber(int boxNumber) {
        this.boxNumber = boxNumber;
    }

    public int getLoadersNumber() {
        return loadersNumber;
    }

    public void setLoadersNumber(int loadersNumber) {
        this.loadersNumber = loadersNumber;
    }
}
