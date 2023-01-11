package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

/**
 * @author bruno.carvalho
 *
 */
public class Program {
	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
	
		System.out.println(order);

		/**
		 * Convertendo de String pra ENUM
		 */
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		System.out.println(os1);
		
		OrderStatus os2 = OrderStatus.valueOf("PENDING_PAYMENT");
		System.out.println(os2);
		
		
	}
	
	
	
}