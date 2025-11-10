package com.shop.manager;

import com.shop.utils.IdGenerator;

public class Product {
    private String id;
    private String name;
    private int price;
    private int stock;
    private String category;

    public Product(String name, int price, int stock, String category) {
        this.id = IdGenerator.getInstance().generateProductId();
        setName(name);
        setPrice(price);
        setStock(stock);
        setCategory(category);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        if(name == null || name == "") {
            throw new IllegalArgumentException("상품명은 필수입니다.");
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        if(price < 0) {
            throw new IllegalArgumentException("가격은 0 이상이어야 합니다.");
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
        if(stock < 0) {
            throw new IllegalArgumentException("재고는 0 이상이어야 합니다.");
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
        if(category == null || category == "") {
            throw new IllegalArgumentException("카테고리는 필수입니다.");
        }
    }

    public void decreaseStock(int quantity) {
        if(quantity > 0) {
            if(stock < quantity) {
                throw new IllegalArgumentException("재고가 부족합니다.");
            } else {
                stock -= quantity;
            }
        }
    }

    public void increaseStock(int quantity) {
        if(quantity > 0) {
            stock += quantity;
        }
    }

    public boolean isAvailable(int quantity) {
        return stock >= quantity;
    }
}
