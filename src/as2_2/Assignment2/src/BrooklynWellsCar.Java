public class BrooklynWellsCar {
    private String carType;
    private String carColor;
    private int carYear;
    

    public BrooklynWellsCar(String type, String color, int year) {
        carType = type;
        carColor = color;
        carYear = year;
        
    }

    public String getCarType() {
        return carType;
    }

    public String getCarColor() {
        return carColor;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarType( String t) {
        carType = t;
    }

    public void setCarColor( String c ) {
        carColor = c;
    }

    public void setCarYear( int y) {
        carYear = y;

    }
    
    public String oilChange() {
        int yearsOld = 2024 - carYear;
        int yearsOld2 = yearsOld;
        int oil = 0;
        int i;
    if (2024 > carYear) {
        for( i = 0; yearsOld2 > 1;) {
            yearsOld2 = yearsOld2 - 3;
            oil++;
        }   
    } else {
        System.out.println("Invalid Year");
    }
      if (2024 > carYear) {
          return "your car is " + yearsOld + " years old and should have received " + oil + " oil changes so far!";
      } else {
          return "";
      }
    }
              
}