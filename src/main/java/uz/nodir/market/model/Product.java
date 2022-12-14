package uz.nodir.market.model;

import java.util.Date;
import java.util.UUID;

public class Product {

    private UUID id;
    private int count;
    private String name;
    private Double price;
    private int stateId;
    private Date createdDate;

    public Product(){

    }
    public UUID getId() {
        return id;
    }

    public void setId() {
        this.id = UUID.randomUUID();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getStateId() {
        return stateId;
    }

    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    public String getState(){
        if (stateId == ProductState.WARNING.getStateId())
            return "productni srogi yaqinda tugaydi";
        else if (stateId == ProductState.DANGER.getStateId()) {
            return "productni srogi tugadi";
        }else return "product sveji";
    }
}
