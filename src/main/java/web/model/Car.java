package web.model;

import java.util.Objects;

public class Car {
    private int id;
    private String model;
    private int serial;

    public Car(int id, String model, int serial) {
        this.id = id;
        this.model = model;
        this.serial = serial;
    }

    public int getId(){
        return id;
    }
    public String getModel(){
        return model;
    }
    public int getSerial(){
        return serial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && Integer.compare(car.serial, serial) == 0 && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, serial);
    }

}
