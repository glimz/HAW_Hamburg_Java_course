
/**
 * Write a description of class PowerPlant here.
 *
 * @author (Galadima Ahmed)
 * @version (a version number or a date)
 */
public class PowerPlant
{
    // instance variables - replace the example below with your own
    private String powerPlant;
    private String country;
    double capacity;
    int connectionYear;
    int units;

    /**
     * Constructor for objects of class PowerPlant
     */
    public PowerPlant(String powerPlant, String country, double capacity, int connectionYear, int units)
    {
        // initialise instance variables
        this.powerPlant = powerPlant;
        this.country = country;
        this.capacity = capacity;
        this.connectionYear = connectionYear;
        this.units = units;
    }
    public double getCapacity()
    {
        // put your code here
        return capacity;
    }

    //printing power plant information
    public void print()
    {
        System.out.println("|  Power Station  |  units  |  Net capacity under construction (MW)| Construction Start |  Country  |");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("|"+powerPlant+"   " +units+"|          " +capacity+ "|                                 "+connectionYear+ "|                         " +country+"|               ");
        System.out.println("-----------------------------------------------------------------------------------------------------");
    }

     public String getCountry()
     {
        
         return country;
        }
    }
