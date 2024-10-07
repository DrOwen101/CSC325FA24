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

    //constructor for any type of job
    public Job(String companyName, String position, int startDate, int endDate){
        this.companyName = companyName; 
        this.position = position; 
        this.startDate = startDate; 
        this.endDate = endDate;
    }

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

}
