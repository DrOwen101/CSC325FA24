

public class JusticeNobackCar {
    //variables listed from part b
    private String Type;
    private String Color;
    private int Year;

    //below is the constructor for the above class
    public JusticeNobackCar(String Type, String Color, int Year) {
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

    public int getYear() {
        return Year;
    }
    public void setYear(int Year) {
        this.Year = Year;
    }

    public void ageAndOilChange() {
        //getting car age
        int Age = 2024 - this.Year;
        //getting number of oil changes using division
        int OilChange = Math.max(0, Age / 3);

        System.out.print("Vehicle is " + Age + " years old.");
        
        //if loop for oil change
        if (OilChange > 0) {
            System.out.print("This Vehicle requires an oil change. Oil changes need: " + OilChange);
        }
        if (OilChange == 0) {
            System.out.print("This vehicle does not require an oil change.");
        }
        }

}












