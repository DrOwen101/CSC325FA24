public class ethanSextonCar {
    private String carType, carColor;
    private int carYear;

    public ethanSextonCar(String type, String color, int year){
        carType = type;
        carColor = color;
        carYear = year;
    }

    public String getType(){
        return carType;
    }

    public void setColor(String color){
        carColor = color;
    }

    public void setYear(int year){
        carYear = year;
    }