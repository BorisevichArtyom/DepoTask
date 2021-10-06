package railway.depo.train;

import railway.depo.train.carvagon.CargoRailroadCar;
import railway.depo.train.carvagon.PassengerRailroadCar;
import railway.depo.train.carvagon.RailroadCar;
import railway.depo.train.locomotives.Locomotive;

import java.util.ArrayList;
import java.util.List;

public class ReadyRailwayTrain {
    private Locomotive locomotive;
    private List<PassengerRailroadCar> passengerRailroadCar = new ArrayList<>();
    private List<CargoRailroadCar> cargoRailroadCar = new ArrayList<>();


    private ReadyRailwayTrain() {
    }

    public ReadyRailwayTrain(Locomotive locomotive) {
        this.locomotive=locomotive;
    }



    public void addCar(RailroadCar car) {
        if ((locomotive.getPurpose().equals(car.getPurpose())) & (car.getPurpose().equals("Passenger"))) {
            PassengerRailroadCar addedCar = (PassengerRailroadCar) car;
            passengerRailroadCar.add(addedCar);
        } else if ((locomotive.getPurpose().equals(car.getPurpose())) & (car.getPurpose().equals("Cargo"))) {
            CargoRailroadCar addedCar = (CargoRailroadCar) car;
            cargoRailroadCar.add(addedCar);
        } else {
            System.out.println("Нельзя добавить данный тип вагона k данному лоомотиву");
        }
    }

    public List<PassengerRailroadCar> getPassengerRailroadCar() {
        return passengerRailroadCar;
    }

    public List<CargoRailroadCar> getCargoRailroadCar() {
        return cargoRailroadCar;
    }

    public Locomotive getLocomotive() {
        return locomotive;
    }

    public int countPassengers() {
        int count = 0;
        for (PassengerRailroadCar railroadCar : passengerRailroadCar) {
            count = Integer.parseInt(railroadCar.getCapacity()) + count;
        }
        return count;
    }

}
