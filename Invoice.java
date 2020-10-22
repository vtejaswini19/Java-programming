import java.io.*;
import java.util.Scanner;
public class Invoice {
	private String number;
	private String description;
	private int quantity;
	private double price;
	public Invoice() {}
	public Invoice(String number,String description,int quantity,double price) {
		this.number=number;
		this.description=description;
		this.quantity=quantity;
		this.price=price;
	}
	public void setNumber(String number) {
		this.number=number;
	}
	public void setDescription(String description) {
		this.description=description;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public String getNumber() {
		return number;
	}
	public String getDescription() {
		return description;
	}
	public int getQuantity() {
		return quantity;
	}
	public Double getPrice() {
		return price;
	}
	public double getInvoiceAmount() {
		double invoiceAmount=0.0;
		if(quantity<0) {
			invoiceAmount=0;
		}
		else if(price<0.0) {
			invoiceAmount=0;
		}
		else {
			invoiceAmount=price*quantity;
		}
		return invoiceAmount;
		}
	

	public static void main(String[] args) {
		Invoice in=new Invoice("5k9","Invoice",8,4);
		in.setPrice(5.0);
		System.out.println("Number:"+in.getNumber());
		System.out.println("Description:"+in.getDescription());
		System.out.println("Quantity:"+in.getQuantity());
		System.out.println("Price:"+in.getPrice());
		System.out.println("InvoiceAmount:"+in.getInvoiceAmount());

	}

}
