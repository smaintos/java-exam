import java.util.Random;

public class Kart extends Vehicle {

    static int Speed = new Random().nextInt(5, 10 + 1);
    static int Adhesion = new Random().nextInt(5, 10 + 1);

    public Kart(String pilotName) {
        super(Speed, Adhesion, pilotName);
    }

    public String toString(){
        String stateSpeed = "";
        String stateAdhesion = "";
        if (Kart.Speed == 1 || Kart.Speed == 2){
            stateSpeed = "slow";
        } else if (Kart.Speed == 3 || Kart.Speed == 4){
            stateSpeed = "rather slow";
        } else if (Kart.Speed == 5 || Kart.Speed == 6) {
            stateSpeed = "rather fast";
        } else if (Kart.Speed == 7 || Kart.Speed == 8) {
            stateSpeed = "fast";
        } else if (Kart.Speed == 9 || Kart.Speed == 10) {
            stateSpeed = "very fast";
        }
        if (Kart.Adhesion == 1 || Kart.Adhesion == 2){
            stateAdhesion = "barely sticks to the ground";
        } else if (Kart.Adhesion == 3 || Kart.Adhesion == 4){
            stateAdhesion = "sticks to the ground";
        } else if (Kart.Adhesion == 5 || Kart.Adhesion == 6) {
            stateAdhesion = "grips the ground quite well";
        } else if (Kart.Adhesion == 7 || Kart.Adhesion == 8) {
            stateAdhesion = "adheres well to the ground";
        } else if (Kart.Adhesion == 9 || Kart.Adhesion == 10) {
            stateAdhesion = "adheres perfectly to the ground";
        }
        return "This KART is " + stateSpeed + ", it has a " + Kart.Speed + " speed statelue, and it " + stateAdhesion + " with a " + Kart.Adhesion + " statelue of adhesion";
    }

}