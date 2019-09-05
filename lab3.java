import java.util.*;

class book
{
        String name=new String();
        String author=new String();
        double price,pages;
book()
{
        price=0;
        pages=0;
}
void set()
{       Scanner s=new Scanner(System.in);
        System.out.println("Enter the Name , Author ,Price and Pages of book ");
        name=s.nextLine();
        author=s.nextLine();
        price=s.nextInt();
        pages=s.nextInt();
}

void get()
{
          System.out.println("NAME   : "+name);
          System.out.println("Author : "+author);

}
public String toString()
{
        return("Pages  = "+pages+"  Price   = "+price+"$");
}

}
class main1
{
        public static void main(String x[])
        {
                Scanner s= new Scanner(System.in);
                int n;
                System.out.print("Enter the total nubmer of books ");
                n=s.nextInt();
                book b[]=new book[n];
                for(int i=0;i<n;i++)
                {		b[i]= new book();
                        b[i].set();
                        
                }
                  for(int i=0;i<n;i++)
                {	b[i].get();
                    System.out.println(b[i]);    
                }
        }
}

