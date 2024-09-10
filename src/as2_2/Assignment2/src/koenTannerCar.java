package koentanner_cars;

public class koenTannerCar {
    String carType;
    String carColor;
    int carYear;

    public koenTannerCar(String carType, String carColor, int carYear) {
        this.carType = carType;
        this.carColor = carColor;
        this.carYear = carYear;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

}