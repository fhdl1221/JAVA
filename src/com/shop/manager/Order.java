package com.shop.manager;

import com.shop.model.ShopManager;
import com.shop.utils.IdGenerator;

public class Order {
    private String orderId;
    private String[] productIds;
    private int[] quantities;
    private int itemCount;
    private int totalAmount;
    private String status;

    public Order() {
        this.orderId = IdGenerator.getInstance().generateOrderId();
        this.productIds = new String[10];
        this.quantities = new int[10];
        this.itemCount = 0;
        this.totalAmount = 0;
        this.status = "결제대기";
    }

    public String getOrderId() {
        return orderId;
    }

    public String[] getProductIds() {
        return productIds;
    }

    public int[] getQuantities() {
        return quantities;
    }

    public int getItemCount() {
        return itemCount;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void addItems(String productId, int quantity) {
        if(itemCount >= 10) {
            System.out.println("상품이 가득 찼습니다.");
            return;
        }
        if(quantity >= 1) {
            productIds[itemCount] = productId;
            quantities[itemCount] = quantity;
            itemCount++;
        }
    }

    public void calculateTotal(ShopManager manager) {
        totalAmount = 0;
        for(int i = 0; i < itemCount; i++) {
            Product product = manager.findProductById(productIds[i]);
            totalAmount += product.getPrice() * quantities[i];
        }
    }

    public void complete() {
        status = "결제완료";
    }
}
