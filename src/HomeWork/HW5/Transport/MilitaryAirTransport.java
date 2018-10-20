package HomeWork.HW5.Transport;

public class MilitaryAirTransport extends AirTransport {
    private boolean isEjectionSystem;
    private int missilesNumber;

    public MilitaryAirTransport() {
        this.isEjectionSystem = true;
        this.missilesNumber = 10;
    }

    public MilitaryAirTransport(boolean isEjectionSystem, int missilesNumber) {
        this.isEjectionSystem = isEjectionSystem;
        this.missilesNumber = missilesNumber;
    }

    public void description() {
        super.description();
        System.out.println("Это военный воздушный транспорт");
        if (this.isEjectionSystem) {
            System.out.println("Система катапультирования есть");
        } else {
            System.out.println("Система катапультирования отсутствует");
        }
        System.out.println("Количество ракет " + this.missilesNumber);
    }

    public void shot() {
        int missilesNumber = this.getMissilesNumber();
        if (missilesNumber > 1) {
            System.out.println("Ракета пошла...");
            --missilesNumber;
            this.setMissilesNumber(missilesNumber);
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }

    }

    public void eject() {
        if (this.isEjectionSystem()) {
            System.out.println("Катапультирование прошло успешно");
            setEjectionSystem(false);
        } else {
            System.out.println("У вас нет такой системы. Пилот погиб(");
        }

    }

    public int getMissilesNumber() {
        return this.missilesNumber;
    }

    public void setMissilesNumber(int missilesNumber) {
        this.missilesNumber = missilesNumber;
    }

    public boolean isEjectionSystem() {
        return this.isEjectionSystem;
    }

    public void setEjectionSystem(boolean ejectionSystem) {
        this.isEjectionSystem = ejectionSystem;
    }
}
