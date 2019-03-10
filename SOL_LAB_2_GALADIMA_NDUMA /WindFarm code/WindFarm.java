
/**
 * The wind-farm.
 *
 * @author (Desmond Nduma)
 */
public class WindFarm
{
    // instance variables 
    private String farmName;
    private String country;
    private int numberOfTurbines;
    private String turbineModel;
    private double turbinePower;
    private int year;
    private double capacity;

    /**
     * Constructor for objects of class WindFarm
     */
    public WindFarm(String name, String country, int numberTurbines, String turbineModel, double turbinePower, int year)
    {
        // initialise instance variables
        farmName = name;
        this.country = country;
        this.numberOfTurbines = numberTurbines;
        this.turbineModel = turbineModel;
        this.turbinePower = turbinePower;
        this.year = year;
        capacity = getCapacity();

    }
    /**
     * Calculating the capacity
     */
    public double getCapacity()
    {
        // put your code here
        return numberOfTurbines * turbinePower;
    }

    public void print()
    {
        //System.out.println("|         wind farm          |   Capacity   |       Country        |   year  |");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("| Wind Farm   " + farmName + " | Capacity  " + capacity + " | Country  " + country + " | Year " + year + " | ");
        System.out.println("----------------------------------------------------------------------");
    }
}
