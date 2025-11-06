package c.oop2.practice;

public class Book {
    String title;
    String author;
    int price;
    String isbn;

    public Book(String title, String author) {
        this(title, author, 0, null);
    }

    public Book(String title, String author, int price) {
        this(title, author, price, null);
    }

    public Book(String title, String author, int price, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

    public void displayInfo() {
        displayInfo(false);
    }

    public void displayInfo(boolean detailed) {
        String info = title + " - 저자: " + author + ", 가격: " + price + "원";
        if (detailed && isbn != null) {
            info += ", ISBN: " + isbn;
        }
        System.out.println(info);
    }

    public void applyDiscount(int percent) {
        if(percent > 0 && percent <= 100)
            price -= price * percent / 100;
    }

    public void applyDiscount(int amount, boolean isPercent) {
        if(isPercent){
            applyDiscount(amount);
        } else {
            price -= amount;
        }
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }
}
