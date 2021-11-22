
package bonus;

public abstract class factoryPattern
{
    abstract newStaff getType(String name);
    abstract void getSalaary(int salary);
    abstract void getYearsOfWork(int numberofyears);
}
