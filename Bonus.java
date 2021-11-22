
package bonus;

public class Bonus 
{
    public static void main(String[] args) 
    {
        factoryPattern t2=memberFamily.get_type(true);
        System.out.println("The CS doctor");
        newStaff d=t2.getType("CS");
        d.printdepart();
        t2.getSalaary(5000);
        t2.getYearsOfWork(8);
        System.out.println("*************************************************************");
        System.out.println("The IS doctor");
        newStaff d2=t2.getType("IS");
        d2.printdepart();
        t2.getSalaary(6000);
        t2.getYearsOfWork(9);
        System.out.println("*************************************************************");
        System.out.println("The IT doctor");
        newStaff d3=t2.getType("IT");
        d3.printdepart();
        t2.getSalaary(7000);
        t2.getYearsOfWork(10);
        
        System.out.println("*************************************************************");
        
        factoryPattern t1=memberFamily.get_type(false);
        System.out.println("The CS teching assistant");
        newStaff s=t1.getType("CS");
        s.printdepart();
        t1.getSalaary(8000);
        t1.getYearsOfWork(5);
        System.out.println("*************************************************************");
        System.out.println("The IS teching assistant");
        newStaff s2=t1.getType("IS");
        s2.printdepart();
        t1.getSalaary(9000);
        t1.getYearsOfWork(6);
        System.out.println("*************************************************************");
        System.out.println("The IT teching assistant");
        newStaff s3=t1.getType("IT");
        s3.printdepart();
        t1.getSalaary(10000);
        t1.getYearsOfWork(7);
    }
    
}
