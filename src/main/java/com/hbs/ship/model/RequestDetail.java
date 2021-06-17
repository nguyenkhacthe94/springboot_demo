package com.hbs.ship.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "request_details")
public class RequestDetail implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "request_id")
    private Request requestId;
    @Id
    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;
    private Double amount;

    public RequestDetail() {
    }

    public RequestDetail(Request requestId, Item item, Double amount) {
        this.requestId = requestId;
        this.item = item;
        this.amount = amount;
    }

    public Request getRequestId() {
        return requestId;
    }

    public void setRequestId(Request requestId) {
        this.requestId = requestId;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
