public class vehicle{
   String brand;
   String model;
   int year;
   
   
   
   vehicle(String brand, int year, String model){
      
      this.brand= brand;
      this.year= year;
      this.model= model;
  
  
  }
   
   void displayInfo(){
        
        System.out.println(brand + " " + model);
        System.out.println("Age: " + year);
        System.out.println("Vintage: " + isVintage()+"\n");
      
   }
   
   int calculateAge(){
      
      year = 2026 - year;
      return year;
   }
   
   boolean isVintage(){
      if(year > 25){
        return true;
      }
      else{
         return false;
      }
     
    }

}