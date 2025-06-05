public class PlatinumCard extends CreditCard {
  
  public PlatinumCard(String nm, String ac ){
    super(nm,ac,100);
  }
  
  public void spendCash(int cash){
     rewardPoints += ((cash*2)/100);
      System.out.println("Previous Reward Points: "+100+ "\nReward points after spending "+ cash +"taka: "+rewardPoints);
  }
}
 
    