package com.mycompany.library;
public class Book {
    private String judul;
    private String penulis;
    private String deskripsi;
    private double harga;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author, String description, double price) {
        this.judul = title;
        this.penulis = author;
        this.deskripsi = description;
        this.harga = price;
        this.isAvailable = true; // Default: available when created
    }

    // Getters
    public String getTitle() {
        return judul;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    // Overridden toString() for displaying book details
    @Override
    public String toString() {
        return "Book{" +
                "Judul'" + judul + '\'' +
                ", Penulis='" + penulis + '\'' +
                ", Deskripsi='" + deskripsi + '\'' +
                ", Harga=" + harga +
                ", Ketersediaan=" + isAvailable +
                '}';
    }
}

