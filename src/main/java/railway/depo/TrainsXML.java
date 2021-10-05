package railway.depo;

public enum TrainsXML {
    PASSENGERTRAIN("passengertrain"),
    CARGOTRAIN("cargotrain"),
    PASSENGERLOCOMOTIVE("passengerlocomotive"),
    CARGOTRAINCOCOMOTIVE("cargotrainlocomotive");


    private String xmlName;

    public  String getXmlName() {
        return  xmlName;
    }

    TrainsXML(String xmlName) {
        this.xmlName = xmlName;
    }
}
