package WilliamAshford_cars;

public class WilliamAshfordCar {
    private String CarType;
    private String CarColor;
    private int CarYear;

    public WilliamAshfordCar(String CarType, String CarColor, int CarYear)   //Constructor
    {
        System.out.println(CarType + ", " + CarColor + ", " + yearsOld(CarYear));
    }

    public String getCarType()   //Getter methods 
    {
        return CarType;
    }

    public String getCarColor()
    {
        return CarColor;
    }

    public int getCarYear()
    {
        return CarYear;
    }

    public void setCarType(String CarType)   //Setter methods
    {
        this.CarType = CarType;
    }

    public void setCarColor(String CarColor)
    {
        this.CarColor = CarColor;
    }

    public void setCarYear(int CarYear)
    {
        this.CarYear = CarYear;
    }

    public String yearsOld(int CarYear)  //Method to get car year and number of oil changes.
    {
        int YearsOld = 2024 - CarYear;
        int numOfOilChanges = 0;
        int old = YearsOld;
        if (old > 3)
            {
                old = old - 3;
                numOfOilChanges ++;
            }
        return YearsOld + " year old car, with " + numOfOilChanges + " oil changes.";
    }
}
