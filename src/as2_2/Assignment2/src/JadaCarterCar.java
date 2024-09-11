public class JadaCarterCar 
{
    private int carYear;
    private String carType;
    private String carColor;
    private int age;

    public void setYear(int cY)
    {
        carYear = cY;
    }

    public int getYear()
    {
        return carYear;
    }

    public void setType(String cT)
    {
        carType = cT;
    }

    public String getType()
    {
        return carType;
    }

    public void setColor(String cC)
    {
        carColor = cC;
    }

    public String getColor()
    {
        return carColor;
    }

    public String getAgeAndOilChanges()
    {
        age = 2024 - carYear;
        int num = 0;
        for (int i =0; i < age; i++)
        {
            if (((age - i)%3 == 0))
            {
                num++;
            }
        }
        return "The age of the car is " + age + ". The amount of oil changes needed are " + num +".";
    }
}