
package bonus;

public class teachingAssistant extends factoryPattern
{

    @Override
    newStaff getType(String name) 
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
        System.out.println("The salary of teaching assistant : "+ salary);
    }

    @Override
    void getYearsOfWork(int numberofyears) 
    {
        System.out.println("The number of years for teacher assistant : "+numberofyears);
    }
    
}
