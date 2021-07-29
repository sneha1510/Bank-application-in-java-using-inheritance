package package3;

public class Trasaction
{
	public void withdraw(Account a,int amt)
	{
		if(a.getAccbal()<1000)
		{
			System.out.println("Sorry u cant withdraw amount because balance is than 1000");
		}
		else
		{
      int bal=a.getAccbal()-amt;
      a.setAccbal(bal);
	 System.out.println("Trasaction Completed successfully...");
	 System.out.println("After the trasaction your balance is:"+a.getAccbal());
	}
	}
	public void dep(Account a,int amt)
	{
      int bal=a.getAccbal()+amt;
      a.setAccbal(bal);
	 System.out.println("Trasaction Completed successfully...");
	 System.out.println("After the trasaction your balance is:"+a.getAccbal());
	}

}
