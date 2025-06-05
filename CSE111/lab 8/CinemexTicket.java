public class CinemexTicket  extends MovieTicket{
  
  String gen, FirstLetterOfSeatType= "", status, seat;
   static int count=0;
  int ticketNo;
  
  public CinemexTicket (String name, String time, String gen, String date){
    super(name, date, time, 0 );
    this.gen =gen;
    this.status= "Not Paid";
    count++;
    this.ticketNo = count;
    this.seat = "Not Selected";
  }
  
  public static int getTotalTickets(){
    return count;
  }
  
  public CinemexTicket (String name, String time, String gen, String date, String seat ){
    super(name, date, time, 0 );
    this.gen =gen;
    this.seat = seat;
    count++;
    this.status= "Not Paid";
    this.ticketNo = count;
    
    if(seat=="Regular" ){
      this.FirstLetterOfSeatType= "R";
    }
    else if(seat=="Premium" ){
      this. FirstLetterOfSeatType= "P";
    }
    else if(seat=="IMAX 3D" ){
      this.FirstLetterOfSeatType= "I";
    }
  }
  
  
  public void calculateTicketPrice(){ 
    for(int i=0; i<3; i++){
      if(seatTypes[i]==seat){
        setPrice(seatPrices [i]);
        break;
        
      }
    }
    
    String[] showhour = showtime.split(":");
    int hour = Integer.parseInt(showhour[0]);
    if(hour >= 18 && hour <= 23){
      double p = getPrice();
      p= p+ p*(nightShowCharge /100.0);
      setPrice(p); 

    }
    
            System.out.println("Ticket price is calculated successfully.");
  }
  
  public String confirmPayment(){
    if(status=="Not Paid"){
      status = "Paid";
      return "Payment Successful.";
    }
    else{
      return "Ticket price is already paid!" ;
    }
  }
  
  
  public String toString() {
    return "Ticket ID: "+getMovie()+"-"+this.FirstLetterOfSeatType+"-"+this.count+ "\nMovie: " + getMovie() + "\nShowtime: " + showtime + "\nDate: " + date+"\nGenre: "+gen+"\nSeat Type: "+ seat+"\nPrice(tk): "+ getPrice()+"\nStatus: "+status;
  }
}














