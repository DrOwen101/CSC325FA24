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

    public String ageAndOilChange() {
        int carAge = 2024 - carYear;
        int oilChanges = 0;

        for (int i = 0; i < carAge; i++) {
            if (i % 3 == 0) {
                oilChanges++;
            }
        }
        return "Car is " + carAge + " years old, and should have had " + oilChanges + " oil changes.";
    }

}