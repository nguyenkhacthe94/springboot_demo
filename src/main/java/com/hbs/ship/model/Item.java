package com.hbs.ship.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class Item {
    @Id
    private String itemId;
    private String itemName;
    private String unit;
    private Double weight;
    private Double height;
    private Double length;
    private Double width;
    private Boolean isFragile;
    private Boolean requiredCoolStorage;

    public Item() {
    }

    public Item(String itemId, String itemName, String unit, Double weight, Double height, Double length, Double width, Boolean isFragile, Boolean requiredCoolStorage) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.unit = unit;
        this.weight = weight;
        this.height = height;
        this.length = length;
        this.width = width;
        this.isFragile = isFragile;
        this.requiredCoolStorage = requiredCoolStorage;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Boolean getFragile() {
        return isFragile;
    }

    public void setFragile(Boolean fragile) {
        isFragile = fragile;
    }

    public Boolean getRequiredCoolStorage() {
        return requiredCoolStorage;
    }

    public void setRequiredCoolStorage(Boolean requiredCoolStorage) {
        this.requiredCoolStorage = requiredCoolStorage;
    }
}
