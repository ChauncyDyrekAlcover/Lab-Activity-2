public class Main{
   public static void printAll(vehicle vehicle){
      vehicle.displayInfo();
        
   
   }   
   public static void main(String[] args){
     
     
                
      vehicle c1=new car("Toyota",2011,"Furtuner",4); 
            
             printAll(c1);
             
      c1= new motorcycle("ADV",2022," alveywashu","CVT");
            printAll(c1);
      c1=new truck("Ford",2018,"F-series",4);
            printAll(c1);
            
            
            
       System.out.println("One method different types: ");
       
       car luxury= new car("GTR",1969,"Hakosuka",4);
         printAll(luxury);
       motorcycle motor=new motorcycle("Honda",2021,"Beat","CVT");
         printAll(motor);
       truck saks= new truck("Ford",2024,"Raptor",4);
         printAll(saks);       
       
       System.out.println("Mixed arrays");
       
       vehicle[] washu={
         new car("Toyota",2011,"Furtuner",4),
         new motorcycle("Raider",2018,"150","6-speed constant mesh"),
         new truck("Nissan",2010,"Frontier",4)
       };
       for(vehicle coll: washu){
            printAll(coll);  
            System.out.println();
         }
       
   }
}