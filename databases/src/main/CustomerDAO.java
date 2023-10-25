package org.perscholas.database.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.perscholas.database.entity.Customer;

public class CustomerDAO {
    void save(Customer customer);
    void update(Customer customer);
    void delete(int customerId);
    Customer findByCustomerId(int customerId);
    List<Customer> findAllCustomers();
}
public class JdbcCustomerDAO implements CustomerDAO {

    // Implement the methods defined in the interface
    // Use JDBC or an ORM framework to perform the database operations.

    @Override
    public void save(Customer customer) {
        // Implement the code to insert a customer into the database.
    }

    @Override
    public void update(Customer customer) {
        // Implement the code to update a customer in the database.
    }

    @Override
    public void delete(int customerId) {
        // Implement the code to delete a customer from the database.
    }

    @Override
    public Customer findByCustomerId(int customerId) {
        // Implement the code to retrieve a customer by ID from the database.
    }

    @Override
    public List<Customer> findAllCustomers() {
        // Implement the code to retrieve all customers from the database.
    }
}

 import java.util.List;

         import javax.persistence.NoResultException;
         import javax.persistence.TypedQuery;

         import org.hibernate.Session;
         import org.hibernate.SessionFactory;
         import org.hibernate.Transaction;
         import org.hibernate.cfg.Configuration;
         import org.perscholas.database.entity.Customer;

public class CustomerDAO {

    // the desired behavior is ... return a single Customer object OR return null
    // null is indicating that it was not found
    public Customer findById(Integer id) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        String hql = "FROM Customer c WHERE c.id = :id"; // Example of HQL to get all records of user class

        TypedQuery<Customer> query = session.createQuery(hql, Customer.class);
        query.setParameter("id", id);

        try {
            Customer result = query.getSingleResult();
            return result;
        } catch (NoResultException nre) {
            return null;
        }
    }

    // by contrast a method that returns a list will ALWAYS return a list
    // this kind of method never returns null
    // if there are no records the list will empty
    public List<Customer> findByFirstName(String fname) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        // Example of HQL to get all records of user class
        // SQL is : select * from customers c where c.contact_firstname = :firstname and
        // c.contact_lastname = :lastname
        String hql = "FROM Customer c WHERE c.contactFirstname = :firstname";

        TypedQuery<Customer> query = session.createQuery(hql, Customer.class);
        query.setParameter("firstname", fname);

        List<Customer> result = query.getResultList();
        return result;
    }

    public void save(Customer save) {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        Transaction t = session.beginTransaction();

        //		if ( save.getId() == null ) {
        //			session.save(save);
        //		} else {
        //			session.merge(save);
        //		}

        session.saveOrUpdate(save);
        t.commit();
    }

}