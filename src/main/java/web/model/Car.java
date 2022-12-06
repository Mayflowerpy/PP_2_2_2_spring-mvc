package web.model;

public class Car {

    private String carModel;
    private String color;
    private int serialNum;

    public Car() {
    }

    public Car(String carModel, String color, int serialNum) {
        this.carModel = carModel;
        this.color = color;
        this.serialNum = serialNum;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel='" + carModel + '\'' +
                ", color='" + color + '\'' +
                ", serialNum=" + serialNum +
                '}';
    }
}
