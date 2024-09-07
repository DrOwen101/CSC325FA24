

public class JusticeNobackCar {
    //variables listed from part b
    private String Type;
    private String Color;
    private Int Year;

    //below is the constructor for the above class
    public JusticeNobackCar(String Type, String Color, Int Year) {
        this.Type = Type;
        this.Color = Color;
        this.Year = Year;
    }

    //Getter and Setter for each variable grouped and listed below
    public String getType() {
        return Type;
    }
    public void setType(String Type) {
        this.Type = Type;
    }

    public String getColor() {
        return Color;
    }
    public void setColor(String Color) {
        this.Color = Color;
    }

    public Int getYear() {
        return Year;
    }
    public Int setYear(Int Year) {
        this.Year = Year;
    }

    public String ageAndOilChange() {
        Int Age = 2024 - this.Year;
        Int OilChange = Math.max(0, age / 3);

        System.out.print("Vehicle is " + Age + " years old.");
        
        if (OilChange > 0) {
            System.out.print("This Vehicle requires an oil change. Oil changes need: " + OilChange);
        }
        if (OilChange == 0) {
            System.out.print("This vehicle does not require an oil change.");
        }
        }

}












