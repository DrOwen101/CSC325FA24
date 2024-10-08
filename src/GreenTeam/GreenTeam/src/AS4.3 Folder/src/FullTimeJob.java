public class FullTimeJob extends Job{

    public FullTimeJob(String companyName, String position, int startDate, int endDate){
        super(companyName, position, startDate, endDate); 
      
    }
    //each subclass inherits attributes and methods from job and implements 
    //each subclass must include two extra methods that extend/enhance
    //the functionality of the inherited methods 

    //extra methods possible: 
    //calculateSalary() 
    //calculates monthly salary based on full-time job 
    //takes into account hourly wage, num of hours per week, overtime 
    //returns calculated salary as a double value

    //evaluateWorkLifeBalance()
    //considers number of working hours per week, flexibility of schedule,
    //additional stress factors
    //Returns a string indicating level of work-life balance "excellent, moderate, poor"

    
    public static void main(String[] args){
        
    }
    
}
