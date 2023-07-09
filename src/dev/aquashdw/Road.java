package dev.aquashdw;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Road {
    private ArrayList<CarInterface> carsOnRoad;

    public Road(){
        this.carsOnRoad = new ArrayList<>();
    }
    public Road(List<CarInterface> carsOnRoad){
        this.carsOnRoad = (ArrayList<CarInterface>) carsOnRoad;
    }
    public void addCar(CarInterface car){
        this.carsOnRoad.add(car);
    }
}
