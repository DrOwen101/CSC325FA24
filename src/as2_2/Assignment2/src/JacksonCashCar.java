public class JacksonCashCar {
    private String carType;
    private String carColor;
    private int carYear;

    public JacksonCashCar(String carType, String carColor, int carYear) {
        this.carType = carType;
        this.carColor = carColor;
        this.carYear = carYear;
    }
    

    public void setCarType(String newCarType) {
        carType = newCarType;
    }
    public void setCarColor(String newCarColor) {
        carColor = newCarColor;
    }
    public void setCarYear(int newCarYear) {
        carYear = newCarYear;
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

    public String getCarAge() {
        if(carYear > 2024) {
            return "invalid Year entered. Please enter the year your car was made again.";
        } else {
            return "" + (2024 - carYear) + " year old car.";
        }
        
    }
    public int getOCCount() {
        int i;
        for (i = 0; carYear > 0;) {
            carYear = (2024 - carYear) - 3;
            ++i;
        }
        return i;
    }
}