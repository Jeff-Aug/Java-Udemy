package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		Order order = new Order(1080, new Date(),OrderStatus.PEDIDO_PENDENTE);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.ENTREGUE;
		OrderStatus os2 = OrderStatus.valueOf("PROCESSANDO");
		System.out.println(os1);
		System.out.println(os2);

	}

}
