package secao13;

import java.util.Date;

import entidades.OrderP;
import entidades.enums.OrderStatus;

public class ProgramOrder {

	public static void main(String[] args) {
		
		OrderP order = new OrderP(1080, new Date(), OrderStatus.PENDING_PAYMENT); //Por padrao no Java ele vai transformar o Enum numa string na hora de imprimir
		
		System.out.println(order);

		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
