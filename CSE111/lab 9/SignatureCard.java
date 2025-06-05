public class SignatureCard  extends CreditCard {
  
  
  public SignatureCard (String nm, String ac ){
    super(nm,ac, 200);
  }
  
  public void spendCash(int cash){
     rewardPoints= rewardPoints+ ((cash*4)/100);
    System.out.println("Previous Reward Points: "+200 + "\nReward points after spending "+ cash +"taka: "+rewardPoints);
  }
  
  public void cardDetails(){
    super. cardDetails();
    System.out.println("Possible Number of Companions for Lounge: 5");
  }
}
