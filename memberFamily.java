
package bonus;

public class memberFamily 
{
    public static factoryPattern get_type(boolean n)
    {
        if(n)
        {
            return new Doctor();  
        }
        else
        {
            return new teachingAssistant();
        }
    }
}
