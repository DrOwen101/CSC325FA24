package AndiaKaranja_cars;

public class AndiaKaranjaCar {
    String car;
    String colour;  
    int carYear; 
    int carAgeInt; 
    int numOilChanges;

    public AndiaKaranjaCar(String car, String colour, int carYear){
        this.car = car; 
        this.colour = colour; 
        this.carYear = carYear; 
        carAgeInt = 0; 
        numOilChanges = 0; 
    }

    public void setCar(String newCar){
       car = newCar; 
    }

    public void setColour(String newColour){
       colour = newColour; 
    }

    public void setCarYear (int newCarYear){
        carYear = newCarYear; 
    }

    public String getCar(){
        return car; 
    }

    public String getColour(){
        return colour; 
    }

    public int getCarYear(){
        return carYear; 
    }

    public int getOilChanges(){
        return numOilChanges; 
    }

    //concludes getter and setter methods 

    //method in the class that takes the current year and subtracts the car year
    //then returns a string that tells how many years old the car is. 
    //For every 3 years, add +1 oil change needed/occured 


    public String carAge(int currentYear){
        //TODO this method doesn't work right yet, still inpr
        carAgeInt = currentYear - getCarYear(); 
       // String carAge = carAgeInt.toString(); 
        //return carAge;

        int carAgeHold = carAgeInt; 
         for (int i = 0; i< carAgeInt; i++){
            if(carAgeHold %3 != 0){
                numOilChanges++; 
                carAgeHold--;
            }
         }

        return "";

    }
}