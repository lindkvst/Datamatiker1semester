package Lesson06.Lesson;

public class Book {
    private String title;
    private String author;
    private int pages;
    private double price;
    private boolean isAvailable;


    //Konstruktør med alt
    public Book(String title, String author, int pages, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    //Konstruktør med title og author
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    //getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public double getPrice() {
        return price;
    }

    public boolean getAvailability() {
        return isAvailable;
    }

    //setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    //overskriver toString()
    @Override
    public String toString() {
        String result;
        if (!isAvailable) {
            result = "It's not currently available";
        } else {
            result = "It's available";
        }
        return String.format("Title: %s\n Author: %s\n Pages: %d\n Price: %.2f\n" + result, this.title, this.author, this.pages, this.price, this.isAvailable);
    }

}
