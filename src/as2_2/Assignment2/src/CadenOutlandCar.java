public class CadenOutlandCar {
    //Variables
    String carType, carColor;
    int carYear;

    //Constructor
    public CadenOutlandCar(String type, String color, int year){
        carType = type;
        carColor = color;
        carYear = year;
    }

    //Getters
    public String getType(){
        return carType;
    }

    public String getColor(){
        return carColor;
    }

    public int getYear(){
        return carYear;
    }

    //Setters
    public void setType(String type){
        carType = type;
    }

    public void setColor(String color){
        carColor = color;
    }

    public void setYear(int year){
        carYear = year;
    }

    //Method for car age and oil changes
    public String carAge(){
        int carAge = 2024 - carYear;
        int oilChanges  = 0;
        for (int i = 0; i <= carAge; i += 3){
            oilChanges++;
        }
        return "Car age: " + carAge + "\n" + oilChanges + " oil changes.";
    }
}
