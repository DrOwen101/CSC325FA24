public class ethanFowlerCar {
    // VARIABLES
    private String carType;
    private String carColor;
    private int carYear;

    // CONSTRUCTOR
    public ethanFowlerCar(String carType, String carColor, int carYear) {
        setCarType(carType);
        setCarColor(carColor);
        setCarYear(carYear);
    }

    // GETTER METHODS
    public String getCarType() {
        return carType;
    }
    public String getCarColor() {
        return carColor;
    }
    public int getCarYear() {
        return carYear;
    }

    // SETTER METHODS
    public void setCarType(String type) {
        carType = type;
    }
    public void setCarColor(String color) {
        carColor = color;
    }
    public void setCarYear(int year) {
        carYear = year;
    }

    // OTHER METHODS
    public String yearsOld() {
        int oilChanges = 0;
        int yearsOld = 2024 - getCarYear();
        while (yearsOld >= 0) {
            yearsOld -= 3;
            oilChanges++;
        }
        return "This " + yearsOld + "-year old " + getCarColor() + " " + getCarType() + " has had " + oilChanges + " oil changes.";
    }
}