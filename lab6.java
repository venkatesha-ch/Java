import java.util.*;

class father
{
	private int age;int p;
	father(int x) throws WrongAge
	{p = 1;
	age = x;
	try{
	if(age<=0)
	throw new WrongAge();
	}
	catch(WrongAge asd)
	{System.out.println("Age should be greater than zero");
	p=0;
	}
	}
	
	void disp()
	{System.out.println("Father age " + age);
	}
	}
class son extends father
{   
    int age1;
    son(int a,int b) throws WrongAge
    {
    super(a);
    p=1;
    try{
    if(a<=b)
    throw new WrongAge();
    }
    catch(WrongAge asd)
    {System.out.println("Sons age is greater than fathers");
    p=0;
    }
    age1 = b;
     }
        
      
      void display()
        {super.disp();
        System.out.println("Son age " + age1);}
   }
   
class WrongAge extends Exception
{
WrongAge()
{System.out.println("Enter valid age");
}
}

class maindemo
{
public static void main(String ff[])
{Scanner s =new Scanner(System.in);
int a,b;
do
{
System.out.println("Enter fathers age :");
a =s.nextInt();
System.out.println("Enter sons age : ");
b =s.nextInt();
try
{
son s1 = new son(a,b);
if(s1.p==1)
s1.display();
}
catch (WrongAge abc)
{System.out.println("Errors");}
}while(a<0 || a<b);



}
}

