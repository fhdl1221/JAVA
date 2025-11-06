package c.oop2.practice;

public class Library {
    int bookCount;
    Book[] books;

    public Library(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }

    public void addBook(Book book) {
        if(bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("더 이상 책을 추가할 수 없습니다.");
        }
    }

    public void addBook(String title, String author) {
        addBook(new Book(title, author));
    }

    public void addBook(String title, String author, int price) {
        addBook(new Book(title, author, price));
    }

    public void displayAllBooks() {
        for(int i = 0; i < bookCount; i++) {
            System.out.println((i + 1) + ". ");
            books[i].displayInfo();
        }
    }

    public void searchByTitle(String keyword) {
        for(int i = 0; i < bookCount; i++) {
            boolean check = books[i].getTitle().toLowerCase().contains(keyword.toLowerCase());

            if(check) {
                books[i].displayInfo();
            }
        }
    }

    public void searchByAuthor(String keyword) {
        for(int i = 0; i < bookCount; i++) {
            boolean check = books[i].getAuthor().toLowerCase().contains(keyword.toLowerCase());
            if(check) {
                books[i].displayInfo();
            }
        }
    }

    public int getTotalPrice() {
        int sum = 0;
        for(int i = 0; i < bookCount; i++) {
            sum += books[i].getPrice();
        }
        return sum;
    }

    public int getAveragePrice() {
        if(bookCount == 0) {
            return 0;
        }
        return getTotalPrice() / bookCount;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void applyDiscountToAll(int percent) {
        for(int i = 0; i < bookCount; i++) {
            books[i].applyDiscount(percent);
        }
    }
}
