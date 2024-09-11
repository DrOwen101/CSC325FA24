public class LandonWebbCar {
    
    private String carType;
    private String carColor;
    private int carYear;

    
    public LandonWebbCar(String carType, String carColor, int carYear) {
        this.carType = carType;
        this.carColor = carColor;
        this.carYear = carYear;
    }

    
    public String getCarType() {
        return carType;
    }

    public int getCarYear() {
        return carYear;
    }

    public String getCarColor() {
        return carColor;
    }
    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }
    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

   public String  calculateCarAgeAndOilChanges() {
        int carAge = 2024 - carYear;
        int oilChanges = 0;

        for (int i = 3; i <= carAge; i += 3) {
            oilChanges++;
        }
        return "For a " + carAge + " year old car, this car should have" + oilChanges + " oil changes.";
    }
}