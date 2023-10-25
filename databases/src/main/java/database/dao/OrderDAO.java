package database.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.perscholas.database.entity.Order;

import java.util.List;

public class OrderDAO {
    private final SessionFactory sessionFactory;

    public OrderDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Order findById(Integer id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Order.class, id);
        }
    }

    public List<Order> findAllOrders() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM Order", Order.class).list();
        }
    }

    public void save(Order order) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.saveOrUpdate(order);
            transaction.commit();
        }
    }

    public void delete(int orderId) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            Order order = session.get(Order.class, orderId);
            if (order != null) {
                session.delete(order);
            }
            transaction.commit();
            session.close();
        }
    }

    // Add more methods for CRUD operations as needed
}
