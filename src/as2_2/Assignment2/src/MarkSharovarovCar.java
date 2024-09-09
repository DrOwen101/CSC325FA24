
public class MarkSharovarovCar {
    private String carType;
    private String carColor;
    private int carYear;

    public MarkSharovarovCar(String type, String color, int year){
        carType = type;
        carColor = color;
        carYear = year;
    }

    public void setCarType(String type){
        carType = type;
    }

    public void setCarColor(String color){
        carColor = color;
    }

    public void setCarYear(int year){
        carYear = year;
    }

    public String getCarType(){
        return carType;
    }

    public String getCarColor(){
        return carColor;
    }

    public int getCarYear(){
        return carYear;
    }

    public String getCarAgeAndNumberOfOilChanges(int year){
        int age = 2024 - year;
        int numberOfOilChange = 0;    

        for(int i=age; i>=0; i=i-2){
            numberOfOilChange++;        
        }
        return "2024 - " + year + " = " + age + " year old car. \nIt should have had " + numberOfOilChange + "oil changes";
        
    }

}
