package org.example;

public class ListSerial {
    private String name;
    private int rating;

    public ListSerial(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "ListSerials{name='" + name + "', rating=" + rating + "}";
    }
}
