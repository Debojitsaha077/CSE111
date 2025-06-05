public class Playlist{
  String name;
  int count=0;
  Song current = null;
  Song start = null ;
  
  public Playlist(String name){
    this.name = name;
    
    //System.out.print();
    System.out.print(name + "  created .\n");
  }
  
  public void info(){
    System.out.print(name + "  has the following songs: ");
    current = start;
    int count1 =1;
    if(current == null){
      System.out.println("No songs in "+name);
    }
    else{
      while(current != null){
        System.out.print("\nSong- "+ count1+":\nTitle: "+current.title+",  Artist: "+current.artist +"\nLength: "+ current.length+" minutes");
        current = current.next;
        count1++;
      }
    }
  }
  
  public void addSong(Song lat_Song){
    if(start== null){
      start = lat_Song;
      System.out.println(lat_Song.title+" added to "+ name);
      count++;
    }
    else{
      current = start;
      while(true){
        if(current.next!= null){
          current = current.next;
        }
        else{
          current.next = lat_Song;
          //System.out.println();
          System.out.println(lat_Song.title+ " added to "+name);
          count++;
          break;
        }
      }
    }
  }
  
  public void addSong(Song lat_Song, int index){
    current = start;
    
    if(index== 0){
      lat_Song.next = start;
      start= lat_Song;
      count++;
      System.out.println(lat_Song.title+ " added to "+name);
    }
    
    else if(index > count){
      System.out.println("Cannot add song to Index 10.");
    }
    else{
      Song t = start;
      for(int i=0; i<index-1; i++){
        t=t.next;
      }
      
      Song s_t = t.next;
      t.next = lat_Song;
      lat_Song.next = s_t;
      count++;
      System.out.println(lat_Song.title+ " added to "+name);
    }
  }
  public void playSong(String music){
    current = start;
    while(current!= null){
      String temp = current.title;
      if(temp.equals(music)){
        System.out.println("Playing "+ music+ " by "+ current.artist);
        break;
      }
      else{
        if(current.next == null){
          if(!temp.equals(music)){
            System.out.println(music+ " not found in "+ name);
          }
        }
        current = current.next;
      }
    }
  }
  
  
  public void playSong(int index){
    current = start;
    if(index == 0 ){
      System.out.println("Playing "+ current.title+ " by  "+ current.artist); 
    }
    
    else if(index>count){
      System.out.print("Song at index "+ index+ " not found in "+name+ ".\n");
    }
    else{
      for(int i =0; i<index; i++){
        current = current.next;
      }
      System.out.println("Playing "+ current.title+ " by  "+ current.artist);
    }
  }
  
  
  public void deleteSong(String song){
    current = start;
    
    if(start.title.equals(song)){
      start = start.next;
      System.out.println(song+" deleted from "+ name);
      return;
    }
    
    while(current.next!= null){
      if(current.next.title.equals(song)){
        current.next = current.next.next;
        System.out.println(song+ " deleted from "+ name);
        return;
      }
      current=current.next;
    }
    System.out.println(song+" not found in "+name);
  }
  
  
  public int totalSong(){
    current = start;
    int song_count =0;
    while(true){
      if(current.next!= null){
        current= current.next;
        song_count++;
      }
      else{
        song_count++;
        break;
      }
    }
    return song_count;
  }
  public void merge(Playlist p){
    current= start;
    while(current.next!= null){
      current = current.next;
    }
    current.next= p.start;
    System.out.println("Merge Completed!");
  }
}


  
  
      
  

  

        