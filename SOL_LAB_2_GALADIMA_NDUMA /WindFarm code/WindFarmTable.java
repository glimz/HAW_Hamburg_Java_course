import java.util.ArrayList;

/**
 * class WindFarmTable
 *
 * @author (Desmond Nduma)
 */
public class WindFarmTable
{
    // instance variables
    private String windFarmName;
    private double totalCapacity;
    private ArrayList<WindFarm> windFarm;

    /**
     * Constructor for objects of class WindFarmTable
     */
    public WindFarmTable(String windFarmName)
    {
        // initialise instance variables
        this.windFarmName = windFarmName;
        this.totalCapacity = 0.0;
        this.windFarm = new ArrayList<WindFarm>();
    }

    public void addPowerStation(WindFarm powerStation)
    {
        windFarm.add(powerStation);
    }

    public double getTotalPower() 
    {

        for(WindFarm wf : windFarm) {
            totalCapacity += wf.getCapacity();
        }
        return totalCapacity;
    }

    public void printTable() 
    { 
        for(WindFarm wf : windFarm) {
            wf.print();
        }
    }

    public void fillTable(){
        //String name, String country, int numberTurbines, String turbineModel, double turbinePower, int year)
        {
            windFarm.add( new WindFarm("Akkuyu NPP","Turkey", 32, "Model342", 3495, 2022));
            windFarm.add( new WindFarm("Angra NPP III ","Brazil", 32, "Model342", 3495, 2022));
            windFarm.add( new WindFarm("Akkuyu","Nigeria", 32, "Model342", 3495, 2022)); 
            windFarm.add( new WindFarm("Barakah NPP","Ghana", 32, "Model342", 3495, 2022));
        }
        
    }
    // Further methods here, e.g. the getter that returns the PowerPlant in row (index+1):
    public WindFarm get(int index)
    {
        return windFarm.get(index);
    }
    public void listWindFarms(String country){
        
        for(WindFarm count: windFarm){
            
        System.out.print(count);
        
        }
    
    
    }
    public HashSet<WindFarm> findWindFarms(String country){
    
    
    
    
    }
    public void listByCountry(){
    
    }
    
}