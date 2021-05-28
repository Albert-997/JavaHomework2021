package homework.author.model;

import java.util.Objects;

public class Book {

    private String title;
    private String description;
    private int count;
    private double price;
    private Author author;


    public Book(String title, String description, int count, double price, Author author) {
        this.title = title;
        this.description = description;
        this.count = count;
        this.price = price;
        this.author = author;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return count == book.count && Double.compare(book.price, price) == 0 && Objects.equals(title, book.title) && Objects.equals(description, book.description) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, count, price, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", count=" + count +
                ", price=" + price +
                ", author=" + author +
                '}';
    }
}
