public class Song{
  String title, artist;
  int length;
  Song next;
  
  public Song(String title,String artist,int length){
    this.title = title;
    this.artist = artist;
    this.length = length;
    next = null;
  }
    
    public void songInfo(){
      System.out.println("Title: "+ title+ "  Artist: "+ artist+ "\n"+"Length: "+ length+ " minutes");
    }
  }

 


  