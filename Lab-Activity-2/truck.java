public class truck extends vehicle{
   private int numberOfDoors;
   
   public truck(String brand, int year, String model,int numberOfDoors){
      
      super(brand,year, model);
         this.numberOfDoors= numberOfDoors;
   
   }
   
   public void displayInfo(){
      super.displayInfo();
      System.out.println("Doors: "+numberOfDoors);
      System.out.println();
   }





}