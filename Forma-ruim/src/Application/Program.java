package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new  Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");//formato da data

		System.out.println("Room number: ");
		int number = sc.nextInt();
		
		System.out.println("Check-in date (dd/mm/yyyy)");
		Date checkin = sdf.parse(sc.next());
		
		System.out.println("Checkout date (dd/mm/yyyy)");
		Date checkout = sdf.parse(sc.next());
		
		
		if(!checkout.after(checkin)) {
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		}else {
			Reservation reservation = new Reservation(number, checkin, checkout);
			System.out.println(reservation.toString());
			
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			
			System.out.println("Check-in date (dd/mm/yyyy)");
			 checkin = sdf.parse(sc.next());
			
			 String error = reservation.upadateDates(checkin, checkout);
			 
			 if(error != null) {
				 System.out.println("error in reservation: " + error);
			 }else {
				 
				 System.out.println("Reservation: " + reservation);
				 
				 
			 }
			
				 		 
			
			 
		}
		
		
		
		
		
		sc.close();

	}

}
