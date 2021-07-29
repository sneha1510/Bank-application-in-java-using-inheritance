package package3;

public class AccountMain {

	public static void main(String[] args) 
	{
		System.out.println("--------Savings-----------");
       Savings s=new Savings(101,"savings",89000,9);
       display(s);
       System.out.println("--------Current-------------");
       Current c=new Current(201, "current",90000,"Abc private Ltd");
       display(c);
	}
	public static void display(Account a)
	{
		System.out.println(a);
	}

}
