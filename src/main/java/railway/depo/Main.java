package railway.depo;

import org.xml.sax.SAXException;
import railway.depo.carvagon.PassengerRailroadCar;
import railway.depo.locomotives.LocomotivePassenger;

import javax.xml.parsers.ParserConfigurationException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DOMParserr domParserr = new DOMParserr("example.xml");
        domParserr.collectInformation(TrainsXML.PASSENGERTRAIN.getXmlName());
        domParserr.collectInformation(TrainsXML.CARGOTRAIN.getXmlName());
        domParserr.collectInformation(TrainsXML.PASSENGERLOCOMOTIVE.getXmlName());
        domParserr.collectInformation(TrainsXML.CARGOTRAINCOCOMOTIVE.getXmlName());

        domParserr.trains.forEach(System.out::println);


        ReadyRailwayTrain railwayTrain = new ReadyRailwayTrain(new LocomotivePassenger
                ("Valeiya", "600"));

        railwayTrain.addCar(new PassengerRailroadCar("Valeya", "3 tons", "600"));
        railwayTrain.addCar(new PassengerRailroadCar("Feedom", "4 tons", "800"));
        int totalPassengers = railwayTrain.countPassengers();


        try (FileWriter fileWriter = new FileWriter("file.xml");
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            printWriter.println("<?xml version=\" 1.0 \" encoding=\"UTF-8\" standalone=\" yes \"?>");
            printWriter.println("<results>");
            printWriter.println("<passengerTotal total=\""+ totalPassengers +"\""+" />");
            printWriter.println("</results>");
        }
    }
}
