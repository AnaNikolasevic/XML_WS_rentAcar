package rent.model;


import javax.persistence.*;

import javax.persistence.Entity;

@Entity(name="request")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "status", nullable = false)
    private String status;

    //@OneToMany(mappedBy = "order_list", fetch = FetchType.LAZY)
    //public List<Order> orderList;

 /*   public Request(Long id, String status, List<Order> orderList) {
        this.id = id;
        this.status = status;
        this.orderList = orderList;
    }
*/
    public Request(Long id, String status) {
        this.id = id;
        this.status = status;
        //this.orderList = orderList;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

 /*   public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }*/
}
