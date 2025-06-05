public class BankAccount{
  public int acc =0;
  public String accType ="Not Set";
  
  public void setInfo (int acc, String accType){
    this.acc = acc;
    this. accType =accType;
    System.out.println("Account information updated!");
  }
  
  public String printDetails(){
    return "Account No: "+ acc + "\n"+ "Type : "+accType;
  }
}