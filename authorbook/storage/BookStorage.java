package homework.author.storage;

import homework.author.model.Book;

public class BookStorage {

    private Book[] books = new Book[10];
    private int size = 0;

    public void add(Book author) {
        if (size == books.length) {
            extend();
        }
        books[size++] = author;
    }

    private void extend() {
        Book[] tmp = new Book[books.length + 10];
        System.arraycopy(books, 0, tmp, 0, books.length);
        books = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public void searchByTitle(String keyword) {
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().contains(keyword)
                    || books[i].getDescription().contains(keyword)) {
                System.out.println(books[i]);
            }
        }
    }

    public void printBooksByPriceRange(int min, int max) {
        for (int i = 0; i < size; i++) {
            Book book = books[i];
            if (book.getPrice() >= min && book.getPrice() <= max) {
                System.out.println(book);
            }
        }
    }

    public boolean checkBookByTitleAndAuthorEmail(String title, String authorEmail) {
        for (int i = 0; i < size; i++) {
            Book book = books[i];
            if (book.getTitle().equals(title)
                    && book.getAuthor().getEmail().equals(authorEmail)) {
                return true;
            }
        }
        return false;
    }
}
