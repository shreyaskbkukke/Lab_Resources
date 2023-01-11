package com.example.pgrc3;

public class word {
    private String title;
    private String author;
    private String publisher;
    private String price;

    public word(String newTitle, String newAuthor, String newPublisher, String newPrice) {
        title = newTitle;
        author = newAuthor;
        publisher = newPublisher;
        price = newPrice;
    }

    //get title
    public String getTitle() {
        return title;
    }
    //Get author
    public String getAuthor() {
        return author;
    }
    //Get publisher
    public String getPublisher() {
        return publisher;
    }
    //Get price
    public String getPrice(){
        return price;
    }
}