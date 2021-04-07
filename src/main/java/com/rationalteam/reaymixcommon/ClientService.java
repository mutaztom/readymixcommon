package com.rationalteam.reaymixcommon;

import java.io.Serializable;

public class ClientService implements Serializable {
    Integer id;
    String item;
	String code;
    String aritem;
    String describtion;
    String unit;
    Double unitprice=0.0;
    String supplier;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Double unitprice) {
        this.unitprice = unitprice;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getAritem() {
        return aritem;
    }

    public void setAritem(String aritem) {
        this.aritem = aritem;
    }
	public String getCode(){return code;}
	public void setCode(String cod){code=cod;}
}
