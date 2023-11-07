import java.lang.*;
import java.util.*;
class StudentMarksReport
{
  Scanner SC = new Scanner (System.in);
  int sno,sclass,m1,m2,m3,m4,m5,m6,tot;
  float av;
  String sname,ssec;
  void getVals()
  {
      System.out.print("Enter Student number...:");
      sno=SC.nextInt();
      
      System.out.print("Enter Sname..:");
      sname=SC.next();
 
      System.out.print("Enter Sclass..:");
      sclass=SC.nextInt();
 
      System.out.print("Enter Ssec..:");
      ssec=SC.next();
 
      System.out.print("Enter m1..:");
      m1=SC.nextInt();
 
      System.out.print("Enter m2..:");
      m2=SC.nextInt();
 
      System.out.print("Enter m3..:");
      m3=SC.nextInt();
 
      System.out.print("Enter m4..:");
      m4=SC.nextInt();
 
      System.out.print("Enter m5..:");
      m5=SC.nextInt();
 
      System.out.print("Enter m6..:");
      m6=SC.nextInt();

  }
  
  void putVals()
  {
        System.out.println("--------------------------------------------------------");
        System.out.println("\t\tSTUDENT MARKS DETAILS");
        System.out.println("--------------------------------------------------------");
        System.out.println("Sno = "+sno+"\t"+"Sname = "+sname);
        System.out.println("Sclass = "+sclass+"\t"+"Ssec = "+ssec);
        System.out.println("m1 = "+m1+"\t\t"+"m2 = "+m2+"\t\t"+"m3 = "+m3);
        System.out.println("m4 = "+m4+"\t\t"+"m5 = "+m5+"\t\t"+"m6 = "+m6);
        System.out.println("--------------------------------------------------------");
  }
  
  int myTotal()
  {
      return m1+m2+m3+m4+m5+m6;
  }
  
  float myAverage()
  {
      return tot/6;
  }
  
}
  class SMR
      {
              public static void main(String args[])
              {
          StudentMarksReport MR=new StudentMarksReport();
          MR.getVals();
          MR.putVals();
          System.out.println("Total Marks....: "+MR.myTotal());
          System.out.println("Average Marks....: "+MR.myAverage());
      }
      }