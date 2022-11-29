import java.util.GregorianCalendar;
/**
 *  Class that extends the Animal abstract class
 *  @author  Daniil Belousov id 2491827
 *  @version 1.2, 27.11.22
 */
public class Cow extends Animal{
     //the number which represents the cows tag and as well displays the number of instances this class ever had
    // during the running process, this helps to identify the cow and not ever repeat the same tag for two instances
    private double weight;

    /**
     * Constructor if we know everything about the cow
     * @param gender gender of the cow
     * @param dateOfBirth date the cow was born
     * @param purchased information of the cows type: purchased or raised on the farm
     */
    Cow(String gender,GregorianCalendar dateOfBirth, boolean purchased,double weight){
        setGender(gender);
        setDateOfBirth(dateOfBirth);
        setPurchased(purchased);
        this.weight=weight;
    }

    /**
     * returns the weight of a specific cow
     * @return cow weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * sets the weight of a specific cow
     * @param weight cow weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Displays the feeding of the specific cow
     */
    public void feeding(){
        int age = getAge();
        double weight = getWeight();
        if (age<=3){
            System.out.println("Feeding: only grass");
        }
        else if (age>=5 && weight<=500){
            System.out.println("Feeding: Total Mixed ratio including: \n\tHay \n\tFermented grass \n\tMaize silage \n\tHigh energy grains:\n\t\tBrewes grains\n\t\tSoy bean\n\t\tCotton seeds\n\t\tCitrus pulp  ");
        }
        else if(age>=10){
            System.out.println("Feeding: Grains and oilseed meals");
        }
        else{
            System.out.println("Feeding: Grass and Grains");
        }

    }
}














