public class Main{
   public static void main(String[] args){
     
     vehicle v1= new vehicle("Toyota",2011,"Furtuner");
             v1.getBrand();
             v1.getYear();
             v1.getModel();
             v1.calculateAge();
             System.out.println("isVintage: "+v1.isVintage());
        
   }
}