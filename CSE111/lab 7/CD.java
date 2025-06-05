public class CD extends Product{
  int du ;
  String band, gen;
  
  
  public CD (int id, String title, int price,String band, int du, String gen  ){
    super(id, title, price);
    this. du= du;
    this.gen = gen;
  }
  
  public String printDetail(){
    return getIdTitlePrice() + " Duration: "+ du+ " minutes Genre: "+ gen;
  }
}
