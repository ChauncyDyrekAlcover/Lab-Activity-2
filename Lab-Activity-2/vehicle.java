public class vehicle{
   String brand;
   String model;
   int year;
   
   
   
   vehicle(String brand, int year, String model){
      
      this.brand= brand;
      this.year= year;
      this.model= model;
  
  
  }
   
   public String getBrand(){
      System.out.println("Brand: "+brand);
      return brand;
   }
   public int setYear(int year){
      this.year= year;
      return year;
   }
   public int getYear(){
      System.out.println("Year: "+year);
      return year;
   }
   public String getModel(){
      System.out.println("Model: "+model);
      return model;
   }
   
   public int calculateAge(){
      year= 2026 - year;
      System.out.println("Age: "+ year);

      return year;
   }
   
   public boolean isVintage(){
      if(year > 25){
        return true;
      }
      else{
         return false;
      }
      
     
    }

}