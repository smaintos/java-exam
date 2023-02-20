import java.util.List;

public class Race {
    
    public int MinVehicle;
    public int MaxVehicle;
    public List<Vehicle> AllVehicles;
    public List<Viewer> AllViewers;
    public String ah;

    public Race(int minVehicle, int maxVehicle, List<Vehicle> allVehicles, List<Viewer> allViewers) {
        this.MinVehicle = minVehicle;
        this.MaxVehicle = maxVehicle;
        this.AllVehicles = allVehicles;
        this.AllViewers = allViewers;
    }

    public void AddVehicle(Vehicle vehicle){
        this.AllVehicles.add(vehicle);
    }   
    public void AddViewer(Viewer viewer){
        this.AllViewers.add(viewer);
    }
    public Vehicle[] StartRace(){
        //code non fini
    }
}