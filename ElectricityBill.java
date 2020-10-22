import java.io.*;

public class ElectricityBill {
	private String consumerNo;
	private String consumerName;
	private int previousMonthReading;
	private int currentMonthReading;
	private String typeConnection;
	public ElectricityBill() {}
	public ElectricityBill(String consumerNo,String consumerName,int previousMonthReading, int currentMonthReading,String typeConnection) {
		this.consumerNo=consumerNo;
		this.consumerName=consumerName;
		this.previousMonthReading=previousMonthReading;
		this.currentMonthReading=currentMonthReading;
		this.typeConnection=typeConnection;
	}
	public void setConsumerNo(String consumerNo) {
		this.consumerNo=consumerNo;
	}
	public void setConsumerName(String consumerName) {
		this.consumerName=consumerName;
	}
	public void setPreviousMonthReading(int previousMonthReading) {
		this.previousMonthReading=previousMonthReading;
	}
	public void setCurrentMonthReading(int currentMonthReading) {
		this.currentMonthReading=currentMonthReading;
	}
	public void setTypeConnection(String typeConnection) {
		this.typeConnection=typeConnection;
	}
	public String getConsumerNo() {
		return consumerNo;
	}
	public String getConsumerName() {
		return consumerName;
	}
	public int getPreviousMonthReading() {
		return previousMonthReading;
	}
	public int getCurrentMonthReading() {
		return currentMonthReading;
	}
	public String getTypeConnection() {
		return typeConnection;
	}
	public double billAmount() {
		double amount=0.0;
		int units=currentMonthReading-previousMonthReading;
		if(typeConnection.toLowerCase().equals("domestic")) {
			if(units<=100) {
				amount=units;
			}
			else if(units<=200) {
				amount=100+(units-100)*2.50;
			}
			else if(units<=500) {
				amount=100+100*2.50+(units-200)*4;
			}
			else {
				amount=100+100*2.50+300*4+(units-500)*6;
					}
		}
		else {
			if(units<=100) {
				amount=units*2;
			}
			else if(units<=200) {
				amount=100*2+(units-100)*2.50;
			}
			else if(units<=500) {
				amount=100*2+100*4.50+(units-200)*6;
			}
			else {
				amount=100*2+100*4.50+300*4+(units-500)*7;
			}
		}
		return amount;
	}

	public static void main(String[] args) {
		ElectricityBill eb=new ElectricityBill("5k9","Reshma",5000,5600,"Commercial");
		System.out.println("ConsumerNo:"+eb.getConsumerNo());
		System.out.println("ConsumerName:"+eb.getConsumerName());
		System.out.println("PreviousMonthReading:"+eb.getPreviousMonthReading());
		System.out.println("CurrentMonthReading:"+eb.getCurrentMonthReading());
		System.out.println("TypeConnection:"+eb.getTypeConnection());
		double bill=eb.billAmount();
		System.out.println("Your Bill:"+bill);
		System.out.println("\n Changing the EB account\n");
		eb.setTypeConnection("Domestic");
		bill=eb.billAmount();
		System.out.println("Your Bill:"+bill);

	}

}
