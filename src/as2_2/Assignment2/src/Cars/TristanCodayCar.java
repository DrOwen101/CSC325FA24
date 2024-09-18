package Cars;
public class TristanCodayCar {
   private String Cartype;
   private String CarColor;
   private int CarYear;

   //getter and setter for car color
   public String getCarColor()
   {

       return CarColor;
   }

   //getter and setter for Car type
   public String getCarType()
   {
        return Cartype;

   }

   //getter and setter for car year
   public int getCarYear()
   {
        return CarYear;
   }
   
   //the method for calculation of car age and the number of oil changes
   public String calCarAgeandOilChanges()
   {
     int CarAge = 2024 - CarYear;
     int OilChanges = 0;

     for (int i = 3;  i <= CarAge; i += 3)
     {
          OilChanges++;
     }
          return "Coday: A car this age" + CarAge + ",normally had this many oil changes" + OilChanges; 
   }
}
