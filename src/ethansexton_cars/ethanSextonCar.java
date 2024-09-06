package ethansexton_cars;

public class ethanSextonCar {
    private String carType, carColor;
    private int carYear;

    public ethanSextonCar(String type, String color, int year){
        carType = type;
        carColor = color;
        carYear = year;
    }

    //#region Accessors and Mutators
    public void setType(String type){
        carType = type;
    }
    public String getType(){
        return carType;
    }
    public void setColor(String color){
        carColor = color;
    }
    public String getColor(){
        return carColor;
    }
    public void setYear(int year){
        carYear = year;
    }
    public int getYear(){
        return carYear;
    }
//#endregion
}

