import java.lang.*;
import java.util.*;
class MyIntrest
{
  Scanner SC = new Scanner (System.in);
  double p, t, r, si;
  void getVals ()
  {
    System.out.print ("Enter Principal amount...:");
    p = SC.nextDouble ();

    System.out.print ("Enter Time..:");
    t = SC.nextDouble ();

    System.out.print ("Enter Intrest Rate..:");
    r = SC.nextDouble ();
  }
  void putVals ()
  {
    System.out.println("Principal amount is...: "+ p);
    System.out.println("Time is...: "+t);
    System.out.println("Intrest Rate is...: "+r);
  }
  double mySimpleIntrest()
  {
      return (p*t*r)/100;
  }
  double myCompoundIntrest()
  {
      return p*(Math.pow((1+r/100),t))-p;
  }
}
class SICI
{
    public static void main(String args[])
    {
        MyIntrest MI=new MyIntrest();
        MI.getVals();
        System.out.println("-----------------------------------------------------");
        MI.putVals();
        System.out.println("-----------------------------------------------------");
        System.out.println("Simple Intrest is..: "+MI.mySimpleIntrest());
        System.out.println("Compound Intrest is..: "+MI.myCompoundIntrest());
   }
}