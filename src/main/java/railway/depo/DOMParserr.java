package railway.depo;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import railway.depo.train.carvagon.CargoRailroadCar;
import railway.depo.train.carvagon.PassengerRailroadCar;
import railway.depo.train.locomotives.LocomotiveCargo;
import railway.depo.train.locomotives.LocomotivePassenger;
import railway.depo.train.Train;
import railway.depo.train.TrainsXML;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DOMParserr {

    List<Train> trains = new ArrayList<>();
    private String pathname;
    Document document;

    public Document getDocument() {
        return document;
    }

    public DOMParserr(String pathname) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        this.document = builder.parse(new File(pathname));
        this.pathname = pathname;
    }

    public void collectInformation(String element) throws ParserConfigurationException, IOException, SAXException {


        NodeList elementsXML = document.getElementsByTagName(element);
        for (int i = 0; i < elementsXML.getLength(); i++) {

            NamedNodeMap attributes = elementsXML.item(i).getAttributes();
            String name = attributes.getNamedItem("name").getNodeValue();
            if (element.equals(TrainsXML.CARGOTRAIN.getXmlName())) {
                String role = attributes.getNamedItem("role").getNodeValue();
                String purpose = attributes.getNamedItem("purpose").getNodeValue();
                String volume = attributes.getNamedItem("loadvolume").getNodeValue();
                String axialLoad = attributes.getNamedItem("axialload").getNodeValue();

                trains.add(new CargoRailroadCar(name, role, purpose, axialLoad, volume));
            } else if (element.equals(TrainsXML.PASSENGERTRAIN.getXmlName())) {
                String role = attributes.getNamedItem("role").getNodeValue();
                String purpose = attributes.getNamedItem("purpose").getNodeValue();
                String capacity = attributes.getNamedItem("capacity").getNodeValue();
                String axialLoad = attributes.getNamedItem("axialload").getNodeValue();

                trains.add(new PassengerRailroadCar(name, role, purpose, axialLoad, capacity));
            } else if (element.equals(TrainsXML.CARGOTRAINCOCOMOTIVE.getXmlName())) {
                String role = attributes.getNamedItem("role").getNodeValue();
                String purpose = attributes.getNamedItem("purpose").getNodeValue();
                String tractionforce = attributes.getNamedItem("tractionforce").getNodeValue();

                trains.add(new LocomotiveCargo(name, role, purpose, tractionforce));
            } else if (element.equals(TrainsXML.PASSENGERLOCOMOTIVE.getXmlName())) {
                String role = attributes.getNamedItem("role").getNodeValue();
                String purpose = attributes.getNamedItem("purpose").getNodeValue();
                String tractionforce = attributes.getNamedItem("tractionforce").getNodeValue();

                trains.add(new LocomotivePassenger(name, role, purpose, tractionforce));
            }
        }
    }

}
