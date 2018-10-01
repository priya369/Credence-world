package bankaccountapp;

public class Savings extends Account {
private int safetyDepositeBoxID;
private int safetyDepositeBoxKey;
	public Savings(String name,String sSN,double initdeposit){
		super(name,sSN,initdeposit);
		accountNumber="1"+accountNumber;
		setSafetyDepositBox();
	}
	@Override
	public void setRate() {
		rate=getBaseRate()-.25;
	}
	private void setSafetyDepositBox() {
		safetyDepositeBoxID=(int)(Math.random()*Math.pow(10, 3));
		safetyDepositeBoxKey=(int)(Math.random()*Math.pow(10, 4));
		
	}
	@Override
		public void showInfo() {
			super.showInfo();
			System.out.println(
					"your saving Account Features"+
			         "\nSafety Deposit Box ID : "+ safetyDepositeBoxID +
					 "\nSafety Deposit Box Key:"+ safetyDepositeBoxKey+
					 "\nRate                  :"+rate+"%"
					);
			

		}
	
}
