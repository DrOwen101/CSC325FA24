/* Trinity Noble
 * CS325
 * This program builds a car class which has a method to excecute loops
 * 09.09.24
 */

///////////////////////////////////////////////////////////////////////////
public class TrinityNobleCar {
    String CarType;
    String CarColor;
    int CarYear;

    //Creating the constructor
    public TrinityNobleCar(String CarType, String CarColor, int CarYear) {
        this.CarType = CarType;
        this.CarColor = CarColor;
        this.CarYear = CarYear;
    }
    ////////////////////////////////////////////////////////////////////////
    
    //Getters and Setters
    public String GetCarType() {
        return CarType;
    }
    public void SetCarType(String CarType) {
        this.CarType = CarType;
    }

    public String GetCarColor() {
        return CarColor;
    }
    public void SetCarColor(String CarColor) {
        this.CarColor = CarColor;
    }

    public int GetCarYear() {
        return CarYear;
    }
    public void SetCarYear(int CarYear) {
        this.CarYear = CarYear;
    }
    /////////////////////////////////////////////////////////////////////

    //Calculating car age and the amount of oil changes
    public String Calculations(int CurrentYear) {
        //calculating age
        int age;
        int numOilChanges = 0;
        age = CurrentYear - CarYear;

        //calculating oil changes
        for (int i = 1; i <= age; i++) {
            if (i % 3 == 0) {
                numOilChanges++;
            }
        }
        return "The car's age is: " + age + ". The car should have: " + numOilChanges + " oil changes.";
    }    
    //////////////////////////////////////////////////////////////////////

    //for testing purposes
    public static void main(String[] args) {
        //car instance
        TrinityNobleCar car = new TrinityNobleCar("Cadillac Escalade", "Black", 2022);
        int currentYear = 2024;

        //print 
        System.out.println("Car Type: " + car.GetCarType());
        System.out.println("Car Color: " + car.GetCarColor());
        System.out.println(car.Calculations(currentYear));
    }
}
