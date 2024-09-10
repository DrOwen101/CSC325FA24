
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

    public String getCarAgeAndNumberOfOilChanges(){
        int age = 2024 - carYear;
        int numberOfOilChange = 0;    

        for(int i=age; i>=3; i=i-3){
            numberOfOilChange++;        
        }
        return "The "+ carType + " in " + carColor +" color is "+ age + " years old car. \nIt should have had " + numberOfOilChange + " oil changes";
        
    }
}