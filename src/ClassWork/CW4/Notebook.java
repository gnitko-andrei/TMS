package ClassWork.CW4;

public class Notebook {
    private int ram;
    private int rom;
    private final String brand;
    private static int RAM_LIMIT = 32;
    private static int ROM_LIMIT = 1000;

    public Notebook(int ram, int rom, String brand) {
        if (this.isValid(ram, RAM_LIMIT)) {
            this.ram = ram;
        }

        if (this.isValid(rom, ROM_LIMIT)) {
            this.rom = rom;
        }

        this.brand = brand;
    }

    public int getRam() {
        return this.ram;
    }

    public void setRam(int ram) {
        if (this.isValid(ram, RAM_LIMIT)) {
            this.ram = ram;
        }

    }

    public int getRom() {
        return this.rom;
    }

    public void setRom(int rom) {
        if (this.isValid(rom, ROM_LIMIT)) {
            this.rom = rom;
        }

    }

    public String getBrand() {
        return this.brand;
    }

    private boolean isValid(int value, int limit) {
        return value < 0 || value < limit;
    }

    public String toString() {
        return this.brand;
    }
}
