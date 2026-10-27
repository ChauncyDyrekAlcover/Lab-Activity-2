public class vehicle{
   
   private String brand;
   private String model;
   private int year;
   
   
   
   vehicle(String brand, int year, String model){
      
      this.brand= brand;
      this.year= year;
      this.model= model;
  
  
  }
  public void displayInfo(){
      System.out.println("Brand: "+brand);
      System.out.println("Model:"+ model);
      System.out.println("Year: "+year);
      System.out.println("Age: "+calculateAge());
      System.out.println("isVintage: "+ isVintage());
      
  }   
   
   public String getBrand(){
           return brand;
   }
     
   public int getYear(){
           return year;
   }
   public String getModel(){
           return model;
   }
   
   public int calculateAge(){
      year= 2026 - year;
      return year;
   }
   
   public boolean isVintage(){
      /*if(year >= 25){
        return true;
      }
      else{
         return false;
      }
      */
      return calculateAge() <=25;
     
    }

}