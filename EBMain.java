package com.wipro.eb.main;
import com.wipro.eb.exception.InvalidConnectionException;
import com.wipro.eb.exception.InvalidReadingException;
import com.wipro.eb.service.ConnectionService;
public class EBMain 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		ConnectionService cs = new ConnectionService();
		// Domestic Testing
		try {
			System.out.println(cs.generateBill(130, 120, "Domestic"));
		} catch (InvalidReadingException | InvalidConnectionException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		//Output bust be 23.0
		
		try {
			System.out.println(cs.generateBill(180, 120, "Domestic"));
		} catch (InvalidReadingException | InvalidConnectionException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		//Output bust be 157.0
		
		try {
			System.out.println(cs.generateBill(280, 120, "Domestic"));
		} catch (InvalidReadingException | InvalidConnectionException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		//Output bust be 655.0
		
		try {
			System.out.println(cs.generateBill(-280, 120, "Domestic"));
		} catch (InvalidReadingException | InvalidConnectionException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		//Output bust be Incorrect Reading
		
		try {
			System.out.println(cs.generateBill(280, -120, "Domestic"));
		} catch (InvalidReadingException | InvalidConnectionException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		//Output bust be Incorrect Reading
		
		try {
			System.out.println(cs.generateBill(100, 120, "Domestic"));
		} catch (InvalidReadingException | InvalidConnectionException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		//Output bust be Incorrect Reading
		
		try {
			System.out.println(cs.generateBill(200, 120, "domestic"));
		} catch (InvalidReadingException | InvalidConnectionException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		//Output bust be Invalid ConnectionType
		
		try {
			System.out.println(cs.generateBill(200, 120, "dom"));
		} catch (InvalidReadingException | InvalidConnectionException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		//Output bust be Invalid ConnectionType
		
		 
		//Commercial Testing
		
		
		try {
			System.out.println(cs.generateBill(130, 120, "Commercial"));
		} catch (InvalidReadingException | InvalidConnectionException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		//Output bust be 53.04
		
		try {
			System.out.println(cs.generateBill(180, 120, "Commercial"));
		} catch (InvalidReadingException | InvalidConnectionException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		//Output bust be 334.56
		
		try {
			System.out.println(cs.generateBill(280, 120, "Commercial"));
		} catch (InvalidReadingException | InvalidConnectionException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		//Output bust be 1119.96
		
		try {
			System.out.println(cs.generateBill(-280, 120, "Commercial"));
		} catch (InvalidReadingException | InvalidConnectionException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		//Output bust be Incorrect Reading
		
		try {
			System.out.println(cs.generateBill(280, -120, "Commercial"));
		} catch (InvalidReadingException | InvalidConnectionException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		//Output bust be Incorrect Reading
		
		try {
			System.out.println(cs.generateBill(100, 120, "Commercial"));
		} catch (InvalidReadingException | InvalidConnectionException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		//Output bust be Incorrect Reading
		
		try {
			System.out.println(cs.generateBill(200, 120, "commercial"));
		} catch (InvalidReadingException | InvalidConnectionException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		//Output bust be Invalid ConnectionType
		
		try {
			System.out.println(cs.generateBill(200, 120, "comm"));
		} catch (InvalidReadingException | InvalidConnectionException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			
		}
		//Output bust be Invalid ConnectionType
	}
}
