package patterns.builder.car;

/**
 * @author YWeber
 * project DesignPatterns
 * Created on 29.01.19
 */
public class Car {

    private final String makeCar;
    private final Transmission transmission;
    private final int maxSpeed;

    private Car(String makeCar, Transmission transmission, int maxSpeed) {
        this.makeCar = makeCar;
        this.transmission = transmission;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "makeCar='" + makeCar + '\'' +
                ", transmission=" + transmission +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public static class Builder{

        private String makeCar = "default";
        private Transmission transmission = Transmission.MANUAL;
        private int maxSpeed = 120;


        public Builder() {
        }

        public Builder makeCar(String make){
            this.makeCar = make;
            return this;
        }

        public Builder transmission(Transmission transmission){
            this.transmission = transmission;
            return this;
        }

        public Builder maxSpeed(int maxSpeed){
            this.maxSpeed = maxSpeed;
            return this;
        }


        public Car build(){
            return new Car(makeCar,transmission,maxSpeed);
        }


    }

}
