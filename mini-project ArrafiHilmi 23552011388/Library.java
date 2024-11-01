package com.mycompany.library;
public class Library {

    public static void main(String[] args) {
        Book[] books = {
            new Book("The Great Gatsby", "F. Scott Fitzgerald", "Classic novel", 50000),
            new Book("1984", "George Orwell", "Dystopian novel", 45000)
        };

        LibraryMember student = new Student("Alice", 1001, "Jl. Merdeka", "S12345");
        LibraryMember lecturer = new Lecturer("Mr. Smith", 2001, "Jl. Pendidikan", "L1001");

        // Pinjam buku dan cek denda
        student.borrowBook(books[0], 3); // 3 hari terlambat
        lecturer.borrowBook(books[0], 0); // Buku sudah dipinjam, tidak terlambat
        lecturer.borrowBook(books[1], 5); // Pinjam buku "1984" terlambat 5 hari
    }
}