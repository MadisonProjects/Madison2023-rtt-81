import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.perscholas.database.dao.OrderDAO;
import org.perscholas.database.entity.Customer;
import org.perscholas.database.entity.Order;

public class CreateOrderExample {
    @@ -38,12 +40,27 @@ public void createOrder() throws ParseException {

    }

    public void queryOrder() {
        Order o = orderDao.findById(10100);

        Customer c = o.getCustomer();

        System.out.println("Order " + o.getId() + " was made by customer " + c.getCustomerName() + " on " + o.getOrderDate());

        // all the customers orders
        List<Order> orders = c.getOrders();
        for ( Order order : orders ) {
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