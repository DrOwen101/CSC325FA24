public class EmiliaKubikCar {
    private String carType;
    private String carColor;
    private int carYear;

    public EmiliaKubikCar(String type, String color, int year){
        carType = type;
        carColor = color;
        carYear = year;
    }

    int count = 1;
    int oilChange = 0;
    public String carAge(){
        int age = 2024 - carYear;
        for(int i = 0; i < age; i++){
            count++;
            if(count == 3){
                oilChange++;
                count = 0;
            }
        }
        return "Car's age: " + age + " Number of oil changes: " + oilChange;
    }

    public void setType(String type){
        carType = type;
    }

    public void setColor(String color){
        carColor = color;
    }

    public void setYear(int year){
        carYear = year;
    }

    public String getType(){
        return carType;
    }

    public String getColor(){
        return carColor;
    }

    public int getYear(){
        return carYear;
    }
}