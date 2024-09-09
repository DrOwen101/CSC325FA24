public class DavidMossCar {
    private String carType;
    private String carColor;
    private int carYear;

    // Constructor
    public DavidMossCar(String carType, String carColor, int carYear) {
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
    public String calculateCarAge(int currentYear) {
        int carAge = currentYear - this.carYear;
        int oilChanges = 0;
        
        // Loop to calculate the number of oil changes needed
        for (int i = 3; i <= carAge; i += 3) {
            oilChanges++;
        }
        
        return this.carType + " " + this.carColor + " is " + carAge + " years old and should have had " + oilChanges + " oil changes.";
    }

    public static void main(String[] args) {
        // Creating an instance of DavidMossCar
        DavidMossCar myCar = new DavidMossCar("Sedan", "Red", 2004);
        
        // Output the details
        System.out.println(myCar.calculateCarAge(2024));
    }
}
