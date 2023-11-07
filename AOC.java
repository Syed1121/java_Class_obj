import java.lang.*;
import java.util.*;
import java.math.*;
class AreaCircle
{
    Scanner SC=new Scanner(System.in);
    double r,c,a;
    void getVals()
    {
    System.out.print("Enter Radius..:");
    r=SC.nextDouble();
    }
    void putVals()
    {
        System.out.print("Radius is...: "+r);
    }
    
    double myCircumference()
    {
        return 2*Math.PI*r; 
    }
    double myAreaCircle()
    {
        return Math.PI*(r*r);
    }
}
    class AOC
    {
        public static void main(String args[])
        {
            AreaCircle AC=new AreaCircle();
            AC.getVals();
            AC.putVals();
            System.out.println();
            System.out.println("Circumferencs of a Circle..: "+AC.myCircumference());
            System.out.println("Area of a Circle..: "+AC.myAreaCircle());
        }
    }

