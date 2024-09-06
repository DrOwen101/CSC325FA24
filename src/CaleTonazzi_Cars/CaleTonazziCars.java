package CaleTonazzi_Cars;

public class CaleTonazziCars {
    private String carType;
    private String carColor;
    private int carYear;

    public CaleTonazziCars(String carType, String carColor, int carYear) {
        this.carType = carType;
        this.carColor = carColor;
        this.carYear = carYear;
    }

    public String getCarType() {
        return carType;
    }

    public String getCarColor() {
        return carColor;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }
}
