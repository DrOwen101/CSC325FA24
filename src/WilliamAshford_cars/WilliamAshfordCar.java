package WilliamAshford_cars;

public class WilliamAshfordCar {
    private String CarType;
    private String CarColor;
    private int CarYear;

    public WilliamAshfordCar(String CarType, String CarColor, int CarYear)   //Constructor
    {
        this.CarType = CarType;
        this.CarColor = CarColor;
        this.CarYear = CarYear;
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

    public void yearsOld(int CarYear)  //Needs to return a string
    {
        int YearsOld = 2024 - CarYear;
        int numOfOilChanges = 0;
        int old = YearsOld;
        if (old > 3)
            {
                old = old - 3;
                numOfOilChanges ++;
            }
        System.out.println(YearsOld + " year old car. With " + numOfOilChanges + " oil changes");
    }
}
