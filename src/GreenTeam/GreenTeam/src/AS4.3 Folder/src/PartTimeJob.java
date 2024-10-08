public class PartTimeJob extends Job {

    public PartTimeJob(String companyName, String position, int startDate, int endDate){
        super(companyName, position, startDate, endDate); 
      
    }
    //each subclass inherits attributes and methods from job and implements 
    //each subclass must include two extra methods that extend/enhance
    //the functionality of the inherited methods 
    
    //possible additional methods: 

    //calculateSalary()
    //accounts for hours worked, hourly rate 
    //returns calculated salary as a double value

    //evalLivableWage
    //takes into account personal cost of living/month 
    //uses calculateSalary per month 
    //if cost of living is higher than salary, returns false
    //else true 
}
