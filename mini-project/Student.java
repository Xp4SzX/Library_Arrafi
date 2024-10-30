package com.mycompany.library;

public class Student extends LibraryMember {
    private String nim;

    public Student(String name, int memberId, String address, String nim) {
        super(name, memberId, address);
        this.nim = nim;
    }

    @Override
    public void borrowBook(Book book, int daysLate) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(getName() + " (Student) telah mengambil: " + book.getTitle());
        } else {
            System.out.println("Maaf, " + book.getTitle() + " tidak tersedia.");
        }
        calculateFine(daysLate);
    }
}
