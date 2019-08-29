import java.util.*;
class time
{
	int hr,min;
	time(){hr=0;min=0;}
	time(int h,int m)
	{ 
	  hr=h;
	  min=m;
	}
	void acceptin()
	{Scanner s = new Scanner(System.in);
 	 System.out.println("Enter hr and min");
	 hr=s.nextInt();
	 min=s.nextInt();
	}
 	time add(time t)
	{
	 time temp=new time();
	 temp.hr = hr + t.hr;
	 temp.min = min + t.min;
	if(temp.min>=60)
	{
	 temp.hr+=1;
	 temp.min=temp.min-60;
	}
	return temp;
	}
	void display()
	{
 	 System.out.println(hr + ":" + min);
	}
}
class timemain
{
 	public static void main(String x[])
	{
	 time t2=new time();
	 time t1=new time(10,55);
	time t3=new time();
	t2.acceptin();
	t3=t1.add(t2);
	 System.out.print("T1 details : ");
	t1.display();
	 System.out.print("T2 details : ");
	t2.display();
	 System.out.print("Sum of T1 andT2 : ");
	t3.display();
	}
}
