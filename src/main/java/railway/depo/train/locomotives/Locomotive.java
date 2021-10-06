package railway.depo.train.locomotives;

import railway.depo.train.Train;

public abstract class Locomotive extends Train {
    private String tractionforce;

    public Locomotive(String name, String role, String purpose, String tractionforce) {
        super(name, role, purpose);
        this.tractionforce = tractionforce;
    }

    public String getTractionforce() {
        return tractionforce;
    }

    public String toString() {
        return "Поезд " + getName() + ", следующей функции: \"" + getRole() + "\", тяговая сила " + getTractionforce()
                + ", назначение " + getPurpose();
    }
    public abstract String pull();
}
