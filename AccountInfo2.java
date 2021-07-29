package package3;

import java.util.Scanner;


public class AccountInfo2
{
	
	Scanner sc=new Scanner(System.in);
	public Customer[] create()
	{
		System.out.println("How many account no. do u want...?");
		int n=sc.nextInt();
		Account a=null;
	//	Account arr[]=new Account[n];customer cha array kra
		Customer c[]=new Customer[n];
		for(int i=0;i<n;i++)
		{

			System.out.println("Enter the details for Account");
		
		System.out.println("Enter the account type: ");
		System.out.println("1-Savings\n2-Current");
		int ch=sc.nextInt();
		if(ch==1)
		{
			System.out.println("welcome to savings account section");
			System.out.println("Enter the account no: ");
			int acno=sc.nextInt();
			System.out.println("Enter account balance");
			int accbal=sc.nextInt();
			System.out.println("Enter interest rate:");
			int r=sc.nextInt();
		    a=new Savings(acno,"savings",accbal,r);
		      // display1(a);
		       
		}
		if(ch==2)
		{
			System.out.println("welcome to Current account section");
			System.out.println("Enter the account no: ");
			int acno=sc.nextInt();
			System.out.println("Enter account balance:");
			int accbal=sc.nextInt();
			System.out.println("Enter company name:");
			String cnm=sc.next();
		    a=new Current(acno,"Current",accbal,cnm);
		      // display1(a);
		       
		}

		
     // Account a=new Account(acno, atype, abal);

		System.out.println("=============================");
		System.out.println("enter customer id:");
		int id=sc.nextInt();
		System.out.println("enter customer name:");
		String name=sc.next();
		System.out.println("enter customer mobile no:");
		String mobno=sc.next();
      Customer c1=new Customer(id,name,mobno,a);
         c[i]=c1;
    		  
		}
		return c;
	}
	public void display(Customer c[])
	{
		
		for(Customer a1:c )
		{
			System.out.println("----------Customer Details---------------");
			System.out.println("Customer id: "+a1.getId());
			System.out.println("Customer name: "+a1.getName());
			System.out.println("Customer mobile no: "+a1.getMobno());
            System.out.println("------------------------");
		}
       


		for(Customer a1:c )
		{
			System.out.println("---------Account Details------------");
			System.out.println("Account no: "+a1.getA().getAccno());
			System.out.println("Account type: "+a1.getA().getacctype());
			System.out.println("Account balance: "+a1.getA().getAccbal());
			if(a1.getA() instanceof Savings )
			{
				Savings sa=(Savings)a1.getA();
				System.out.println("Interest rate: "+sa.getInterestrate());
			}
			if(a1.getA() instanceof Current )
			{
				Current ca=(Current)a1.getA();
				System.out.println("Company name: "+ca.getCname());
			}
			System.out.println("------------------------------------");
		
			
		}
	}
		public void trasactions(Customer cust[],int custid)
		{
			//int f=0;
	        boolean b=false;
	        Customer cobj=null;
	        for(int i=0;i<cust.length;i++) 
	        {
	        	if(cust[i].getId()==custid)
	        	{
	        		b=true;
	        		cobj=cust[i];
	        		break;
	        	}
	        	
	        }
	        if(b)
	        {
			Trasaction t=new Trasaction();
			System.out.println("1-withdraw\n2-deposite");
			System.out.println("Enter your choice..");
			int c=sc.nextInt();
	   
	 
			if(c==1)
			{
			System.out.println("current balance is:"+cobj.getA().getAccbal());
				System.out.println("Enter amount to withdraw");
				int amt=sc.nextInt();
				t.withdraw(cobj.getA(),amt);
				//break;
			}
			else if(c==2)
			{
				System.out.println("current balance is:"+cobj.getA().getAccbal());			System.out.println("Enter amount to deposite");
				int amt1=sc.nextInt();
				t.dep(cobj.getA(), amt1);
	            // break; 
			}
	        }
	        else
	        {
	        	System.out.println("Invalid id...");
	        }
	  
		
		

		
	}
		public static void display1(Account a)
		{
			System.out.println(a);
		}


}
