package package3;

public class Savings extends Account{
	private int interestrate;

	public Savings(int accno, String acctype, int accbal, int interestrate) {
		super(accno, acctype, accbal);
		this.interestrate = interestrate;
	}

	public int getInterestrate() {
		return interestrate;
	}

	public void setInterestrate(int interestrate) {
		this.interestrate = interestrate;
	}

	@Override
	public String toString() {
		return getAccno()+"\n"+getacctype()+"\n"+getAccbal()+"\n"+ getInterestrate(); 
	}
	

}
