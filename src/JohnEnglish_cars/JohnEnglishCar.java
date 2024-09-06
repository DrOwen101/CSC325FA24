package JohnEnglish_cars;

public class JohnEnglishCar {
    
    public String carType;
    public String carColor;
    public int carYear;

    public void Car(String type, String color, int year) {
        carType = type;
        carColor = color;
        carYear = year;
    }

    public void Car(){}

    // Getters
    public String getType() {return carType;}
    public String getColor() {return carColor;}
    public int getYear() {return carYear;}

    // Setters
    public void setType(String type) {carType = type;}
    public void setColor(String color) {carColor = color;}
    public void setYear(int year) {carYear = year;}

}
