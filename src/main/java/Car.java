public class Car extends Vehicle {

 String brand;

 public void Honk(){
    System.out.println("Honk, honk");
 }
 public void displayInfo(){
     System.out.println("Brand " + brand );
     System.out.println("Number of wheels " + getNumber0fWheels());
     System.out.println("Color " + getColor());
     System.out.println("Engine Size " + getEngineSize());
     System.out.println("Fuel Type " + getFuelType());


 }
}
