package homework.hw3;

public class Building {
    private int floors;
    private int entrances;
    private int flats;
    private boolean isElevator;

    public Building() {
        int floors = 5;
        int entrance = 7;
        int flats = 70;
        boolean isElevator = false;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getEntrances() {
        return entrances;
    }

    public void setEntrances(int entrances) {
        this.entrances = entrances;
    }

    public int getFlats() {
        return flats;
    }

    public void setFlats(int flats) {
        this.flats = flats;
    }

    public boolean isElevator() {
        return isElevator;
    }

    public void setElevator(boolean elevator) {
        isElevator = elevator;
    }
}
