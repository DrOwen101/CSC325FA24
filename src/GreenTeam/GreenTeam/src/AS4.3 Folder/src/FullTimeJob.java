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
    public double calculateSalary(int hourly, int hoursPerWeek, double overtimeHours){
        //overtime pay going to be considered time and a half
        double overtimeModifier = 1.5;
        double payment = (hourly*hoursPerWeek) + (overtimeHours*overtimeModifier);

        //internet statistic: avg amt of working days in one year is 260
        int numWeeksWorked = 260/7; 
        double salary = payment *numWeeksWorked; 
        return salary; 
    }

    //evaluateWorkLifeBalance()
    //considers number of working hours per week, flexibility of schedule,
    //additional stress factors
    //Returns a string indicating level of work-life balance "excellent, moderate, poor"
    //TODO edit method later. Has just been copied
    public String evaluateJobSecuString(){
        String response = ""; 

        //caculates contract duration 
        int contractDuration = calculateJobDuration(); 
        
        //parameters for stability of company 
        System.out.println("Does your company have a good relationship with its workers? Is there room for career growth? 1 for no, 0 for yes.");
        int healthyCompany = scnr.nextInt(); 

        System.out.println("Does your contract have termination clauses? 1 for no, 0 for yes.");
        int termination = scnr.nextInt(); 

        //decides if job security is high, medium or low
        if(contractDuration >= 365 && healthyCompany > 0 && termination > 0){
            response = "High";
        }else if ((contractDuration >= 365 && healthyCompany >0) || (contractDuration >= 365 && termination >0) || (termination > 0 && healthyCompany >0)){
            response = "Medium";
        }else{
            response = "Low";
        }
    
        return response; 
    }
    

    
}
