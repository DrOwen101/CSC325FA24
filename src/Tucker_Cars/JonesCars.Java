public class JonesCars
{
    private String carType;
    private String car, color;
    private int carYear;

    //constructor 

    public JonesCars(String carType, String car, String color, int carYear)
    {
        this.carType = carType;
        this.car = car;
        this.color = color;
        this.carYear = carYear;
    }

    //getter

    public String getCarType()
    {
        return carType;
    }

    public String getCar()
    {
        return car;
    }

    public String getColor()
    {
        return color;
    }

    public int getCarYear()
    {
        return carYear;
    }

    //setter

    public void setCarType(String c)
    {
        carType = c;
    }

    public void setCar(String c)
    {
        car = c;
    }

    public void setColor(String c)
    {
        color = c;
    }

    public void setCarYear(int c)
    {
        carYear = c;
    }

    //other method

    public String oilChange(int year)
    {
        int age = 2024 - year;
        int oil = 0;
        for (int i = age; i > 0; i--)
        {
            if (i % 3 == 0)
            {
                oil++;
            } else if (i == 0) {
                break;
            }
        }
        return "Car is " + age + " years old and needs " + oil + " oil changes."; 
    }
}