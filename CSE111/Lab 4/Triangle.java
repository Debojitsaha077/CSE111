public class  Triangle {
  int base,hei, wid,peri;
  
  public Triangle (int base, int hei, int wid){
    this. base= base;
    this.hei = hei;
    this. wid = wid;
  }
  
  public void triangleDetails(){
    peri= base + wid+ hei;
    System.out.println("Three sides of the triangle are: "+base+","+hei+","+wid+"\nPerimeter: "+peri);
  }
  
  public String printTriangleType(){
    if(base==hei&& wid== hei&& base==wid){
      return "This is an Equilateral Triangle.";
    }
    else if(base==hei|| wid==hei|| base==wid){
      return "This is an Isosceles Triangle.";
    }
    else{
      return "This is a Scalene Triangle.";
    }
  }
  
  public void compareTrinagles(Triangle obj){
    int peri2 = obj.hei+obj.wid+obj.base;   
    
    if(this== obj){
      System.out.println("These two triangle objects have the same address.");
    }
    else{
      boolean lenCheck =(obj.base==base&& obj.wid== wid&& obj.base==base);
      boolean periCheck =( peri == obj.peri);
      
      if(lenCheck){
        System.out.println("Addresses are different but the sides of the triangles are equal.");
    }
      else if(periCheck){
        System.out.println("Only the perimeter of both triangles is equal.");
    }
      else{
        System.out.println("Addresses, length of the sides and perimeter all are different.");
    }
    }
  }
}

        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    if(this!= obj){
//      System.out.println("These two triangle objects have the same address.");
//      if(obj.base!=base&& obj.wid!= wid&& obj.base!=base){
//        if(peri!= peri2){
//          System.out.println("Addresses, length of the sides and perimeter all are different.");
//        }
//        else{
//          System.out.println("Only the perimeter of both triangles is equal.");
//        }
//      }
//      else{
//        System.out.println("Addresses are different but the sides of the triangles are equal.");
//      }
//    }
//      else{
//        System.out.println("Addresses are different ");
//      }
//  }
//}
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
//      if(this== obj){
//        System.out.println("These two triangle objects have the same address.");
//      }
//      else if(this!= obj){
//        if(obj.base==base&& obj.wid== wid&& obj.base==base){
//          System.out.println("Addresses are different but the sides of the triangles are equal.");
//        }
//      }
//      else if(this!= obj){
//        if(obj.base!=base|| obj.wid!= wid|| obj.base!=base){
//          if(peri!= peri2){
//            System.out.println("Addresses, length of the sides and perimeter all are different.");                                                           
//          }
//        }
//      }
//      else if(peri== peri2){
//        System.out.println("Only the perimeter of both triangles is equal.");                                                            
//      }
//    }
//  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
