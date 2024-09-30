

abstract class Job {
    //basic attributes: 
    //company name, position, startdate, enddate
    String companyName; 
    String position; 
    int startDate; 
    int endDate; 

    //Three methods that perform distinct actions 
    //displayjobdetails
    //calculatingjobduration 
    //assessJobSatisfaction
    void displayJobDetails(){
        String info = "Company name: " + companyName + "\tPosition: " + position + "\tStarting Date: " + startDate + "\tEnding date: " + endDate;
        System.out.println(info);
    }

    int calculateJobDuration(){
        int jobDuration = endDate - startDate; 
        return jobDuration; 
    }

    void assessJobSatisfaction(){
        //TODO build method later 
    }
    

    //three subclasses: 
    //FullTimeJob
    //PartTimeJob
    //ContractJob 
    //each subclass inherits attributes and methods from job and implements 
    //each subclass must include two extra methods that extend/enhance
    //the functionality of the inherited methods 

    //create an employee class that maintains a history of the employee's jobs 
    //include methods:
    //add job to employee history 
    //retrieve job details
    //calculate relevant statistics (work experience, job satisfaction)

    //testing stage
    //create employee object
    //add instances representing different jobs to the employee's job history 
    //invoke methods to display job details, calculate job duration, and evaluate job satisfaction 


}
