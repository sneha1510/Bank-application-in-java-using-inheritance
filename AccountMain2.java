package package3;

import java.util.Scanner;



public class AccountMain2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AccountInfo2 ainfo=new AccountInfo2();
		Customer cust[]=null;
			cust=ainfo.create();
		ainfo.display(cust);
		System.out.println("-----------------------------------------------------------------");

		System.out.println("Do u want to perform trasactions press 1");
		System.out.println("-----------------------------------------------------------------");

		int ch=sc.nextInt();
		if(ch==1)
		{
	            System.out.println("Enter customer id for trasactions");
	            int custid=sc.nextInt();
	            ainfo.trasactions(cust, custid);
		}
		System.out.println("--------------------------thank u---------------------------------------");

	
     }
	}


