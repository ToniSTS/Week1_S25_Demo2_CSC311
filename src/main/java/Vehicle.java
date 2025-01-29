public class Vehicle {

        int number0fWheels;
        String color;
        float engineSize;
        String fuelType;

        public int setNumber0fWheels () {
        return number0fWheels;
        }

        public int getNumber0fWheels(int number0fwheels){
            this.number0fWheels = number0fwheels;
            return number0fwheels;
        }

        public String setColor() {
        return color;
        }

        public String getColor(String Color){
        this.color = color;
        return color;
        }

        public float setEngineSize(){
            return engineSize;
        }
        public float getEngineSize(float engineSize){
            this.engineSize = engineSize;
            return engineSize;
        }

        public String setFuelType() {
            return fuelType;
        }
        public String getFuelType(){
            this.fuelType = fuelType;
            return fuelType;
        }


}
