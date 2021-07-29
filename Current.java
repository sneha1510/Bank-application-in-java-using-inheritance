package package3;

public class Current extends Account
{
	private String cname;

	public Current(int accno, String acctype, int accbal, String cname) {
		super(accno, acctype, accbal);
		this.cname = cname;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	public String toString() {
		return getAccno()+"\n"+getacctype()+"\n"+getAccbal()+"\n"+getCname(); 
	}
	

}
