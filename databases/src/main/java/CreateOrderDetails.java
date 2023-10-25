package org.perschola.database;

import org.perscholas.database.entity.Order;
import org.perscholas.database.entity.OrderDetail;
import org.perscholas.database.entity.Product;

public class CreateOrderDetails {

    private OrderDAO orderDAO =  new OrderDAO ();
    private ProductDAO productDAO = new ProductDAO ();
    private OrderDetailsDAO orderDetailsDAO = new OrderDetailsDAO();

    public void createOrderDetails() {
        // the goal is to insert a record into the order details table
        Product p = productDAO.findById(1);
        Order o = orderDAO.findById(10100);

        OrderDetail of = new OrderDetail();
        od.setProduct(p);
        od.detOrder
    }
}