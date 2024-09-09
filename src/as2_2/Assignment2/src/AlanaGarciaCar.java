/* 
 * Alana Garcia
 * Assignment 2.2
 * 9/8/2024
*/

public class AlanaGarciaCar{
    public String car, carType, color;
    public int year;

    //Constructor
    public AlanaGarciaCar(String car, String carType, String color, int year){
        this.car = car;
        this.carType = carType;
        this.color = color;
        this. year = year;
    }

    //getter + setter for car
    public String getCar(){
        return car;
    }

    public void setCar(String car){
        this.car = car;
    }

    //getter + setter for car type
    public String getCarType(){
        return carType;
    }

    public void getCarType(String carType){
        this.carType = carType;
    }

    //getter + setter for color
    public String color(){
        return color;
    }

    public void getColor(String color){
        this.color = color;
    }

    //getter + setter for year
    public int year(){
        return year;
    }

    public void getYear(int year){
        this.year = year;
    }

    //method to print details
    public void displayCarDetails(){
        System.out.println("Car: " + car);
        System.out.println("Car Type: " + carType);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
    }

    //method to calculate car age and oil change
    public String calculateCarAgeAndOilChange(){
        //initializes year
        int currentYear = 2024;

        //calculates car age
        int carAge = currentYear - year;

        //initializes oil change counter
        int oilChange = 0;

        for (int i=1; i <= carAge; i++){
            if(i%3 == 0){
                oilChange++;
            }
        }

        return carAge + " year old car needs " + oilChange + " oil changes.";
    }
}