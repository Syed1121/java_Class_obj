import java.lang.*;
import java.util.*;
class Area
{
    Scanner SC=new Scanner(System.in);
    int length;
    int breadth;
    void getVals()
    {
        System.out.print("Enter length...:");
        length=SC.nextInt();
        System.out.print("Enter Breadth..:");
        breadth=SC.nextInt();
    }
    void putVals()
    {
        System.out.println("Length of a rectangle is...: "+length);
        System.out.println("Breadth of a rectangle is...: "+breadth);
    }
        int myArea()
        {
           return length*breadth;
        }
    }
    class AOR
    {
        public static void main(String args[])
        {
         Area A=new Area();
         A.getVals();
         A.putVals();
         System.out.println("Area of a rectangle is = "+A.myArea());
        }
    }
