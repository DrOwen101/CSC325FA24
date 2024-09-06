public class JacksonBradleyCar {
private String carType,carColor;
private int carYear;

public JacksonBradleyCar(String carType, String carColor, int carYear) {
    this.carType = carType;
    this.carColor = carColor;
    this.carYear = carYear;
}

public String oilChangeNeeded() {
    int currentYear = 2024;
    int carAge = currentYear - carYear;
    int oilChanges = 0;

    for (int i = 0; i < carAge; i += 3) {
        oilChanges++;
    }

    return carAge + " year old car, should have had " + oilChanges + " oil changes.";
}


    

 public void setCarType(String type)
 {
type = carType;
 }
public void setCarYear(int y)
{
y=carYear;
}
public void setColor(String color)
{
color = carColor;
}

public int getCarYear()
{
return carYear;
}
public String getColor()
{
return carColor;
}

public String getCarType()
{
    return carType;
}
}
