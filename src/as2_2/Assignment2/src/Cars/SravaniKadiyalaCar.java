package Cars;
public class SravaniKadiyalaCar {
    private String carType;
    private String carColor;
    private int carYear;

    // Constructor
    public SravaniKadiyalaCar(String carType, String carColor, int carYear) {
        this.carType = carType;
        this.carColor = carColor;
        this.carYear = carYear;
    }

    // Getters and Setters
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

    // Method to calculate car age and oil changes
    public String calculateCarAgeAndOilChanges() {
        int currentYear = 2024;
        int carAge = currentYear - carYear;
        int oilChanges = 0;

        for (int i = 3; i < carAge; i += 3) {
            oilChanges++;
        }

        return currentYear + " - " + carYear + " = " + carAge + " year old car. Number of oil changes needed: " + oilChanges;
    
    }

}
