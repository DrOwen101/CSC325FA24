public class PartTimeJob extends Job {

    public PartTimeJob(String companyName, String position, int startDate, int endDate){
        super(companyName, position, startDate, endDate); 
      
    }
    //each subclass inherits attributes and methods from job and implements 
    //each subclass must include two extra methods that extend/enhance
    //the functionality of the inherited methods 
    
    //possible additional methods: 
    public double calculateSalary(int hourly, int hoursPerWeek){
        double payment = (hourly*hoursPerWeek);

        //internet statistic: avg amt of working days in one year is 260
        //assuming that the part time job lasts through the year 
        int numWeeksWorked = 260/7;
        double salary = payment *numWeeksWorked; 
        return salary; 
    }

    //evalLivableWage
    //takes into account personal cost of living/month 
    //uses calculateSalary per month 
    //if cost of living is higher than salary, returns false
    //else true 

    public String liveableWage(int costOfLiving, int hourly, int hoursPerWeek){
        //cost of living is assumed to be a permonth number 
        String livable = "";
        double monthlySalary = calculateSalary(hourly, hoursPerWeek) / 12; 

        if (monthlySalary > costOfLiving){
            livable = "The calculated salary is livable.";
        }else{
            livable = "The calculated salary is not livable.";
        }
        return livable;
    }
}
