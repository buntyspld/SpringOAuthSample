package com.service.ordersservice.model;

public class Product {

    private long productId;
    private String productName;
    private String Category;
    private double productPrice;

    public Product(long productId, String productName, String category, double productPrice) {
        this.productId = productId;
        this.productName = productName;
        Category = category;
        this.productPrice = productPrice;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", Category='" + Category + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
