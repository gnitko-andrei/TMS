package homework.hw5.transport.air;

/**
 * Класс воздушного военного транспорта.
 *
 * @author Gnitko Andrei
 * @see AirTransport
 */
public class MilitaryAirTransport extends AirTransport {
    /**
     * Наличие системы катапультирования (true/false).
     */
    private boolean isEjectionSystem;
    /**
     * Количество ракет на борту.
     */
    private int missilesNumber;

    /**
     * Конструктор по умолчанию, задающий стандартные значения наличия системы катапультирования (true/false)
     * и количества ракет на борту воздушного военного транспорта.
     */
    public MilitaryAirTransport() {
        this(true, 10);
    }

    /**
     * Конструктор, задающий значения наличия системы катапультирования (true/false)
     * и количества ракет на борту воздушного военного транспорта.
     *
     * @param isEjectionSystem наличие системы катапультирования (true/false)
     * @param missilesNumber   количество ракет на борту
     */
    public MilitaryAirTransport(boolean isEjectionSystem, int missilesNumber) {
        setEjectionSystem(isEjectionSystem);
        setMissilesNumber(missilesNumber);
    }

    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Это военный воздушный транспорт");
        if (this.isEjectionSystem) {
            System.out.println("Система катапультирования есть");
        } else {
            System.out.println("Система катапультирования отсутствует");
        }
        System.out.println("Количество ракет " + this.missilesNumber);
    }

    /**
     * Метод выстрел, проверяем если кол-во
     * ракет не равно 0 то выводим на консоль “ Ракета пошла...”, если 0 то
     * “Боеприпасы отсутствуют”.
     */
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

    /**
     * Метод катапультирование, который проверит если наличие системы
     * катапультирования true, то выводим “Катапультирование прошло успешно”,
     * если false, то “У вас нет такой системы ”
     */
    public void eject() {
        if (this.isEjectionSystem()) {
            System.out.println("Катапультирование прошло успешно");
            setEjectionSystem(false);
        } else {
            System.out.println("У вас нет такой системы. Пилот погиб(");
        }

    }

    /**
     * Геттер количества ракет на борту.
     *
     * @return количество ракет на борту.
     */
    public int getMissilesNumber() {
        return this.missilesNumber;
    }

    /**
     * Сеттер количества ракет на борту.
     *
     * @param missilesNumber количество ракет на борту.
     */
    public void setMissilesNumber(int missilesNumber) {
        if (missilesNumber < 0) {
            throw new IllegalArgumentException("Количество ракет не может быть отрицательным");
        }
        this.missilesNumber = missilesNumber;
    }

    /**
     * Геттер наличия системы катапультирования (true/false)
     *
     * @return наличие системы катапультирования (true/false)
     */
    public boolean isEjectionSystem() {
        return this.isEjectionSystem;
    }

    /**
     * Сеттер наличия системы катапультирования (true/false)
     *
     * @param ejectionSystem наличие системы катапультирования (true/false)
     */
    public void setEjectionSystem(boolean ejectionSystem) {
        this.isEjectionSystem = ejectionSystem;
    }
}
