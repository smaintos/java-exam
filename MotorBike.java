import java.util.Random;

public class MotorBike extends Vehicle {

    static int Speed = new Random().nextInt(5, 10 + 1);
    static int Adhesion = new Random().nextInt(1, 5 + 1);

    public MotorBike(String pilotName) {
        super(Speed, Adhesion, pilotName);
    }

    public String toString(){
        String stateSpeed = "";
        String stateAdhesion = "";
        if (MotorBike.Speed == 1 || MotorBike.Speed == 2){
            stateSpeed = "slow";
        } else if (MotorBike.Speed == 3 || MotorBike.Speed == 4){
            stateSpeed = "rather slow";
        } else if (MotorBike.Speed == 5 || MotorBike.Speed == 6) {
            stateSpeed = "rather fast";
        } else if (MotorBike.Speed == 7 || MotorBike.Speed == 8) {
            stateSpeed = "fast";
        } else if (MotorBike.Speed == 9 || MotorBike.Speed == 10) {
            stateSpeed = "very fast";
        }
        if (MotorBike.Adhesion == 1 || MotorBike.Adhesion == 2){
            stateAdhesion = "barely sticks to the ground";
        } else if (MotorBike.Adhesion == 3 || MotorBike.Adhesion == 4){
            stateAdhesion = "sticks to the ground";
        } else if (MotorBike.Adhesion == 5 ) {
            stateAdhesion = "grips the ground quite well";
        }
        return "This MotorBike is " + stateSpeed + ", it has a " + MotorBike.Speed + " speed statelue, and it " + stateAdhesion + " with a " + MotorBike.Adhesion + " statelue of adhesion";
    }

}