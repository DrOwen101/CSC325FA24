package Cars;
public class AbbieGeorgeCar {
    //variables
    private String carType;
    private String carColor;
    private int carYear;

    //constructor
    public AbbieGeorgeCar(String carType, String carColor, int carYear){
        this.carType = carType;
        this.carColor = carColor;
        this.carYear = carYear;
       
    }

    //get carType
    public String getCarType(){
        return carType;
    }

    //get carColor
    public String getCarColor(){
        return carColor;
    }

    //get carYear
    public int getCarYear(){
        return carYear;
    }

    //set carType
    public void setCarType(String carType){
        this.carType = carType;
    }

    //set carColor
    public void setCarColor(String carColor){
        this.carColor = carColor;
    }

    //set carYear
    public void setCarYear(int carYear){
        this.carYear = carYear;
    }

    //method to get age of car subtracted from current year and get oil changes
    public String carYearCalculator () {
        //initializes calculateAge and subtracts 2024 from the car year
        int calculateAge = 2024 - carYear;
        
        //initializes oilCount
        int oilCount = 0;

        //calculates the number of times an oil change is needed in the car's life span.
        for (int i = 3; i <= calculateAge; i+= 3){
            oilCount++;
            
        }
        
        //returns a string that tells the user the age of the car as well as the amount of oil changes needed.
        return "This " + carColor + " " + carType + " " + "is " + calculateAge + " year(s) old. It needs " + oilCount + " oil change(s) over its lifespan.";
    }

    

} //close class


