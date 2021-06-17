package com.hbs.ship.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RequestLog {
    @Id
    private String requestId;
}
