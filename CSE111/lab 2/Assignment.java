public class Assignment{
  public int tasks=0 ;
  public String difficulty = "null";
  public boolean submission  = false;
  
  

    public void printDetails (){
      this.tasks= tasks;
      this.difficulty =difficulty;
      this.submission= submission;
    System.out.println("Number of tasks: "+ tasks +"\n"+"Difficulty level:  "+difficulty+"\n"+"Submission required: "+ submission);
  }
    
    public String makeOptional (){
      if(submission){
        return "Assignment will not require submission";
      }
      else{
        return "Submission is already not required";
      }
    }
//    return;
}
        
  
  