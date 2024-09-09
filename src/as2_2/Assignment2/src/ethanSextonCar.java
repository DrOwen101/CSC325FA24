public class EthanSextonCar {
    private String carModel, carColor;
    private int carYear;

    public EthanSextonCar(String model, String color, int year){
        carModel = model;
        carColor = color;
        carYear = year;
    }

    public String getModel(){
        return carModel;
    }
    public int getYear(){
        return carYear;
    }
    public String getColor(){
        return carColor;
    }

    public void setColor(String color){
        carColor = color;
    }

    public void setYear(int year){
        carYear = year;
    }

    public void setModel(String model){
        carModel = model;
    }
    public int getOil(int year){
        int numOfOilChanges = 0;
        while (2024 - year >= 3) {
            numOfOilChanges++;
            year += 3;
        }
        return numOfOilChanges;
    }
    public String toString(){
        return "Model: " + carModel + "\nColor: " + carColor + "\nYear: " + carYear + "\nNumber of Oil Changes: " + getOil(carYear);
    }

}