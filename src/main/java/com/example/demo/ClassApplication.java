package com.example.demo;

import com.example.demo.entities.Order;
import com.example.demo.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClassApplication implements CommandLineRunner {
	@Autowired
	private OrderService orderService;


	public static void main(String[] args) {
		SpringApplication.run(ClassApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order o1 = new Order(1034, 150.0, 20.0);
		Order o2 = new Order(2282, 800.0, 10.0);
		Order o3 = new Order(1309, 95.90, 0.0);

		System.out.println("Pedido Código: " + o1.getCode());
		System.out.println("Valor total: " + orderService.total(o1));

		System.out.println("Pedido Código: " + o2.getCode());
		System.out.println("Valor total: " + orderService.total(o2));

		System.out.println("Pedido Código: " + o3.getCode());
		System.out.println("Valor total: " + orderService.total(o3));
	}
}
