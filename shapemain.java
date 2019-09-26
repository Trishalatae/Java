import java.util.*;
abstract class shape
{
  double a1;
  shape(double a)
  {
    a1=a;
  }
  
 abstract double printArea();
 }
 
 class rectangle extends shape
 {
   double b1;
   rectangle(double a , double b)
   {
     super(a);
     
     b1 = b;
   }
   
   double printArea()
   {
     System.out.println("Inside area for rectangle");
     return (a1*b1);
   }
 }
 
 class triangle extends shape
 {
   double b1;  
   triangle(double a , double b)
   {
     super(a);
     b1 = b;
   }
   
   double printArea()
   {
     System.out.println("Inside area for trinagle");
     return (0.5*a1*b1);
   }
 }
 
 class circle extends shape
 {
   circle(double a)
   {
     super(a);
   }
   
   double printArea()
   {
     System.out.println("Inside area for circle");
     return (3.14*a1*a1);
   }
 }
 
 class shapemain
 {
   public static void main(String args[])
   {
     int ch ;
     double a , b;
     while(true)
     {
       System.out.println("\n"+"Enter your choice");
       System.out.println("1. Area of Rectangle 2. Area of Trinagle 3. Area of Circle 4. Exit");
       Scanner sc2 = new Scanner(System.in);
       ch = sc2.nextInt();
       shape s;
       switch(ch)
       {
         case 1 : System.out.println("Enter first dimension");
                  a = sc2.nextDouble();
                  System.out.println("\n"+"Enter the second dimension");
                  b = sc2.nextDouble();
                  rectangle r = new rectangle(a,b);
                  System.out.println("\n"+"The area is " + r.printArea());
                  break;
         case 2 : System.out.println("\n"+"Enter first dimension");
                  a = sc2.nextDouble();
                  System.out.println("\n"+"Enter the second dimension");
                  b = sc2.nextDouble();
                  triangle t = new triangle(a,b);
                  System.out.println("\n"+"The area is " + t.printArea());
                  break;
         case 3 : System.out.println("\n"+"Enter first dimension");
                  a = sc2.nextDouble();
                  circle c = new circle(a);
                  s = c;
                  System.out.println("\n"+"The area is " + s.printArea());
                  break; 
         case 4 : System.exit(0);
         default :  System.out.println("\n"+"Invalid choice");  
       }
     }
   }
 }
       
    
    
