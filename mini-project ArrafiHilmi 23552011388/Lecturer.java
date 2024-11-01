package com.mycompany.library;
    public class Lecturer extends LibraryMember {
    private String kodeDosen;

    public Lecturer(String name, int memberId, String address, String kodeDosen) {
        super(name, memberId, address);
        this.kodeDosen = kodeDosen;
    }

    @Override
    public void borrowBook(Book book, int daysLate) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(getName() + " (Lecturer) telah mengambil: " + book.getTitle());
        } else {
            System.out.println("Maaf, " + book.getTitle() + " tidak tersedia.");
        }
        calculateFine(daysLate);
    }
}

