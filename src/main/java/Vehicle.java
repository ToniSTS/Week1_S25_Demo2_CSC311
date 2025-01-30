public class Vehicle {
    int number0fWheels;
    String color;
    float engineSize;
    String fuelType;

    public Vehicle(int number0fWheels, String color, float engineSize,String fuelType) {
        this.number0fWheels = number0fWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;

    }


        public int setNumber0fWheels() {
            return number0fWheels;
        }

        public int getNumber0fWheels(){
            return number0fWheels;
        }

        public String setColor() {
        return color;
        }

        public String getColor(){
            return color;
        }

        public float setEngineSize(){
            return engineSize;
        }

        public float getEngineSize(){
            return engineSize;
        }

        public String setFuelType() {
            return fuelType;
        }

        public String getFuelType(){
            return fuelType;
        }


}
