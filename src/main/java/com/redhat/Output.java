package com.redhat;

/**
 * Output
 */
public class Output {

    private String productName;
    private int price;

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }
    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }
    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }
    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }
}