
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@@ -20,9 +23,17 @@ public class Order {
    @Column(name = "id")
    private Integer id;

    // this variable becomes read only because we have set
    // insertable and updateble to false.
    // we need to do this because we now have a @ManyToOne annotation
    // that is working on the customer_id field also.
    @Column(name = "customer_id", insertable = false, updatable = false)
    private Integer customerId;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @Column(name = "order_date")
    @Temporal(TemporalType.DATE)
    private Date orderDate;
    @@ -96,6 +107,14 @@ public String getComments() {
        public void setComments(String comments) {
            this.comments = comments;
        }

        public Customer getCustomer() {
            return customer;
        }

        public void setCustomer(Customer customer) {
            this.customer = customer;
        }