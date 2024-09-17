package Cars;
public class CaleTonazziCar {
    String carType;
    String carColor;
    int carYear;

    // Constructor
    public CaleTonazziCar(String carType, String carColor, int carYear) {
        this.carType = carType;
        this.carColor = carColor;
        this.carYear = carYear;
    }

    // Setters
    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    // Getters
    public String getCarType() {
        return carType;
    }

    public String getCarColor() {
        return carColor;
    }

    public int getCarYear() {
        return carYear;
    }

    // Methods
    public String calculateMaintenance() { // Calculates how many oil changes are needed based on the vehicle's age.
        int carAge = 2024 - carYear;
        int oilChanges = 0;
        for (int i = 3; i <= carAge; i += 3) {
            oilChanges++;
        }
        return "This " + carColor + " " + carYear + " " + carType + " should have " + oilChanges + " oil changes.";
    }
}
