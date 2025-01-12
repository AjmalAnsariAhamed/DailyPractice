package com.OOPs;


import java.util.ArrayList;

public class Book {
    private int id;
    private String name;
    private String Author;
    private ArrayList<Reviews> reviews = new ArrayList<>();
public Book(int id, String name, String Author){
    this.id=id;
    this.name=name;
    this.Author=Author;
}
public void addReview(Reviews review){
    reviews.add(review);

}

    @Override
    public String toString() {
        return String.format("id=[ %d ], name=[%s], Author=[%s], Reviews=[%s]",id,name,Author,reviews);
    }
}
