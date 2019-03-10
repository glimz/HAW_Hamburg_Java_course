import java.util.ArrayList;
/**
 * Write a description of class PowerPlantTable here.
 * Lab 2
 *
 * @author (Galadima Ahmed)
 * @version (version 2)
 */
public class PowerPlantTable
{
    // instance variables - replace the example below with your own
    
    private String powerPlantName;
    private double totalCapacity;
    private ArrayList<PowerPlant>powerPlant;
    /**
     * Constructor for objects of class PowerPlantTable
     */
    public PowerPlantTable(String powerPlant)
    {
        // initialise instance variables
        
        this.powerPlantName = powerPlantName;
        this.totalCapacity = 0;
        this.powerPlant = new ArrayList<PowerPlant>();
    }
    public void addPowerStation(PowerPlant powerStation)
    {
        powerPlant.add(powerStation);
    }
    public double getTotalPower()
    {
        //sum of all capacity
        for(PowerPlant plant : powerPlant){
        totalCapacity += plant.getCapacity();
    }
    return totalCapacity;
    }
    
    public void printTable()
    {
    //print Table
    for(PowerPlant plant : powerPlant){
        plant.print();
    }
    }
}
