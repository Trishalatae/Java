import java.util.*;
class book
{
   Scanner s=new Scanner(System.in);
   String name,author;
   int price,pages;
   book()
   {
      price=459;
      pages=612;
      name="Inferno";
      author="Dan brown";
    }
   
   void setdata()
    {
       System.out.println("\n Enter name of book");
       name=s.next();
       System.out.println("\n Enter the name of Author");
       author=s.next();
       System.out.println("\n Enter the price: ");
       price=s.nextInt();
       System.out.println("\n Enter the pages: ");
       pages=s.nextInt();
      }
  public String toString()
   {
     return ("\n Name:"+name+ "\nAuthor:"+author+ "\nprice:"+price+ "\npages:"+pages);
   }
}
class bookmain
{
  public static void main(String xx[])
  {
    Scanner s = new Scanner(System.in);
    int n;
    System.out.println("\n Enter the number of books");
    n = s.nextInt();
    book b1[]=new book[n];
    for (int i=0;i<n;i++)
    {
       b1[i] = new book();
       b1[i].setdata();
       System.out.println(b1[i]);
    }
  }
}
