import java.util.Scanner;

public class JahzaraBroasterCar 
{
    String CarType;
    String CarColor;
    int CarYear;

    // Constructor with parameters
    public JahzaraBroasterCar(String CarType, String CarColor, int CarYear) 
    {
        this.CarType = CarType;
        this.CarColor = CarColor;
        this.CarYear = CarYear;
    }

    // No-argument constructor
    public JahzaraBroasterCar() 
    {

    }

    public String getCarType() 
    {
        return CarType;
    }
    public void setCarType(String CarType) 
    {
        this.CarType = CarType;
    }

    public String getCarColor() 
    {
        return CarColor;
    }
    public void setCarColor(String CarColor) 
    {
        this.CarColor = CarColor;
    }

    public int getCarYear() {
        return CarYear;
    }
    public void setCarYear(int CarYear) 
    {
        this.CarYear = CarYear;
    }

    public int CarCalculation() 
    {
        int CurrentYear = 2024;
        int OilChanges = 0;
        int years = CurrentYear - this.CarYear;

        // Calculate the number of oil changes
        for (int i = 0; i < years; i += 3) 
        {
            OilChanges++;
        }

        return OilChanges;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        JahzaraBroasterCar car = new JahzaraBroasterCar();

        System.out.print("Enter the car type: ");
        car.setCarType(input.nextLine());

        System.out.print("Enter the car color: ");
        car.setCarColor(input.nextLine());

        System.out.print("Enter the car year: ");
        car.setCarYear(input.nextInt());
        input.nextLine();

        // Call method to calculate oil changes
        int oilChanges = car.CarCalculation();

        // Output car info
        System.out.println("********************************");
        System.out.println("*        Car Information       *");
        System.out.println("********************************");
        System.out.println(" Car Type: " + car.getCarType());
        System.out.println(" Car Color: " + car.getCarColor());
        System.out.println(" Car Year: " + car.getCarYear());
        System.out.println(" Oil Changes Needed: " + oilChanges);
        System.out.println("********************************");

        input.close();
    }
}
