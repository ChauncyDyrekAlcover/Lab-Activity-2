public class motorcycle extends vehicle{
   
   private String transmissionType;
   
   public motorcycle(String brand, int year, String model,String transmissionType){
       
      super(brand,year, model);
         this.transmissionType= transmissionType;
   
   }
   
   public void displayInfo(){
      super.displayInfo();
      System.out.println("Transmission Type: "+transmissionType);
      System.out.println();
   }





}