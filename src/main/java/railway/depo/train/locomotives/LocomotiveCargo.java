package railway.depo.train.locomotives;

public class LocomotiveCargo extends Locomotive{
    private static final String ROLE="Locomotive";
    private static final String PURPOSE="Cargo";

    public LocomotiveCargo(String name, String role, String purpose, String tractionforce) {
        super(name, role, purpose, tractionforce);
    }
    public LocomotiveCargo(String name, String tractionforce) {
        super(name, ROLE, PURPOSE, tractionforce);
    }

    @Override
    public String pull() {
        return "Cargo pulling";
    }
}
