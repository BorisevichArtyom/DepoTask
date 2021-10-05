package railway.depo;

public class CargoRailroadCar extends RailroadCar {
    private String volume;
    private static final String ROLE="Vagon";
    private static final String PURPOSE="Cargo";

    public CargoRailroadCar(String name, String role, String purpose, String axialLoad, String volume) {
        super(name, role, purpose, axialLoad);
        this.volume = volume;
    }
    public CargoRailroadCar(String name, String axialLoad, String volume) {
        super(name, ROLE, PURPOSE, axialLoad);
        this.volume = volume;
    }

    public String getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Поезд " + getName() + ", следующей функции: \"" + getRole() + "\", грузоподъемность " + getVolume() +
                ", осевая нагрузка " + getAxialLoad();
    }
}
