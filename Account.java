package package3;

public class Account 
{
	private int accno;
	   private String acctype;
	   private int accbal;
	   Savings s;
	   Current c;
	public Account(int accno, String acctype, int accbal) {
		this.accno = accno;
		this.acctype = acctype;
		this.accbal = accbal;
	}

	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getacctype() {
		return acctype;
	}
	public void setName(String name) {
		this.acctype = acctype;
	}
	public int getAccbal() {
		return accbal;
	}
	public void setAccbal(int accbal) {
		this.accbal = accbal;
	}

	   
}
