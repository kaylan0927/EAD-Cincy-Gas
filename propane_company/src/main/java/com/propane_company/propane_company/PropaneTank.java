package com.propane_company.propane_company;

import jakarta.persistence.*;

import java.sql.Date;


@Entity
public class PropaneTank {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer propaneTankId;

    @ManyToOne
    @JoinColumn(name="order_id")
    private Order order;

    private Date deliveryDate;
    private String deliveryStatus;

    public void getPropaneTankId(Integer propaneTankId) {
        this.propaneTankId = propaneTankId;
    }

    public Integer getPropaneTankId(){
        return this.propaneTankId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }
}
