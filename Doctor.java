
package bonus;

public class Doctor extends factoryPattern
{
    @Override
    public newStaff getType(String name)
    {
        if(name.equalsIgnoreCase("IS"))
        {  
           return new IS();
        }
        else if(name.equalsIgnoreCase("CS"))
        {
           return new CS();
        }
        else if(name.equalsIgnoreCase("IT"))
        {
           return new IT();
        }
        else
        {
           return null;
        }
    }
    
    @Override
    void getSalaary(int salary) 
    {
        System.out.println("The salary for doctor : "+ salary); 
    }
    
     @Override
    public void getYearsOfWork(int noOfYears)
    {
         System.out.println("The number of years for doctor : "+ noOfYears);
    }

}
