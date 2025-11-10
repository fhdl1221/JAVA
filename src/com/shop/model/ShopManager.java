package com.shop.model;

import com.shop.manager.Order;
import com.shop.manager.Product;

public class ShopManager {
    private Product[] products;
    private int productCount;
    private Order[] orders;
    private int orderCount;

    public ShopManager() {
        products = new Product[50];
        productCount = 0;
        orders = new Order[50];
        orderCount = 0;
    }

    public void addProduct(Product product) {
        if(productCount > 50) {
            System.out.println("상품이 가득 찼습니다.");
            return;
        }
        products[productCount++] = product;
        System.out.println("[상품 등록] " + product.getName() + " - " + product.getPrice() + "원");
    }

    public Product findProductById(String id) {
        for(int i = 0; i < productCount; i++) {
            if(id == products[i].getId()) {
                return products[i];
            }
        }
        return null;
    }

    public Product[] searchProductsByName(String keyword) {
        Product[] temp = new Product[productCount];
        int count = 0;
        for(int i = 0; i < productCount; i++) {
            if(products[i].getName().toLowerCase().contains(keyword.toLowerCase())) {
                temp[count++] = products[i];
            }
        }

        Product[] result = new Product[count];
        for(int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public Product[] searchProductsByCategory(String category) {
        Product[] temp = new Product[productCount];
        int count = 0;
        for(int i = 0; i < productCount; i++) {
            if(products[i].getCategory().equals(category)) {
                temp[count++] = products[i];
            }
        }

        Product[] result = new Product[count];
        for(int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public void printAllProducts() {
        if(productCount == 0) {
            System.out.println("등록된 상품이 없습니다.");
            return;
        }
        for(int i = 0; i < productCount; i++) {
            Product product = products[i];
            System.out.println((i + 1) + ". [" + product.getId() + "] " + product.getName() + " - " + product.getPrice() + "원 (재고: " + product.getStock() + "개");
        }
    }

    public Order createOrder() {
        Order order = new Order();
        System.out.println("새로운 주문이 생성되었습니다.");
        return order;
    }

    public void addOrderItem(Order order, String productId, int quantity) {
        if(findProductById(productId) == null) {
            System.out.println("상품이 없습니다.");
            return;
        } else {
            Product product = findProductById(productId);
            if(!product.isAvailable(quantity)) {
                System.out.println("재고가 부족합니다.");
                return;
            }
            order.addItems(productId, quantity);
            System.out.println("[주문 항목 추가] " + product.getName() + " x " + quantity);
        }

    }

    public void processOrder(Order order) {
        order.calculateTotal(this);
        for(int i = 0; i < order.getItemCount(); i++) {
            String productId = order.getProductIds()[i];
            Product product = findProductById(productId);
            System.out.println("상품명: " + product.getName());
            System.out.println("수량:" + order.getQuantities()[i]);
            System.out.println("총 금액: " + product.getPrice() * order.getQuantities()[i]);
            product.decreaseStock(order.getQuantities()[i]);
        }
        order.complete();
        orders[orderCount++] = order;
        System.out.println("결제 완료");
    }

    public Order findOrderById(String orderId) {
        for(int i = 0; i < orderCount; i++) {
            if(orderId == orders[i].getOrderId()) {
                return orders[i];
            }
        }
        return null;
    }

    public void printAllOrders() {
        for(int i = 0; i < orderCount; i++) {
            Order order = orders[i];
            System.out.println((i+1) + ". [" + order.getOrderId() + "] " + order.getTotalAmount() + "원 (" + order.getStatus() + ")");
        }
    }
}
