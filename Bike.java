import java.util.Random;

public class Bike extends Vehicle {

    static int Speed = new Random().nextInt(1, 5 + 1);
    static int Adhesion = new Random().nextInt(1, 5 + 1);

    public Bike(String pilotName) {
        super(Speed, Adhesion, pilotName);
    }

    public String toString(){
        String stateSpeed = "";
        String stateAdhesion = "";
        if (Bike.Speed == 1 || Bike.Speed == 2){
            stateSpeed = "slow";
        } else if (Bike.Speed == 3 || Bike.Speed == 4){
            stateSpeed = "rather slow";
        } else if (Bike.Speed == 5 ) {
            stateSpeed = "rather fast";
        } 
        if (Bike.Adhesion == 1 || Bike.Adhesion == 2){
            stateAdhesion = "barely sticks to the ground";
        } else if (Bike.Adhesion == 3 || Bike.Adhesion == 4){
            stateAdhesion = "sticks to the ground";
        } else if (Bike.Adhesion == 5 ) {
            stateAdhesion = "grips the ground quite well";
        } 
        return "This Bike is " + stateSpeed + ", it has a " + Bike.Speed + " speed statelue, and it " + stateAdhesion + " with a " + Bike.Adhesion + " statelue of adhesion";
    }

}