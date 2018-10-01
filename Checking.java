package bankaccountapp;

public class Checking extends Account {
private int debitcardNumber;
private int debitcardPIN;
	public Checking(String name,String sSN,double initdeposit){
		super(name,sSN,initdeposit);
		accountNumber="2"+accountNumber;
		setDebitCard();
	}
	@Override
	public void setRate() {
		rate=getBaseRate()*.15;
		
	}
	private void setDebitCard() {
	 debitcardNumber=(int)(Math.random()*Math.pow(10, 12));
	 debitcardPIN=(int)(Math.random()*Math.pow(10, 4));
		
	}
	@Override
		public void showInfo() {
			super.showInfo();
			System.out.println(
					"your Checking account features:"+
			        "\nDebit card Number: "+debitcardNumber+
			        "\nDebit card PIN   : "+debitcardPIN+
			        "\nRate             : "+rate+"%"
					);
		}
	
}
