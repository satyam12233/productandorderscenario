package com;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Order {
	@GetMapping("/myurl")
	public String sayHello()
	{
	return "Order Detail";
	}



	@GetMapping("/orderinfo")
	public OrderInfo getOrderInfo() {
	OrderInfo p =new OrderInfo();



	p.setId(1);
	p.setUserid("vivek123");
	p.setSessionid("2345mob");
	p.setToken("mob0987");
	p.setItemdiscount(200.00);
	p.setTax(100.00);
	p.setQuantity(1);
	p.setTotal(1000.00);
	p.setPromo("vkuma12");
	p.setGrandtotal(5000.00);
	return p;
	}


	@GetMapping("/orderinfo/{id}")
	public OrderInfo getOrderById(@PathVariable("id") Integer id) {
	OrderInfo p =new OrderInfo();



	p.setId(1);
	p.setUserid("satyam123");
	p.setSessionid("2345mob");
	p.setToken("mob0768");
	p.setItemdiscount(20.00);
	p.setTax(100.00);
	p.setQuantity(1);
	p.setTotal(1000.00);
	p.setPromo("strip");
	p.setGrandtotal(5000.00);
	return p;


	}



	@PostMapping(value = "/insertorderdetails")
	public OrderInfo insertOrderDetail(@RequestBody OrderInfo order) {
	return new OrderService().addOrder(order); //calling the service
	}


	@PutMapping("/update")
	public OrderInfo updateOrderInfo(@RequestBody OrderInfo order) {
	return new OrderService().updateOrder(order);
	}



	@GetMapping("/getlist")
	public List<OrderInfo> getOrderList() {
	List<OrderInfo> listOforder = new OrderService().getAllOrderlist();
	return listOforder;
	}



	@DeleteMapping("/delete/{id}")
	public List<OrderInfo> deleteOrdertById(@PathVariable Integer id) {
	new OrderService().deleteOrder(id);
	return new OrderService().getAllOrderlist();
	}
	}
}
