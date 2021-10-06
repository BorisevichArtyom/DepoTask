package railway.depo.train;

public abstract class Train {
    private String name;
    private String role;
    private String purpose;

    public Train(String name, String role, String purpose) {
        this.name = name;
        this.role = role;
        this.purpose = purpose;
    }

    public String getRole() {
        return role;
    }

    public String getPurpose() {
        return purpose;
    }

    public String getName() {
        return name;
    }
}
