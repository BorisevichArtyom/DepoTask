package railway.depo.train.locomotives;

public class LocomotivePassenger extends Locomotive {
    private static final String ROLE="Locomotive";
    private static final String PURPOSE="Passenger";

    public LocomotivePassenger(String name, String role, String purpose, String tractionforce) {
        super(name, role, purpose, tractionforce);
    }
    public LocomotivePassenger(String name, String tractionforce) {
        super(name, ROLE, PURPOSE, tractionforce);
    }

    @Override
    public String pull() {
        return "Passenger pulling";
    }
}
