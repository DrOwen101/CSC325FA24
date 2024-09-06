package ethansexton_cars;

public class ethanSextonCar {
    private String carType, car;
    private int carYear;

    public ethanSextonCar(String cT, String c, int cY){
        carType = cT;
        car = c;
        carYear = cY;
    }

    //#region Accessors and Mutators
    public void setType(String type){
        carType = type;
    }
    public String getType(){
        return carType;
    }
    public void setCar(String c){
        car = c;
    }
    public String getCar(){
        return car;
    }
    public void setYear(int year){
        carYear = year;
    }
    public int getYear(){
        return carYear;
    }
//#endregion
}

