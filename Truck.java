import java.util.Random;

public class Truck extends Vehicle {

    static int Speed = new Random().nextInt(1, 5 + 1);
    static int Adhesion = new Random().nextInt(5, 10 + 1);

    public Truck(String pilotName) {
        super(Speed, Adhesion, pilotName);
    }

    public String toString(){
        String stateSpeed = "";
        String stateAdhesion = "";
        if (Truck.Speed == 1 || Truck.Speed == 2){
            stateSpeed = "slow";
        } else if (Truck.Speed == 3 || Truck.Speed == 4){
            stateSpeed = "rather slow";
        } else if (Truck.Speed == 5 ) {
            stateSpeed = "rather fast";
        } 
        if (Truck.Adhesion == 1 || Truck.Adhesion == 2){
            stateAdhesion = "barely sticks to the ground";
        } else if (Truck.Adhesion == 3 || Truck.Adhesion == 4){
            stateAdhesion = "sticks to the ground";
        } else if (Truck.Adhesion == 5 || Truck.Adhesion == 6) {
            stateAdhesion = "grips the ground quite well";
        } else if (Truck.Adhesion == 7 || Truck.Adhesion == 8) {
            stateAdhesion = "adheres well to the ground";
        } else if (Truck.Adhesion == 9 || Truck.Adhesion == 10) {
            stateAdhesion = "adheres perfectly to the ground";
        }
        return "This Truck is " + stateSpeed + ", it has a " + Truck.Speed + " speed statelue, and it " + stateAdhesion + " with a " + Truck.Adhesion + " statelue of adhesion";
    }

}
