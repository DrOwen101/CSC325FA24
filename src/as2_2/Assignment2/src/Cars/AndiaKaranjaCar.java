package Cars;
public class AndiaKaranjaCar {
    String car;
    String colour;  
    int carYear; 
    int carAgeNum; 
    int numOilChanges;

    public AndiaKaranjaCar(String car, String colour, int carYear){
        this.car = car; 
        this.colour = colour; 
        this.carYear = carYear; 
        carAgeNum = 0; 
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
    
    public String carAgeAndOilChange(){
        int currentYear = 2024; 
        carAgeNum = currentYear - getCarYear(); 
        int carAgeHold = carAgeNum; 

        for (int i = 0; i < carAgeNum; i++){
            if (i + 3 <= carAgeHold){
                numOilChanges++; 
                carAgeHold -= 2; 
            }   
        }

        String returnStr = "The car is " + carAgeNum + " years old\nThe car has had " + numOilChanges + " oil changes";
        return returnStr;
    }
}