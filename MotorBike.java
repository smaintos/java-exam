import java.util.Random;

public class MotorBike extends Vehicle {

    static int Speed = new Random().nextInt(5, 10 + 1);
    static int Adhesion = new Random().nextInt(5, 10 + 1);

    public MotorBike(String pilotName) {
        super(Speed, Adhesion, pilotName);
    }

    public String toString(){
        String vaSpeed = "";
        String vaAdhesion = "";
        if (MotorBike.Speed == 1 || MotorBike.Speed == 2){
            vaSpeed = "slow";
        } else if (MotorBike.Speed == 3 || MotorBike.Speed == 4){
            vaSpeed = "rather slow";
        } else if (MotorBike.Speed == 5 || MotorBike.Speed == 6) {
            vaSpeed = "rather fast";
        } else if (MotorBike.Speed == 7 || MotorBike.Speed == 8) {
            vaSpeed = "fast";
        } else if (MotorBike.Speed == 9 || MotorBike.Speed == 10) {
            vaSpeed = "very fast";
        }
        if (MotorBike.Adhesion == 1 || MotorBike.Adhesion == 2){
            vaAdhesion = "barely sticks to the ground";
        } else if (MotorBike.Adhesion == 3 || MotorBike.Adhesion == 4){
            vaAdhesion = "sticks to the ground";
        } else if (MotorBike.Adhesion == 5 || MotorBike.Adhesion == 6) {
            vaAdhesion = "grips the ground quite well";
        } else if (MotorBike.Adhesion == 7 || MotorBike.Adhesion == 8) {
            vaAdhesion = "adheres well to the ground";
        } else if (MotorBike.Adhesion == 9 || MotorBike.Adhesion == 10) {
            vaAdhesion = "adheres perfectly to the ground";
        }
        return "This MotorBike is " + vaSpeed + ", it has a " + MotorBike.Speed + " speed value, and it " + vaAdhesion + " with a " + MotorBike.Adhesion + " value of adhesion";
    }

}