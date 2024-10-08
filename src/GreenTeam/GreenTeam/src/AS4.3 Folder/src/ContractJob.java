
public class ContractJob extends Job{

    //constructor class, first calls superclass constructor and then builds 
    public ContractJob(String companyName, String position, int startDate, int endDate){
        super(companyName, position, startDate, endDate); 
      
    }
        //each subclass inherits attributes and methods from job and implements 
    //each subclass must include two extra methods that extend/enhance
    //the functionality of the inherited methods 

    //possible additional methods 
    //calculatePayment(); 
    //checks hourly rate, number of hours worked, any additional bonuses or penalties
    //returns calculated payment as a double 

    //evaluateJobSecurity();
    //Considers contract duration, stability of contracting company, 
    //any termination clauses
    //returns string indicating level of job security "high/medium/low"

    public static void main(String[] args){
        
    }
}
