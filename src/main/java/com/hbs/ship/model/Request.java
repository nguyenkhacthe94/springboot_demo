package com.hbs.ship.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "requests")
public class Request {
    @Id
    private String requestId;
    private LocalDate requestDate;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer requestedCustomer;
    private String requestStatus;
    @ManyToOne
    @JoinColumn(name = "shipper_id")
    private Shipper receivedShipper;
    private String fromAddress;
    private String fromDistrict;
    private String fromProvince;
    private String toAddress;
    private String toDistrict;
    private String toProvince;

    public Request() {
    }

    public Request(String requestId, LocalDate requestDate, Customer requestedCustomer, String requestStatus, Shipper receivedShipper, String fromAddress, String fromDistrict, String fromProvince, String toAddress, String toDistrict, String toProvince) {
        this.requestId = requestId;
        this.requestDate = requestDate;
        this.requestedCustomer = requestedCustomer;
        this.requestStatus = requestStatus;
        this.receivedShipper = receivedShipper;
        this.fromAddress = fromAddress;
        this.fromDistrict = fromDistrict;
        this.fromProvince = fromProvince;
        this.toAddress = toAddress;
        this.toDistrict = toDistrict;
        this.toProvince = toProvince;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }

    public Customer getRequestedCustomer() {
        return requestedCustomer;
    }

    public void setRequestedCustomer(Customer requestedCustomer) {
        this.requestedCustomer = requestedCustomer;
    }

    public String getRequestStatus() {
        return requestStatus;
    }

    public void setRequestStatus(String requestStatus) {
        this.requestStatus = requestStatus;
    }

    public Shipper getReceivedShipper() {
        return receivedShipper;
    }

    public void setReceivedShipper(Shipper receivedShipper) {
        this.receivedShipper = receivedShipper;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getFromDistrict() {
        return fromDistrict;
    }

    public void setFromDistrict(String fromDistrict) {
        this.fromDistrict = fromDistrict;
    }

    public String getFromProvince() {
        return fromProvince;
    }

    public void setFromProvince(String fromProvince) {
        this.fromProvince = fromProvince;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getToDistrict() {
        return toDistrict;
    }

    public void setToDistrict(String toDistrict) {
        this.toDistrict = toDistrict;
    }

    public String getToProvince() {
        return toProvince;
    }

    public void setToProvince(String toProvince) {
        this.toProvince = toProvince;
    }
}
