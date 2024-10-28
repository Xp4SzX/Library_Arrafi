package com.mycompany.library;

public abstract class LibraryMember {
    private String name;
    private int memberId;
    private String address;

    public LibraryMember(String name, int memberId, String address) {
        this.name = name;
        this.memberId = memberId;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    // Abstract method to borrow a book
    public abstract void borrowBook(Book book, int daysLate);

    // Method to calculate fine if the book is returned late
    protected void calculateFine(int daysLate) {
        if (daysLate > 0) {
            double fine = daysLate * 1000; // Assume Rp. 1000 per day
            System.out.println("Keterlambatan: Rp. " + fine);
        } else {
            System.out.println("Tidak ada keterlambatan.");
        }
    }
}
