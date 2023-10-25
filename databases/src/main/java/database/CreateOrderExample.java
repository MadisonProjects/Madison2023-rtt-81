import database.entity.Customer;
import database.entity.Order;

import java.util.List;

public class CreateOrderExample {

    public void queryOrder() {
        Order o = orderDao.findById(10100);

        Customer c = o.getCustomer();

        System.out.println("Order " + o.getId() + " was made by customer " + c.getCustomerName() + " on " + o.getOrderDate());

        // all the customers orders
        List<Order> orders = c.getOrders();
        for (Order order : orders) {
            System.out.println("Order " + order.getId());
        }
    }


    public static void main(String[] args) {
        CreateOrderExample x = new CreateOrderExample();
        try {
            //x.createOrder();
            x.queryOrder();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}