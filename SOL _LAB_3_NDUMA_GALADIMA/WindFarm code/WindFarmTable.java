import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
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
    private boolean tableFilled;
    private HashMap<String, Double> map;
    private HashSet<WindFarm> set;

    /**
     * Constructor for objects of class WindFarmTable
     */
    public WindFarmTable(String windFarmName)
    {
        // initialise instance variables
        this.windFarmName = windFarmName;
        totalCapacity = 0.0;
        windFarm = new ArrayList<WindFarm>();
        tableFilled = false;
        map = new HashMap<>();
        set = new HashSet<WindFarm>();

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

    public void fillTable()
    {
        if(!tableFilled){
            windFarm.add( new WindFarm( "London Array         ","United Kingdom       ", 175 ,"  Siemens SWT ", 3.6, 2013 ));
            windFarm.add( new WindFarm(" Geremi Wind Farm         ","Netherlands       ", 150, "   Siemens SWT " ,4.0, 2017 ));
            windFarm.add( new WindFarm( "Greater Gabbard wind farm        ","United Kingdom      ", 140, "  Siemens SWT ", 3.6, 2012));
            windFarm.add( new WindFarm( "Anholt        ","Denmark       ", 111 ,"  Siemens SWT ", 3.6, 2013 ));
            windFarm.add( new WindFarm("BARD Offshore 1        ","Germany       ", 80, "  BARD " ,5.0, 2013 ));
            windFarm.add( new WindFarm( "Rampion Wind Farm         ","United Kingdom      ", 116, "   Siemens SWT ", 3.45, 2018));
            tableFilled = true;
        }
    }

    public WindFarm get(int index)
    {
        return windFarm.get(index);
    }

    public void listWindFarms( String country)
    {
        for(WindFarm wf : windFarm) {
            if(wf.getCountry().contains(country)){
                wf.print();
            }
        } 
    }

    public HashSet<WindFarm> findWindFarms(String country)
    {
        for(WindFarm wf : set) {
            if(wf.getCountry() == country){
                set.add(wf);
            }
        } 
        return set;
    }
/**
 *  iterating through  table and first print the country before printing the full information for each wind farm
 */
    
    public void listByCountry()

    {

        for(WindFarm wf : set) {            
            System.out.println("Country:" + wf.getCountry() + "\n");          
            wf.print();    
        }
    }

    /**
     * Store the total power of farms for each country (key) 
     */
    public HashMap<String, Double> powerByCountry()
    {

        for(WindFarm wf : set) {
            String country = wf.getCountry();
            if (map.containsKey(wf.getCountry()))

            {
                double currentCapacity = map.get(country);
                map.put(wf.getCountry(), currentCapacity + wf.getCapacity());
            }
            else {
                map.put(wf.getCountry() , wf.getCapacity());
            }   
        }  
        return map;

    }

    /**
     * prints the table of countries together with the total power of wind farms of your list in each country.
     */

    public void printCapacity(HashMap<String, Double> map)

    {     
        for (HashMap.Entry<String, Double> entry : map.entrySet()) {

            System.out.println(entry.getKey()+" : "+entry.getValue());

        }

    }

    /**
     * adding all the windfarms to the map. 
     */

    public HashMap<String, HashSet<WindFarm>> mapByCountry()

    {
        HashMap<String, HashSet<WindFarm>> countryHashMap = new HashMap<>();

        for(WindFarm farm : set) {

            String country = farm.getCountry();

            if (countryHashMap.containsKey(farm.getCountry()))

            {
                HashSet<WindFarm> currentName = countryHashMap.get(country);
                currentName.add(farm);
            }
            else
            {

                HashSet<WindFarm> myHashSet = new HashSet<>();
                myHashSet.add(farm);
                countryHashMap.put(farm.getCountry(), myHashSet);

            }
        }  
        return countryHashMap; 
    }

    /**
     * prints the farm table by country
     */

    public void printMap(HashMap<String, HashSet<WindFarm>> myHash)

    {

        for (String country : myHash.keySet())
        {
            for (WindFarm farm : myHash.get(country))
            {
                farm.print();
            }
        }

    }   
}


