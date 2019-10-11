import java.util.*;

class acc
{
	String name = new String();
	String acc_no = new String();
	int type;
	double bal;

	   void get_depo()
        {
                Scanner s1= new Scanner(System.in);
                System.out.println("Enter the amount to be credited ");
                double bal1=s1.nextDouble();
		bal=bal+bal1;
                System.out.println("Balance = "+bal+"$");
        }

	void bal_disp()
	{
		System.out.println("Balance   :  "+bal+"$");
	}

	void withdraw(double x)
	{
		if(x>bal)
			System.out.println("Low balance ");
		else
		{
		bal=bal-x;
		System.out.println("Balance   :  "+bal+"$");
		}
	}

}


class cur_acct extends acc
{	double temp,rate;
	void check()
	{double set_min = 1000;
	if(bal<set_min)
	{ rate = 0.05;
	  temp = (rate*bal);
          bal = (bal-temp);
	  System.out.println("5 % of balance charged due to low balance...! ");
	}

	}
}


class sav_acct extends acc
{
	double intre = 0.07;
	int t;
	void interest()
	{	Scanner s = new Scanner(System.in);
		System.out.println("Enter the time ");
		t = s.nextInt();
		bal =(bal*(Math.pow((1+intre),t)));
		System.out.println("Balance   : "+bal+"$");

	}
}


class bank
{
	public static void main(String s2[])
	{
	 	Scanner s = new Scanner(System.in);
		System.out.println("Welcome to XYZ bank");
		System.out.println("Which type of account do you prefer...?");
		System.out.println("Press 1 for current ");
		System.out.println("Press 2 for savings ");
		int ch=s.nextInt();
		
		//do{
		switch(ch)
		{
			case 1: { 
				  cur_acct a1 = new cur_acct();
				  System.out.println("Enter the name : ");
                		  a1.name = s.next();
				  System.out.println("Enter the account number :  ");
				  a1.acc_no = s.next();
				  a1.type = 1;
			  	  System.out.println("Check book provided ");
				  System.out.println("Press 1 for balance check and 2 for withdraw press 3 for deposite and press 4 for cancel the transction ");
				  int ch1=s.nextInt();
				while(ch1==1||ch1==2||ch1==3)				  
				{switch(ch1)
				  {
					 case 1 : a1.bal_disp();
						  System.out.println("Press 1 for balance check and 2 for withdraw press 3 for deposite and press 4 for cancel the transction ");
				                  ch1=s.nextInt();
						  break;
					case 2:   System.out.println("Enter the amount to be withdrawn ");
						  double x=s.nextDouble();
						  a1. withdraw(x);
						  a1.check();
						  System.out.println("Press 1 for balance check and 2 for withdraw press 3 for deposite and press 4 for cancel the transction ");
				                  ch1=s.nextInt();
						  break;
					
					case 3:   a1.get_depo();
						  System.out.println("Press 1 for balance check and 2 for withdraw press 3 for deposite and press 4 for cancel the transction ");
				                  ch1=s.nextInt();
				  }  }
				  break;
				}			
			case 2: { 
				  sav_acct b1 = new sav_acct();
				  System.out.println("Enter the name : ");
                                  b1.name = s.next();
                                  System.out.println("Enter the account number :  ");
                                  b1.acc_no = s.next();
                                  b1.type = 2;
                          	  System.out.println("Press 1 for balance check and 2 for withdraw press 3 for deposite and press 4 for cancel the transction ");
				  int ch1=s.nextInt();
                                 while(ch1==1||ch1==2||ch1==3) 
				{ switch(ch1)
                                  {
                                         case 1:  b1.bal_disp();
					          System.out.println("Press 1 for balance check and 2 for withdraw press 3 for deposite and press 4 for cancel the transction ");
				                  ch1=s.nextInt();                                              
					          break;
                                        case 2 :  System.out.println("Enter the amount to be withdrawn ");
                                                  double x=s.nextDouble();
                                                  b1.withdraw(x);
                                                  System.out.println("Press 1 for balance check and 2 for withdraw press 3 for deposite and press 4 for cancel the transction ");
				                  ch1=s.nextInt();
						  break;

					case 3:   b1.get_depo();
						  b1.interest();
						  System.out.println("Press 1 for balance check and 2 for withdraw press 3 for deposite and press 4 for cancel the transction ");
				                  ch1=s.nextInt();
                                  }

				}}
                                  break;
                       
		

}	  
}
}
