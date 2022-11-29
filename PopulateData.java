import java.util.GregorianCalendar;

/**
 * Class to populate date for the farm
 *  @author  Daniil Belousov id 2491827
 *  @version 1.2, 27.11.22
 */
public class PopulateData {
    public static void main(FarmMe test){
        GregorianCalendar first1=new GregorianCalendar(2000,10,11);
        GregorianCalendar second1=new GregorianCalendar(2010,8,1);
        GregorianCalendar third1=new GregorianCalendar(2019,3,15);
        GregorianCalendar fourth1=new GregorianCalendar(2018,1,11);
        GregorianCalendar first2=new GregorianCalendar(2000,10,11);
        GregorianCalendar second2=new GregorianCalendar(2010,8,1);
        GregorianCalendar third2=new GregorianCalendar(2019,3,15);




        Cow first = new Cow("Female",first1,false,12.2);
        Cow second = new Cow("Male",second1,true,13.2);

        Sheep third = new Sheep("Female", third1,true);
        Sheep fourth = new Sheep("Male", fourth1,false );


        Veterinary f=new Veterinary("Male",first2,true,second2,5);
        Veterinary s=new Veterinary("Female",second2,false,null,3);

        FarmWorker f1 = new FarmWorker("Female", first2,"BestFarm",15);
        FarmWorker s1 = new FarmWorker("Male", first2,"Bes1tFarm",12);

        HealthTreatment trea1= new HealthTreatment(true,third2,"paracetamol2",s);
        CleaningTreatment trea2= new CleaningTreatment("brush",third1,f1);

        HealthTreatment trea3= new HealthTreatment(false,third2,"paracetamol2",f);
        CleaningTreatment trea4= new CleaningTreatment("brush, shovel", third1,s1);

        Medication med2 = new Medication("asd2",12,second1,12.2,"none");
        Medication med3 = new Medication("asd3",13,third1,13.2,"none");


        trea1.setMedication(med2);
        trea3.setMedication(med3);

        first.setTreatment(trea1);
        second.setTreatment(trea3);
        first.setTreatment(trea2);
        second.setTreatment(trea4);

        test.addCow(first);
        test.addCow(second);
        test.addSheep(third);
        test.addSheep(fourth);
        test.addVet(f);
        test.addVet(s);
        test.addFarmWorker(f1);
        test.addFarmWorker(s1);
    }
}
