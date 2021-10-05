package railway.depo;

public class PassengerRailroadCar extends RailroadCar {
    private String capacity;
    private static final String ROLE="Vagon";
    private static final String PURPOSE="Passenger";


    public PassengerRailroadCar(String name, String role, String purpose, String axialLoad, String capacity) {
        super(name, role, purpose, axialLoad);
        this.capacity = capacity;
    }
    public PassengerRailroadCar(String name, String axialLoad, String capacity) {
        super(name, ROLE, PURPOSE, axialLoad);
        this.capacity = capacity;
    }

    public String getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Поезд " + getName() + ", следующей функции: \"" + getRole() + "\", число пассажирова " + getCapacity() +
                ", осевая нагрузка " + getAxialLoad();
    }
}
