package railway.depo;

public abstract class RailroadCar extends Train{
    String axialLoad;

    public RailroadCar(String name, String role, String purpose, String axialLoad) {
        super(name, role, purpose);
        this.axialLoad = axialLoad;
    }

    public String getAxialLoad() {
        return axialLoad;
    }
}
