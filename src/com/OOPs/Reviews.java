package com.OOPs;

public class Reviews {
    private int id;
    private String description;
    private int rating;

    public Reviews(int id, String description, int rating) {
        this.id = id;
        this.description = description;
        this.rating = rating;
    }
    public String toString(){
        return String.format("review id: [%d], \n the description is: [%s], the rating of this book is: [%d] ",this.id,this.description,this.rating);
    }
}
