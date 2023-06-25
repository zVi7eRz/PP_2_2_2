package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String color;
    private String model;
    private Long serials;

    public Car() {}

    public Car(String color, String model, Long serials) {
        this.color = color;
        this.model = model;
        this.serials = serials;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getSerials() {
        return serials;
    }

    public void setSerials(Long serials) {
        this.serials = serials;
    }
    public Car createCar(String color, String model, Long serials) {
        return new Car(color, model, serials);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", serials=" + serials +
                '}';
    }
}
