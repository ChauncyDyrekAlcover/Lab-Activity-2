public class vehicle{
   String brand;
   String model;
   int year;
   int age= 0;
   
   void displayInfo(){
        calculateAge();
        System.out.println(brand + " " + model);
        System.out.println("Age: " + age);
        System.out.println("Vintage: " + isVintage()+"\n");
      
   }
   
   int calculateAge(){
      
      age = 2026 - year;
      return age;
   }
   
   boolean isVintage(){
      if(age > 25){
        return true;
      }
      else{
         return false;
      }
     
    }

}