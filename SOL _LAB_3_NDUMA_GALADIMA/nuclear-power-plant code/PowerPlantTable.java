import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
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
    private ArrayList<PowerPlant> powerPlant;  
    private boolean tableFilled;
    private HashMap<String, Double> map;
    private HashSet<PowerPlant> set;
    /**
     * Constructor for objects of class PowerPlantTable
     */
    public PowerPlantTable(String powerPlantName)
    {
        // initialise instance variables

        this.powerPlantName = powerPlantName;
        totalCapacity = 0.0;
        powerPlant = new ArrayList<PowerPlant>();
        map = new HashMap<>();
        set = new HashSet<PowerPlant>();
        tableFilled = false;
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

    public void fillTable()
    {
        if(!tableFilled){ 
            powerPlant.add(new PowerPlant(" Akkuyu      ", " Turkey    ", 1014 , 2023  , 1));
            powerPlant.add(new PowerPlant(" Barakah     ",      " UAE       ", 5380 , 2018 , 4));         
            powerPlant.add(new PowerPlant("Belarusian   ",     " Belarus   ", 2218 , 2019,   2));
            powerPlant.add(new PowerPlant("Haiyang	 ",     " China     ", 2000 ,  2018 , 2));
            powerPlant.add(new PowerPlant("Kakrapar     ",     " India     ", 1664 ,   2022 , 4));
            powerPlant.add(new PowerPlant("Karachi       ",    " Pakistan   ", 2118 ,   2021 , 3));
            tableFilled = true;
        }

    }

    public PowerPlant get(int index)
    {
        return powerPlant.get(index);
    }


 public void listWindFarms( String country)
    {
        for(PowerPlant plant : powerPlant) {
            if(plant.getCountry().contains(country)){
                plant.print();
            }
        } 
    }

      public HashSet<PowerPlant> findPowerPlants(String country)
    {
        for(PowerPlant plant : set) {
            if(plant.getCountry() == country){
                set.add(plant);
            }
        } 
        return set;
    }

    public void listByCountry()
    {

        for(PowerPlant plant : set) {            
            System.out.println("Country:" + plant.getCountry() + "\n");          
            plant.print();    
        }
    }
    
 /**
     * Store the total power of farms for each country (key) 
     */
    public HashMap<String, Double> powerByCountry()
    {

        for(PowerPlant plant : set) {
            String country = plant.getCountry();
            if (map.containsKey(plant.getCountry()))

            {
                double currentCapacity = map.get(country);
                map.put(plant.getCountry(), currentCapacity + plant.getCapacity());
            }
            else {
                map.put(plant.getCountry() , plant.getCapacity());
            }   
        }  
        return map;

    }

     /**
     * prints the table of countries together with the total power of power plant of your list in each country.
     */

    public void printCapacity(HashMap<String, Double> map)

    {     
        for (HashMap.Entry<String, Double> entry : map.entrySet()) {

            System.out.println(entry.getKey()+" : "+entry.getValue());

        }

    }

    /**
     * adding all the power plants to the map. 
     */

    public HashMap<String, HashSet<PowerPlant>> mapByCountry()

    {
        HashMap<String, HashSet<PowerPlant>> countryHashMap = new HashMap<>();

        for(PowerPlant pl : set) {

            String country = pl.getCountry();

            if (countryHashMap.containsKey(pl.getCountry()))

            {
                HashSet<PowerPlant> currentName = countryHashMap.get(country);
                currentName.add(pl);
            }
            else
            {

                HashSet<PowerPlant> myHashSet = new HashSet<>();
                myHashSet.add(pl);
                countryHashMap.put(pl.getCountry(), myHashSet);

            }
        }  
        return countryHashMap; 
    }

    /**
     * prints the power plant table  by country 
     */

    public void printMap(HashMap<String, HashSet<PowerPlant>> myHash)

    {

        for (String country : myHash.keySet())
        {
            for (PowerPlant pl : myHash.get(country))
            {
                pl.print();
            }
        }

    }   
}



    

